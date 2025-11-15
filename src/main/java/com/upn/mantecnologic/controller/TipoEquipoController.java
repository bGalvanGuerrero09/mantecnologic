package com.upn.mantecnologic.controller;

import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.TipoEquipoDTO;
import com.upn.mantecnologic.service.EquipoService;
import com.upn.mantecnologic.service.TipoEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TipoEquipoController {
    @Autowired
    private TipoEquipoService tipoequipoService;

    @GetMapping("listarTipoEquipo")
    public ResponseEntity<List<TipoEquipoDTO>> listarTipoEquipo(){
        return new ResponseEntity<>(tipoequipoService.listarTipoEquipo(), HttpStatus.OK);
    }
}
