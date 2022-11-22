package com.example.practicapia1.repository;

import com.example.practicapia1.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuariosRepository extends JpaRepository<Usuario, Integer> {

}
