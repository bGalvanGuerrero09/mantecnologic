package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.model.PlanMantenimientoEquipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
    @Query(value = "SELECT e.* FROM tb_equipo e JOIN tb_sede_cliente s ON e.id_sede = s.id_sede  WHERE s.id_cliente = :id_cliente AND (:id_sede = 0 OR s.id_sede = :id_sede)  order by e.dsc_equipo asc", nativeQuery = true)
    List<Equipo> listarPorClienteYSede(@Param("id_cliente") Integer id_cliente, @Param("id_sede") Integer id_sede);
}
