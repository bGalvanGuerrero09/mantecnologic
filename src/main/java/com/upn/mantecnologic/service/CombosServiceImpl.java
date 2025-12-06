package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.mappers.EquipoMapper;
import com.upn.mantecnologic.model.*;
import com.upn.mantecnologic.repository.CombosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CombosServiceImpl implements CombosService {

    private final CombosRepository combosRepository;;

    @Override
    public List<TipoEquipo> comboTipoEquipo() {return combosRepository.comboTipoEquipo();}

    @Override
    public List<MarcaEquipo> comboMarca() {
        return combosRepository.comboMarca();
    }

    @Override
    public List<ModeloEquipo> comboModelo() {
        return combosRepository.comboModelo();
    }

    @Override
    public List<EstadoPlan> comboEstadoPlan() {
        return combosRepository.comboEstadoPlan();
    }

    @Override
    public List<EstadoMantenimiento> comboEstadoDetalle() {
        return combosRepository.comboEstadoDetalle();
    }

    @Override
    public List<EstadoEquipo> comboEstadoEquipo() {
        return combosRepository.comboEstadoEquipo();
    }

    @Override
    public List<TipoPlan> comboTipoPlan() {
        return combosRepository.comboTipoPlan();
    }

    @Override
    public List<SedeCliente> comboSede(Integer idCliente) {
        return combosRepository.comboSede(idCliente);
    }

    @Override
    public List<Trabajador> comboTrabajador() {
        return combosRepository.comboTrabajador();
    }

    @Override
    public List<Cliente> comboCliente() { return combosRepository.comboCliente(); }

    @Override
    public List<Equipo> comboEquipo() {
        return combosRepository.comboEquipo();
    }
}
