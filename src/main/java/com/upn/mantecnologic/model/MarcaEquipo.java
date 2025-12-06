package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="tb_marca_equipo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MarcaEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_marca")
    public Integer id_marca;

    @Column(name ="dsc_marca",length = 200,nullable = false)
    public String dsc_marca;
}
