package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.UsuarioDTO;
import com.upn.mantecnologic.mappers.EquipoMapper;
import com.upn.mantecnologic.mappers.UsuarioMapper;
import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.model.SedeCliente;
import com.upn.mantecnologic.model.Usuario;
import com.upn.mantecnologic.repository.TipoEquipoRepository;
import com.upn.mantecnologic.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl  implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDTO obtenerUsuarioPorId(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.map(UsuarioMapper.instancia::usuarioAUsuarioDTO).orElse(null);
    }

    @Override
    public UsuarioDTO login(String usuario, String clave) {
        Optional<Usuario> usuario2 = usuarioRepository.login(usuario, clave);
        return usuario2.map(UsuarioMapper.instancia::usuarioAUsuarioDTO).orElse(null);
    }


}
