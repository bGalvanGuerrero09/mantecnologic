package com.upn.mantecnologic.controller;

import com.upn.mantecnologic.dtos.EquipoCreateDTO;
import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.EquipoUpdateDTO;
import com.upn.mantecnologic.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EquipoController {
    @Autowired
    private EquipoService equipoService;

    @GetMapping("listarEquipos")
    public ResponseEntity<List<EquipoDTO>> listarEquipos(){
        return new ResponseEntity<>(equipoService.listarEquipos(), HttpStatus.OK);
    }

    @GetMapping("/obtenerEquipo/{equipoId}")
    public ResponseEntity<EquipoDTO> obtenerEquipo(@PathVariable("equipoId") Integer equipoId){
        return new ResponseEntity<>(equipoService.obtenerEquipoPorId(equipoId), HttpStatus.OK);
    }

    @PostMapping("registrarEquipo")
    public ResponseEntity<EquipoDTO> registrarEquipo(@RequestBody EquipoCreateDTO equipoCreateDTO){
        return new ResponseEntity<>(equipoService.registrarEquipo(equipoCreateDTO), HttpStatus.OK);
    }

    @PutMapping("actualizarEquipo")
    public ResponseEntity<EquipoDTO> actualizarEquipo(@RequestBody EquipoUpdateDTO equipoUpdateDTO){
        return new ResponseEntity<>(equipoService.actualizarEquipo(equipoUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/eliminarEquipo/{equipoId}")
    public ResponseEntity<String> eliminarEquipo(@PathVariable("equipoId") Integer equipoId){
        return new ResponseEntity<>(equipoService.eliminarEquipo(equipoId), HttpStatus.OK);
    }
}
