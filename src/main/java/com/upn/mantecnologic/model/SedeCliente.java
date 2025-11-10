package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_sede_cliente")
@Data
@Getter
@Setter

public class SedeCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_sede")
    private Integer id_cliente;

    @Column(name ="dsc_sede",length = 200,nullable = false)
    private String dsc_cliente;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @Column(name ="dsc_direccion",length = 50,nullable = false)
    private String dsc_documento;
}
