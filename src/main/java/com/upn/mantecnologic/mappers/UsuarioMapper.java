package com.upn.mantecnologic.mappers;

import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.TipoEquipoDTO;
import com.upn.mantecnologic.dtos.UsuarioDTO;
import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.model.TipoEquipo;
import com.upn.mantecnologic.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioMapper instancia = Mappers.getMapper(UsuarioMapper.class);
    UsuarioDTO usuarioAUsuarioDTO(Usuario usuario);
    Usuario usuarioDTOAUsuario(UsuarioDTO usuarioDTO);
}
