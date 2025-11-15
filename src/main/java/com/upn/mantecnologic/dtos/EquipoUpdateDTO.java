package com.upn.mantecnologic.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EquipoUpdateDTO {
    private Integer id_equipo;
    private String dsc_equipo;
    private String num_serie;
    private int idTipo;
    private int idModelo;
    private int idSede;
    private String dsc_ubicacion;
    private int idEstado;
    private Integer num_dias_mantenimiento;
    private Date fch_ult_mantenimiento;
    private String flg_necesita_mant;
    private String dsc_observacion;
}
