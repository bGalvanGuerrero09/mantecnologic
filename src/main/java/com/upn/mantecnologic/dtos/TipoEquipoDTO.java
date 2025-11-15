package com.upn.mantecnologic.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TipoEquipoDTO {
    private Integer id_tipo;
    private String dsc_tipo;
    private BigDecimal imp_costo_preventivo;
    private BigDecimal imp_costo_correctivo;
}
