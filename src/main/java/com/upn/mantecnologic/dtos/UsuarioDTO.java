package com.upn.mantecnologic.dtos;

import com.upn.mantecnologic.model.Cliente;
import com.upn.mantecnologic.model.Perfil;
import com.upn.mantecnologic.model.Trabajador;
import com.upn.mantecnologic.model.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    public Integer id_usuario;
    public String dsc_usuario;
    public String dsc_clave;
    public String dsc_alias;
    public Perfil perfil;
    public Trabajador trabajador;
    public Cliente cliente;
    public String dsc_correo;
    public String dsc_telefono;
    public String flg_inactivo;

}
