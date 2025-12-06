package com.upn.mantecnologic.controller;

import com.upn.mantecnologic.model.*;
import com.upn.mantecnologic.service.CombosService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class ComboController {
    @Autowired
    private CombosService comboService;

    @GetMapping("comboTipoEquipo")
    public ResponseEntity<List<TipoEquipo>> comboTipoEquipo(){
        return new ResponseEntity<>(comboService.comboTipoEquipo(), HttpStatus.OK);
    }

    @GetMapping("comboCliente")
    public ResponseEntity<List<Cliente>> comboCliente(){
        return new ResponseEntity<>(comboService.comboCliente(), HttpStatus.OK);
    }

    @GetMapping("comboMarca")
    public ResponseEntity<List<MarcaEquipo>> comboMarca(){
        return new ResponseEntity<>(comboService.comboMarca(), HttpStatus.OK);
    }

    @GetMapping("comboEquipo")
    public ResponseEntity<List<Equipo>> comboEquipo(){
        return new ResponseEntity<>(comboService.comboEquipo(), HttpStatus.OK);
    }

    @GetMapping("comboEstadoEquipo")
    public ResponseEntity<List<EstadoEquipo>> comboEstadoEquipo(){
        return new ResponseEntity<>(comboService.comboEstadoEquipo(), HttpStatus.OK);
    }

    @GetMapping("comboEstadoPlan")
    public ResponseEntity<List<EstadoPlan>> comboEstadoPlan(){
        return new ResponseEntity<>(comboService.comboEstadoPlan(), HttpStatus.OK);
    }
    @GetMapping("comboEstadoDetalle")
    public ResponseEntity<List<EstadoMantenimiento>> comboEstadoDetalle(){
        return new ResponseEntity<>(comboService.comboEstadoDetalle(), HttpStatus.OK);
    }
    @GetMapping("comboModelo")
    public ResponseEntity<List<ModeloEquipo>> comboModelo(){
        return new ResponseEntity<>(comboService.comboModelo(), HttpStatus.OK);
    }
    @GetMapping("comboTrabajador")
    public ResponseEntity<List<Trabajador>> comboTrabajador(){
        return new ResponseEntity<>(comboService.comboTrabajador(), HttpStatus.OK);
    }
    @GetMapping("comboSede/{clienteId}")
    public ResponseEntity<List<SedeCliente>> comboSede(@PathVariable("clienteId") Integer clienteId){
        return new ResponseEntity<>(comboService.comboSede(clienteId), HttpStatus.OK);
    }
    @GetMapping("comboTipoPlan")
    public ResponseEntity<List<TipoPlan>> comboTipoPlan(){
        return new ResponseEntity<>(comboService.comboTipoPlan(), HttpStatus.OK);
    }

}
