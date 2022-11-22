package com.example.practicapia1.service;

import com.example.practicapia1.entity.Usuario;
import com.example.practicapia1.repository.usuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {
    @Autowired
    private usuariosRepository usuariosrepo;

    public Usuario insertar(Usuario emp) {
        return usuariosrepo.save(emp);
    }
    public Usuario actualizar(Usuario emp){
        return usuariosrepo.save(emp);
    }
    public List<Usuario> listar(){
        return usuariosrepo.findAll();
    }
    public void eliminar(Usuario emp){
        usuariosrepo.delete(emp);
    }
}
