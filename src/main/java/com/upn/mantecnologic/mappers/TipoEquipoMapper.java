package com.upn.mantecnologic.mappers;

import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.TipoEquipoDTO;
import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.model.TipoEquipo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoEquipoMapper {
    TipoEquipoMapper instancia = Mappers.getMapper(TipoEquipoMapper.class);

    List<TipoEquipoDTO> listaTipoEquipoAListaTipoEquipoDTO(List<TipoEquipo> listaTipoEquipo);
}
