package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_estado_equipo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EstadoEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estado")
    private Integer id_estado;

    @Column(name ="dsc_estado",length = 200,nullable = false)
    private String dsc_estado;
}
