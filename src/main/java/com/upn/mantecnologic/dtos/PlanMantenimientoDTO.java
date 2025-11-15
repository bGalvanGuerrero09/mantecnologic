package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
public class PlanMantenimientoDTO {
    private Integer id_plan;
    private String dsc_plan;
    private TipoPlan tipo;
    private Date fch_minima;
    private Date fch_maxima;
    private EstadoPlan estado;
    private SedeCliente sede;
    private BigDecimal imp_total;
    private Trabajador trabajador;
    private Usuario usuario;
    private Date fch_fin_atencion;
    private Date fch_registro;

}
