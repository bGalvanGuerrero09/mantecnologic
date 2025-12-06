package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.UsuarioDTO;

public interface UsuarioService {
    UsuarioDTO obtenerUsuarioPorId(Integer id);
    UsuarioDTO login(String usuario, String clave);
}
