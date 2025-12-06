package com.upn.mantecnologic.controller;

import com.upn.mantecnologic.dtos.SedeClienteCreateDTO;
import com.upn.mantecnologic.dtos.SedeClienteDTO;
import com.upn.mantecnologic.dtos.SedeClienteUpdateDTO;
import com.upn.mantecnologic.service.SedeClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SedeClienteController {

    @Autowired
    private SedeClienteService sedeClienteService;

    @GetMapping("listarSedes")
    public ResponseEntity<List<SedeClienteDTO>> listarSedes() {
        return new ResponseEntity<>(sedeClienteService.listarSedes(), HttpStatus.OK);
    }

    @GetMapping("listarSedesxCliente/{id_cliente}")
    public ResponseEntity<List<SedeClienteDTO>> listarSedesxCliente(@PathVariable Integer id_cliente) {
        return new ResponseEntity<>(sedeClienteService.listarSedesxCliente(id_cliente), HttpStatus.OK);
    }

    @GetMapping("/obtenerSedePorId/{sedeId}")
    public ResponseEntity<SedeClienteDTO> obtenerSedePorId(@PathVariable("sedeId") Integer sedeId) {
        return new ResponseEntity<>(sedeClienteService.obtenerSedePorId(sedeId), HttpStatus.OK);
    }

    @PostMapping("registrarSede")
    public ResponseEntity<SedeClienteDTO> registrarSede(@RequestBody SedeClienteCreateDTO sedeClienteCreateDTO) {
        return new ResponseEntity<>(sedeClienteService.registrarSede(sedeClienteCreateDTO), HttpStatus.OK);
    }

    @PutMapping("actualizarSede")
    public ResponseEntity<SedeClienteDTO> actualizarSede(@RequestBody SedeClienteUpdateDTO sedeClienteUpdateDTO) {
        return new ResponseEntity<>(sedeClienteService.actualizarSede(sedeClienteUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("/eliminarSede/{sedeId}")
    public ResponseEntity<String> eliminarSede(@PathVariable("sedeId") Integer sedeId) {
        return new ResponseEntity<>(sedeClienteService.eliminarSede(sedeId), HttpStatus.OK);
    }
}
