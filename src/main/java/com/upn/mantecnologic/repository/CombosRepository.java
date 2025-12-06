package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface CombosRepository  extends JpaRepository<Combos,Integer> {

    @Query(value = "SELECT * FROM tb_tipo_equipo order by dsc_tipo asc",nativeQuery = true)
    List<TipoEquipo> comboTipoEquipo();

    @Query(value ="SELECT * FROM tb_marca_equipo order by dsc_marca asc",nativeQuery = true)
    List<MarcaEquipo> comboMarca();

    @Query(value ="SELECT * FROM tb_modelo_equipo order by dsc_modelo asc",nativeQuery = true)
    List<ModeloEquipo> comboModelo();

    @Query(value ="SELECT * FROM tb_estado_plan",nativeQuery = true)
    List<EstadoPlan> comboEstadoPlan();

    @Query(value ="SELECT * FROM tb_estado_mantenimiento",nativeQuery = true)
    List<EstadoMantenimiento> comboEstadoDetalle();

    @Query(value ="SELECT * FROM tb_estado_equipo ",nativeQuery = true)
    List<EstadoEquipo> comboEstadoEquipo();

    @Query(value ="SELECT * FROM tb_tipo_plan  order by dsc_tipo asc",nativeQuery = true)
    List<TipoPlan> comboTipoPlan();

    @Query(value ="SELECT * FROM tb_sede_cliente WHERE id_cliente = :idCliente  order by dsc_sede asc",nativeQuery = true)
    List<SedeCliente> comboSede(@Param("idCliente") Integer idCliente);

    @Query(value ="SELECT * FROM tb_trabajador  order by dsc_trabajador asc",nativeQuery = true)
    List<Trabajador> comboTrabajador();

    @Query(value ="SELECT * FROM tb_cliente  order by dsc_cliente asc",nativeQuery = true)
    List<Cliente> comboCliente();

    @Query(value ="SELECT * FROM tb_equipo  order by dsc_equipo asc",nativeQuery = true)
    List<Equipo> comboEquipo();

}