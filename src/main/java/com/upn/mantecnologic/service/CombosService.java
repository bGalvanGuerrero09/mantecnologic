package com.upn.mantecnologic.service;

import com.upn.mantecnologic.model.*;

import java.util.List;

public interface CombosService {
    List<TipoEquipo> comboTipoEquipo();
    List<MarcaEquipo> comboMarca();
    List<ModeloEquipo> comboModelo();
    List<EstadoPlan> comboEstadoPlan();
    List<EstadoMantenimiento> comboEstadoDetalle();
    List<EstadoEquipo> comboEstadoEquipo();
    List<TipoPlan> comboTipoPlan();
    List<SedeCliente> comboSede(Integer idCliente);
    List<Trabajador> comboTrabajador();
    List<Cliente> comboCliente();
    List<Equipo> comboEquipo();
}
