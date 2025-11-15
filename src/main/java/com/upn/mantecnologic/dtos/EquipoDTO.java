package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.EstadoEquipo;
import com.upn.mantecnologic.model.ModeloEquipo;
import com.upn.mantecnologic.model.SedeCliente;
import com.upn.mantecnologic.model.TipoEquipo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EquipoDTO {
    private Integer id_equipo;
    private String dsc_equipo;
    private String num_serie;
    private TipoEquipo tipo;
    private ModeloEquipo modelo;
    private SedeCliente sede;
    private String dsc_ubicacion;
    private EstadoEquipo estado;
    private Integer num_dias_mantenimiento;
    private Date fch_ult_mantenimiento;
    private String flg_necesita_mant;
    private String dsc_observacion;

}
