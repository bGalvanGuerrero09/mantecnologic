package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.Equipo;
import com.upn.mantecnologic.model.EstadoMantenimiento;
import com.upn.mantecnologic.model.PlanMantenimiento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class PlanMantenimientoEquiposDTO {
    public Integer id_item;
    public PlanMantenimiento plan;
    public Equipo equipo;
    public EstadoMantenimiento estado;
    public BigDecimal imp_total;
    public Date fch_fin_atencion;
    public String dsc_sugerencia;
    public String flg_observacion;
    public String dsc_observacion;

}
