package com.upn.mantecnologic.repository;

import com.upn.mantecnologic.model.PlanMantenimiento;
import com.upn.mantecnologic.model.SedeCliente;
import com.upn.mantecnologic.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SedeClienteRepository  extends JpaRepository<SedeCliente,Integer> {
    @Query(value = "SELECT * FROM tb_sede_cliente WHERE id_cliente = :id_cliente order by dsc_sede asc",nativeQuery = true)
    List<SedeCliente> listarSedesxCliente(@Param("id_cliente") Integer idCliente);
}
