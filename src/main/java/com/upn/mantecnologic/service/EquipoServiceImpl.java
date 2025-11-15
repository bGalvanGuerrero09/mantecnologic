package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.EquipoCreateDTO;
import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.EquipoUpdateDTO;
import com.upn.mantecnologic.mappers.EquipoMapper;
import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.repository.EquipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoServiceImpl implements EquipoService {
    private final EquipoRepository equipoRepository;

    public EquipoServiceImpl(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @Override
    public List<EquipoDTO> listarEquipos() {
        return EquipoMapper.instancia.listaEquipoAListaEquipoDTO(equipoRepository.findAll());
    }

    @Override
    public EquipoDTO obtenerEquipoPorId(Integer id) {
        Optional<Equipo> equipo = equipoRepository.findById(id);
        return equipo.map(EquipoMapper.instancia::equipoAEquipoDTO).orElse(null);
    }

    @Override
    public EquipoDTO registrarEquipo(EquipoCreateDTO equipoCreateDTO) {
        Equipo equipo = EquipoMapper.instancia.equipoCreateDTOToEquipo(equipoCreateDTO);
        Equipo respuestaEntity = equipoRepository.save(equipo);
        return EquipoMapper.instancia.equipoAEquipoDTO(respuestaEntity);
    }

    @Override
    public EquipoDTO actualizarEquipo(EquipoUpdateDTO equipoUpdateDTO) {
        Equipo equipo = EquipoMapper.instancia.equipoUpdateDTOToEquipo(equipoUpdateDTO);
        Equipo respuestaEntity = equipoRepository.save(equipo);
        return EquipoMapper.instancia.equipoAEquipoDTO(respuestaEntity);
    }

    @Override
    public String eliminarEquipo(Integer id) {
        Optional<Equipo> equipoOptional = equipoRepository.findById(id);
        if (equipoOptional.isPresent()) {
            equipoRepository.delete(equipoOptional.get());
            return "Equipo Eliminado";
        } else {
            return "No se pudo realizar la eliminación";
        }
    }
}
