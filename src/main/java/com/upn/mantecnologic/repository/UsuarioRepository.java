package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.model.TipoEquipo;
import com.upn.mantecnologic.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
