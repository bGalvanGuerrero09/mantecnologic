package com.upn.mantecnologic.mappers;

import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.model.PlanMantenimiento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlanMantenimientoMapper {
    PlanMantenimientoMapper instancia = Mappers.getMapper(PlanMantenimientoMapper.class);

    List<PlanMantenimientoDTO> listaPlanMantenimientoAListaPlanMantenimientoDTO(List<PlanMantenimiento> listaPlanMantenimiento);
}
