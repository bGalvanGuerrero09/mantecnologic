package com.upn.mantecnologic.controller;

import com.upn.mantecnologic.dtos.FiltroPlanDTO;
import com.upn.mantecnologic.dtos.PlanMantenimientoDTO;
import com.upn.mantecnologic.dtos.PlanMantenimientoEquiposDTO;
import com.upn.mantecnologic.model.PlanMantenimientoEquipos;
import com.upn.mantecnologic.service.PlanMantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PlanMantenimientoController {
    @Autowired
    private PlanMantenimientoService planMantenimientoService;

    @GetMapping("listarPlanMantenimiento")
    public ResponseEntity<List<PlanMantenimientoDTO>> listarPlanMantenimiento(){
        return new ResponseEntity<>(planMantenimientoService.listarPlanMantenimiento(), HttpStatus.OK);
    }

    @PostMapping("listarPlanMantenimientoFiltro")
    public ResponseEntity<List<PlanMantenimientoDTO>> listarPlanMantenimientoFiltro( @RequestBody FiltroPlanDTO filtro) {
        return new ResponseEntity<>(
                planMantenimientoService.listarPlanMantenimientoFiltro(
                        filtro.getId_cliente(),
                        filtro.getId_sede(),
                        filtro.getFch_inicio(),
                        filtro.getFch_fin()
                ),
                HttpStatus.OK
        );
    }
    @GetMapping("listarPlanMantenimientoEquipo/{planId}")
    public ResponseEntity<List<PlanMantenimientoEquiposDTO>> listarPlanMantenimientoEquipos(@PathVariable Integer planId) {
        return ResponseEntity.ok(planMantenimientoService.listarPlanMantenimientoEquipos(planId));
    }


}
