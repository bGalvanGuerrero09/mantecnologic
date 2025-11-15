package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_tipo_plan")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TipoPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo")
    private Integer id_tipo;

    @Column(name ="dsc_tipo",length = 200,nullable = false)
    private String dsc_tipo;
}
