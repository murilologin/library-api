package com.cursodsousa.libraryapi.service.impl;

import com.cursodsousa.libraryapi.exception.BusinessException;
import com.cursodsousa.libraryapi.model.entity.Usuario;
import com.cursodsousa.libraryapi.model.repository.UserRepository;
import com.cursodsousa.libraryapi.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @Override
    public Usuario save(Usuario usuario) {
        if (repository.existsByUsername(usuario.getUsername())) {
            throw new BusinessException("Usuário já cadastrado");
        }
        return repository.save(usuario);
    }

    @Override
    public Optional<Usuario> getUserByUsername(String username) {
        return Optional.of(repository.findByUsername(username));
    }

    @Override
    public void delete(Usuario usuario) {
        repository.delete(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public Page<Usuario> find(Usuario filter, Pageable pageRequest) {
        return null;
    }
}
