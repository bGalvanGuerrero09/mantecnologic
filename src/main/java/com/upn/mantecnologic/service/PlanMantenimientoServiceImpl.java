package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.dtos.PlanMantenimientoEquiposDTO;
import com.upn.mantecnologic.mappers.EquipoMapper;
import com.upn.mantecnologic.mappers.PlanMantenimientoMapper;
import com.upn.mantecnologic.model.PlanMantenimiento;
import com.upn.mantecnologic.model.PlanMantenimientoEquipos;
import com.upn.mantecnologic.repository.EquipoRepository;
import com.upn.mantecnologic.repository.PlanMantenimientoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class PlanMantenimientoServiceImpl  implements PlanMantenimientoService {

    private final PlanMantenimientoRepository planMantenimientoRepository;

    public PlanMantenimientoServiceImpl(PlanMantenimientoRepository planMantenimientoRepository) {
        this.planMantenimientoRepository = planMantenimientoRepository;
    }

    @Override
    public List<PlanMantenimientoDTO> listarPlanMantenimiento() {
        return PlanMantenimientoMapper.instancia.listaPlanMantenimientoAListaPlanMantenimientoDTO(planMantenimientoRepository.findAll());
    }

    @Override
    public List<PlanMantenimientoEquiposDTO> listarPlanMantenimientoEquipos(Integer planId) {
        List<PlanMantenimientoEquipos> equipos = planMantenimientoRepository.findEquiposByPlanId(planId);
        return PlanMantenimientoMapper.instancia.listaPlanMantenimientoEquiposAListaPlanMantenimientoEquiposDTO(equipos);
    }

    @Override
    public List<PlanMantenimientoDTO> listarPlanMantenimientoFiltro(Integer idCliente, Integer idSede, String fechaInicio, String fechaFin ) {
        List<PlanMantenimiento> lista = planMantenimientoRepository.listarPorFiltro(idCliente, idSede, fechaInicio, fechaFin);

        return PlanMantenimientoMapper.instancia.listaPlanMantenimientoAListaPlanMantenimientoDTO(lista);
    }
}
