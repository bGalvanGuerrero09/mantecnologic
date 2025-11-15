package com.upn.mantecnologic.controller;

import com.upn.mantecnologic.dtos.UsuarioDTO;
import com.upn.mantecnologic.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/obtenerUsuario/{usuarioId}")
    public ResponseEntity<UsuarioDTO> obtenerUsuario(@PathVariable("usuarioId") Integer usuarioId){
        return new ResponseEntity<>(usuarioService.obtenerUsuarioPorId(usuarioId), HttpStatus.OK);
    }

}
