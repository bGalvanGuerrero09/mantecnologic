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
    public Integer id_equipo;

    @Column(name ="dsc_equipo",length = 200,nullable = false)
    public String dsc_equipo;

    @Column(name ="num_serie",length = 50,nullable = false)
    public String num_serie;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    public TipoEquipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_modelo", nullable = false)
    public ModeloEquipo modelo;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false)
    public SedeCliente sede;

    @Column(name ="dsc_ubicacion",length = 400,nullable = false)
    public String dsc_ubicacion;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    public EstadoEquipo estado;

    @Column(name ="num_dias_mantenimiento")
    public Integer num_dias_mantenimiento;

    @Column(name ="fch_ult_mantenimiento",nullable=false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    public Date fch_ult_mantenimiento;

    @Column(name ="flg_necesita_mant",length = 2)
    public String flg_necesita_mant;

    @Column(name ="dsc_observacion",length = 400)
    public String dsc_observacion;
}
