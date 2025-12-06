package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.dtos.SedeClienteCreateDTO;
import com.upn.mantecnologic.dtos.SedeClienteDTO;
import com.upn.mantecnologic.dtos.SedeClienteUpdateDTO;
import com.upn.mantecnologic.mappers.PlanMantenimientoMapper;
import com.upn.mantecnologic.mappers.SedeClienteMapper;
import com.upn.mantecnologic.model.PlanMantenimiento;
import com.upn.mantecnologic.model.SedeCliente;
import com.upn.mantecnologic.repository.SedeClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeClienteServiceImpl implements SedeClienteService {
    private final SedeClienteRepository sedeClienteRepository;

    public SedeClienteServiceImpl(SedeClienteRepository sedeClienteRepository) {
        this.sedeClienteRepository = sedeClienteRepository;
    }

    @Override
    public List<SedeClienteDTO> listarSedes() {
        return SedeClienteMapper.instancia.listaSedeClienteAListaSedeClienteDTO(sedeClienteRepository.findAll());
    }

    @Override
    public SedeClienteDTO obtenerSedePorId(Integer id) {
        Optional<SedeCliente> sedeCliente = sedeClienteRepository.findById(id);
        return sedeCliente.map(SedeClienteMapper.instancia::sedeClienteASedeClienteDTO).orElse(null);
    }

    @Override
    public SedeClienteDTO registrarSede(SedeClienteCreateDTO sedeClienteCreateDTO) {
        SedeCliente sedeCliente = SedeClienteMapper.instancia.sedeClienteCreateDTOToSedeCliente(sedeClienteCreateDTO);
        SedeCliente respuestaEntity = sedeClienteRepository.save(sedeCliente);
        return SedeClienteMapper.instancia.sedeClienteASedeClienteDTO(respuestaEntity);
    }

    @Override
    public SedeClienteDTO actualizarSede(SedeClienteUpdateDTO sedeClienteUpdateDTO) {
        SedeCliente sedeCliente = SedeClienteMapper.instancia.sedeClienteUpdateDTOToSedeCliente(sedeClienteUpdateDTO);
        SedeCliente respuestaEntity = sedeClienteRepository.save(sedeCliente);
        return SedeClienteMapper.instancia.sedeClienteASedeClienteDTO(respuestaEntity);
    }

    @Override
    public String eliminarSede(Integer id) {
        Optional<SedeCliente> sedeClienteOptional = sedeClienteRepository.findById(id);
        if (sedeClienteOptional.isPresent()) {
            sedeClienteRepository.delete(sedeClienteOptional.get());
            return "SedeCliente Eliminada";
        } else {
            return "No se pudo realizar la eliminación";
        }
    }

    @Override
    public List<SedeClienteDTO> listarSedesxCliente(Integer idCliente) {
        List<SedeCliente> lista = sedeClienteRepository.listarSedesxCliente(idCliente);

        return SedeClienteMapper.instancia.listaSedeClienteAListaSedeClienteDTO(lista);
    }
}
