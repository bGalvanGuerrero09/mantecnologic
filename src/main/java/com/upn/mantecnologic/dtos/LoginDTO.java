package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.Cliente;
import com.upn.mantecnologic.model.Perfil;
import com.upn.mantecnologic.model.Trabajador;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    public String dsc_usuario;
    public String dsc_clave;
}
