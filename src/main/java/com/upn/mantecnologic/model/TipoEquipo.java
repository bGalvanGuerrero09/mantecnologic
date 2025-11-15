package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="tb_tipo_equipo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TipoEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo")
    private Integer id_tipo;

    @Column(name ="dsc_tipo",length = 200,nullable = false)
    private String dsc_tipo;

    @Column(name ="imp_costo_preventivo",scale = 2,nullable = false)
    private BigDecimal imp_costo_preventivo;

    @Column(name ="imp_costo_correctivo",scale = 2,nullable = false)
    private BigDecimal imp_costo_correctivo;
}
