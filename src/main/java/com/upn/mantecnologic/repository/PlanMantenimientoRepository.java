package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.dtos.PlanMantenimientoEquiposDTO;
import com.upn.mantecnologic.model.PlanMantenimiento;
import com.upn.mantecnologic.model.PlanMantenimientoEquipos;
import com.upn.mantecnologic.model.TipoEquipo;
import com.upn.mantecnologic.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlanMantenimientoRepository  extends JpaRepository<PlanMantenimiento,Integer> {

    @Query(value = "SELECT * FROM tb_plan_equipo WHERE id_plan = :id_plan", nativeQuery = true)
    List<PlanMantenimientoEquipos> findEquiposByPlanId(@Param("id_plan") Integer id_plan);

    @Query(value = "SELECT p.* FROM tb_plan p JOIN tb_sede_cliente s ON p.id_sede = s.id_sede WHERE s.id_cliente = :id_cliente AND (:id_sede = 0 OR s.id_sede = :id_sede) AND p.fch_minima BETWEEN CAST(:fch_inicio AS DATE) AND CAST(:fch_fin AS DATE)  order by fch_minima desc", nativeQuery = true)
    List<PlanMantenimiento> listarPorFiltro(@Param("id_cliente") Integer idCliente, @Param("id_sede") Integer idSede,@Param("fch_inicio") String fechaInicio,@Param("fch_fin") String fechaFin);
}
