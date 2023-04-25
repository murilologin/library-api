package com.cursodsousa.libraryapi.model.repository;

import com.cursodsousa.libraryapi.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<Usuario, String> {
    Usuario findByUsername(String username);

    boolean existsByUsername(String username);

    Optional<Usuario> findByEmail(String email);
}
