package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tb_estado_plan")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EstadoPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estado")
    public Integer id_estado;

    @Column(name ="dsc_estado",length = 200,nullable = false)
    public String dsc_estado;

}
