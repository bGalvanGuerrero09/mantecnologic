package com.upn.mantecnologic.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tb_plan_equipo")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PlanMantenimientoEquipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item")
    public Integer id_item;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false)
    public PlanMantenimiento plan;

    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    public Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    public EstadoMantenimiento estado;

    @Column(name="imp_total",scale=2,nullable=false)
    public BigDecimal imp_total;

    @Column(name ="fch_fin_atencion")
    @Temporal(value=TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    public Date fch_fin_atencion;

    @Column(name ="dsc_sugerencia",length = 1000)
    public String dsc_sugerencia;

    @Column(name ="flg_observacion",length = 2)
    public String flg_observacion;

    @Column(name ="dsc_observacion",length = 1000)
    public String dsc_observacion;
}
