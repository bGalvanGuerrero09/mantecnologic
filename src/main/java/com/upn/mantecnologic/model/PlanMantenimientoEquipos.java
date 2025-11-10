package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tb_plan_equipo")
@Data
@Getter
@Setter
public class PlanMantenimientoEquipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item")
    private Integer id_item;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false)
    private PlanMantenimiento id_plan;

    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipo equipos;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private EstadoMantenimiento estado;

    @Column(name="imp_total",scale=2,nullable=false)
    private BigDecimal imp_total;

    @Column(name ="fch_fin_atencion")
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    private Date fch_fin_atencion;

    @Column(name ="dsc_sugerencia",length = 1000)
    private String dsc_sugerencia;

    @Column(name ="flg_observacion",length = 2)
    private String flg_observacion;

    @Column(name ="dsc_observacion",length = 1000)
    private String dsc_observacion;
}
