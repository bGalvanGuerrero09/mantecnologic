package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tb_equipo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_equipo")
    private Integer id_equipo;

    @Column(name ="dsc_equipo",length = 200,nullable = false)
    private String dsc_equipo;

    @Column(name ="num_serie",length = 50,nullable = false)
    private String num_serie;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private TipoEquipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_modelo", nullable = false)
    private ModeloEquipo modelo;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false)
    private SedeCliente sede;

    @Column(name ="dsc_ubicacion",length = 400,nullable = false)
    private String dsc_ubicacion;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private EstadoEquipo estado;

    @Column(name ="num_dias_mantenimiento")
    private Integer num_dias_mantenimiento;

    @Column(name ="fch_ult_mantenimiento",nullable=false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date fch_ult_mantenimiento;

    @Column(name ="flg_necesita_mant",length = 2)
    private String flg_necesita_mant;

    @Column(name ="dsc_observacion",length = 400)
    private String dsc_observacion;
}
