package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SedeClienteCreateDTO {
    public String dsc_sede;
    public Cliente cliente;
    public String dsc_direccion;
}
