package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_modelo_equipo")
@Data
@Getter
@Setter
public class ModeloEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_modelo")
    private Integer id_modelo;

    @Column(name ="dsc_modelo",length = 200,nullable = false)
    private String dsc_modelo;

    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false)
    private MarcaEquipo marca;

}
