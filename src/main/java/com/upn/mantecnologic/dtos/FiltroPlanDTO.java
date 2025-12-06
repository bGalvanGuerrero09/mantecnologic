package com.upn.mantecnologic.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FiltroPlanDTO {
    private Integer id_cliente;
    private Integer id_sede;
    private String fch_inicio; // o LocalDate
    private String fch_fin;    // o LocalDate
}
