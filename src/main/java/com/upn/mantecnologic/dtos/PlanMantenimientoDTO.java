package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
public class PlanMantenimientoDTO {
    public Integer id_plan;
    public String dsc_plan;
    public TipoPlan tipo;
    public Date fch_minima;
    public Date fch_maxima;
    public EstadoPlan estado;
    public SedeCliente sede;
    public BigDecimal imp_total;
    public Trabajador trabajador;
    public Usuario usuario;
    public Date fch_fin_atencion;
    public Date fch_registro;

}
