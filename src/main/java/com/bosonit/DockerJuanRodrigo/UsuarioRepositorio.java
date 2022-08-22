package com.bosonit.DockerJuanRodrigo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioEntity, Integer> {
    List<UsuarioEntity> findByUsuario(String nombre);
}