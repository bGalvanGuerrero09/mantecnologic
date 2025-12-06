package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_sede_cliente")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SedeCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_sede")
    public Integer id_sede;

    @Column(name ="dsc_sede",length = 200,nullable = false)
    public String dsc_sede;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    public Cliente cliente;

    @Column(name ="dsc_direccion",length = 50,nullable = false)
    public String dsc_direccion;
}
