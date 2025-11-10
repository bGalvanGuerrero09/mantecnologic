package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_cliente")
@Data
@Getter
@Setter

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Integer id_cliente;

    @Column(name ="dsc_cliente",length = 200,nullable = false)
    private String dsc_cliente;

    @Column(name ="dsc_ruc",length = 50,nullable = false)
    private String dsc_ruc;

    @Column(name ="dsc_correo",length = 100,nullable = false)
    private String dsc_correo;

    @Column(name ="dsc_direccion",length = 100,nullable = false)
    private String dsc_direccion;

}
