package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_usuario")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_usuario")
     public Integer id_usuario;

     @Column(name ="dsc_usuario",length = 50,nullable = false)
     public String dsc_usuario;

    @Column(name ="dsc_clave",length = 50,nullable = false)
    public String dsc_clave;

    @Column(name ="dsc_alias",length = 200,nullable = false)
    public String dsc_alias;

    @ManyToOne
    @JoinColumn(name = "id_perfil", nullable = false)
    public Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "id_trabajador", nullable = true)
    public Trabajador trabajador;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = true)
    public Cliente cliente;

    @Column(name ="dsc_correo",length = 100)
    public String dsc_correo;

    @Column(name ="dsc_telefono",length = 100)
    public String dsc_telefono;

    @Column(name ="flg_inactivo",length = 2,nullable = false)
    public String flg_inactivo;

}
