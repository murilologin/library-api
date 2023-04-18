package com.cursodsousa.libraryapi.service.impl;

import com.cursodsousa.libraryapi.api.model.entity.Book;
import com.cursodsousa.libraryapi.api.model.repository.BookRepository;
import com.cursodsousa.libraryapi.api.service.BookService;
import com.cursodsousa.libraryapi.exception.BusinessException;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book save(Book book) {
        if (repository.existsByIsbn(book.getIsbn())) {
            throw new BusinessException("Isbn já cadastrado");
        }
        return repository.save(book);
    }
}
