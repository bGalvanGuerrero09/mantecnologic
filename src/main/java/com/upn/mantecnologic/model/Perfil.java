package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_perfil")
@Data
@Getter
@Setter
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_perfil")
    private Integer id_perfil;

    @Column(name ="dsc_perfil",length = 200,nullable = false)
    private String dsc_perfil;
}
