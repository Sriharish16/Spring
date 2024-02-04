package com.spring.webapp.controller;

import com.spring.webapp.services.BookService;
import com.spring.webapp.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BookController {
    @Autowired
    private final BookServiceImpl bookServiceImpl;

    public BookController(BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("booksView", bookServiceImpl.findAll());
        return "booksView";
    }
}
