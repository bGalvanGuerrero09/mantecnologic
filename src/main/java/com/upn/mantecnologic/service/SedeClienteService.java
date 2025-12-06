package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.dtos.SedeClienteCreateDTO;
import com.upn.mantecnologic.dtos.SedeClienteDTO;
import com.upn.mantecnologic.dtos.SedeClienteUpdateDTO;

import java.util.List;

public interface SedeClienteService {
    List<SedeClienteDTO> listarSedes();
    SedeClienteDTO obtenerSedePorId(Integer id);
    SedeClienteDTO registrarSede(SedeClienteCreateDTO sedeCreateDTO);
    SedeClienteDTO actualizarSede(SedeClienteUpdateDTO sedeUpdateDTO);
    String eliminarSede(Integer id);

    List<SedeClienteDTO> listarSedesxCliente(Integer id_cliente);
}
