package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.mappers.PlanMantenimientoMapper;
import com.upn.mantecnologic.repository.PlanMantenimientoRepository;
import org.springframework.stereotype.Service;

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
}
