package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_tipo_plan")
@Data
@Getter
@Setter
public class TipoPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo")
    private Integer id_tipo;

    @Column(name ="dsc_tipo",length = 200,nullable = false)
    private String dsc_tipo;
}
