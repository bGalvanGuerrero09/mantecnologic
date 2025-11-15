package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.EquipoCreateDTO;
import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.EquipoUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EquipoService   {
    List<EquipoDTO> listarEquipos();
    EquipoDTO obtenerEquipoPorId(Integer id);
    EquipoDTO registrarEquipo(EquipoCreateDTO equipoCreateDTO);
    EquipoDTO actualizarEquipo(EquipoUpdateDTO equipoUpdateDTO);
    String eliminarEquipo(Integer id);

}
