package com.cursodsousa.libraryapi.service;

import com.cursodsousa.libraryapi.model.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserService {

    Usuario save(Usuario usuario);

    Optional<Usuario> getUserByUsername(String username);

    void delete(Usuario usuario);

    Usuario update(Usuario usuario);

    Page<Usuario> find(Usuario filter, Pageable pageRequest );

}
