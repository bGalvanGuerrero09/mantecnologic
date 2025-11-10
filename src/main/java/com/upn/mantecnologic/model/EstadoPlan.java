package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_estado_plan")
@Data
@Getter
@Setter
public class EstadoPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estado")
    private Integer id_estado;

    @Column(name ="dsc_estado",length = 200,nullable = false)
    private String dsc_estado;

}
