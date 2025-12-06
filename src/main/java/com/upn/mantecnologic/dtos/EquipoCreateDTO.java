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
public class EquipoCreateDTO {
    private String dsc_equipo;
    private String num_serie;
    public TipoEquipo tipo;
    public ModeloEquipo modelo;
    public SedeCliente sede;
    private String dsc_ubicacion;
    public EstadoEquipo estado;
    private Integer num_dias_mantenimiento;
    private Date fch_ult_mantenimiento;
    private String flg_necesita_mant;
    private String dsc_observacion;

}
