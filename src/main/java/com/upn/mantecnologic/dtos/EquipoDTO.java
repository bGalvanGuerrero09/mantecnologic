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
    public Integer id_equipo;
    public String dsc_equipo;
    public String num_serie;
    public TipoEquipo tipo;
    public ModeloEquipo modelo;
    public SedeCliente sede;
    public String dsc_ubicacion;
    public EstadoEquipo estado;
    public Integer num_dias_mantenimiento;
    public Date fch_ult_mantenimiento;
    public String flg_necesita_mant;
    public String dsc_observacion;

}
