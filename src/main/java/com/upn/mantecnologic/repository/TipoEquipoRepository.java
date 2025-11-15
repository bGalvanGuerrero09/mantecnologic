package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.model.TipoEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEquipoRepository extends JpaRepository<TipoEquipo,Integer> {
}
