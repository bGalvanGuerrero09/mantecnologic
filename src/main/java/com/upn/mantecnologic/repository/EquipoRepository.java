package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
}
