package com.upn.mantecnologic.mappers;
import org.mapstruct.Mapper;
import com.upn.mantecnologic.dtos.EquipoCreateDTO;
import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.EquipoUpdateDTO;
import com.upn.mantecnologic.model.Equipo;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipoMapper {
    EquipoMapper instancia = Mappers.getMapper(EquipoMapper.class);

    EquipoDTO equipoAEquipoDTO(Equipo equipo);
    Equipo equipoDTOAEquipo(EquipoDTO equipoDTO);
    Equipo equipoCreateDTOToEquipo(EquipoCreateDTO equipoCreateDTO);
    Equipo equipoUpdateDTOToEquipo(EquipoUpdateDTO equipoUpdateDTO);

    List<EquipoDTO> listaEquipoAListaEquipoDTO(List<Equipo> listaEquipo);
}
