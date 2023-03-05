package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    Usuario getUsuario(Long id);

    List<Usuario> getUsuarios();

    void eliminarUsuario(Long id);

    void registraUsuario(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
