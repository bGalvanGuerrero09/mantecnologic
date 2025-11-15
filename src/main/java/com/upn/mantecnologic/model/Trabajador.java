package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_trabajador")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_trabajador")
    private Integer id_trabajador;

    @Column(name ="dsc_trabajador",length = 200,nullable = false)
    private String dsc_trabajador;

    @Column(name ="dsc_dni",length = 50,nullable = false)
    private String dsc_dni;

    @Column(name ="dsc_correo",length = 100,nullable = false)
    private String dsc_correo;

    @Column(name ="dsc_telefono",length = 100,nullable = false)
    private String dsc_telefono;

    @Column(name ="dsc_cargo",length = 100,nullable = false)
    private String dsc_cargo;
}
