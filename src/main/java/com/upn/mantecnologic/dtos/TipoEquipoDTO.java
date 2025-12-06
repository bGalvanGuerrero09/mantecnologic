package com.upn.mantecnologic.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TipoEquipoDTO {
    public Integer id_tipo;
    public String dsc_tipo;
    public BigDecimal imp_costo_preventivo;
    public BigDecimal imp_costo_correctivo;
}
