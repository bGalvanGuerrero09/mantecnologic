package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.Cliente;
import com.upn.mantecnologic.model.Perfil;
import com.upn.mantecnologic.model.Trabajador;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private Integer id_usuario;
    private String dsc_usuario;
    private String dsc_clave;
    private String dsc_alias;
    private Perfil perfil;
    private Trabajador trabajador;
    private Cliente cliente;
    private String dsc_correo;
    private String dsc_telefono;
    private String flg_inactivo;
}
