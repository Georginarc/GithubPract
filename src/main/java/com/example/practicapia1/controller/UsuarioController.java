package com.example.practicapia1.controller;

import com.example.practicapia1.entity.Usuario;
import com.example.practicapia1.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping
    public List<Usuario> listar(){
        return usuariosService.listar();
    }

    @PostMapping
    public Usuario insertar(@RequestBody Usuario emp){
        return usuariosService.insertar(emp);
    }

    @PutMapping
    public Usuario actualizar(@RequestBody Usuario emp){
        return usuariosService.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Usuario emp){
        usuariosService.eliminar(emp);
    }
}
