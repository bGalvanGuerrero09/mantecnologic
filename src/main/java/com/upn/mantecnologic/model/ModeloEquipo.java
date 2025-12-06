package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_modelo_equipo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ModeloEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_modelo")
    public Integer id_modelo;

    @Column(name ="dsc_modelo",length = 200,nullable = false)
    public String dsc_modelo;

    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false)
    public MarcaEquipo marca;

}
