package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tb_plan")
@Data
@Getter
@Setter
public class PlanMantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_plan")
    private Integer id_plan;

    @Column(name ="dsc_plan",length = 200,nullable = false)
    private String dsc_plan;

    @ManyToOne
    @JoinColumn(name = "id_tipo_plan", nullable = false)
    private TipoPlan tipo;

    @Column(name ="fch_minima",nullable=false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date fch_minima;

    @Column(name ="fch_maxima",nullable=false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date fch_maxima;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private EstadoPlan estado;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false)
    private SedeCliente sede;

    @Column(name="imp_total",scale=2,nullable=false)
    private BigDecimal imp_total;

    @ManyToOne
    @JoinColumn(name = "id_trabajador", nullable = true)
    private Trabajador trabajador;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name ="fch_fin_atencion")
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date fch_fin_atencion;

    @Column(name ="fch_registro",nullable=false)
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date fch_registro;
}
