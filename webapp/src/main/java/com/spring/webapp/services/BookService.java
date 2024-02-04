package com.spring.webapp.services;

import com.spring.webapp.domain.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    Iterable<Book>findAll();

}
