package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.dtos.PlanMantenimientoEquiposDTO;

import java.time.LocalDate;
import java.util.List;

public interface PlanMantenimientoService {
    List<PlanMantenimientoDTO> listarPlanMantenimiento();
    List<PlanMantenimientoEquiposDTO> listarPlanMantenimientoEquipos(Integer planId);
    List<PlanMantenimientoDTO> listarPlanMantenimientoFiltro(Integer id_cliente,Integer id_sede,String fechaInicio, String fechaFin);
}
