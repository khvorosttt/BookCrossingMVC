/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcrossingmvc.controller;

import com.mycompany.bookcrossingmvc.domain.Book;
import com.mycompany.bookcrossingmvc.service.BookService;
import com.mycompany.bookcrossingmvc.service.BookServiceImpl;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lenovo
 */
@Controller
public class BookController {

    private BookService bookService = new BookServiceImpl();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getBookPage(Model model) {
        List<Book> books = bookService.getAll();
        model.addAttribute("bookList", books);
        return "book";
    }

    @RequestMapping(value = "/add-new-book", method = RequestMethod.GET)
    public String addNewBookPage() {
        return "addNewBook";
    }

    @RequestMapping(value = "/add-new-book", method = RequestMethod.POST)
    public String addNewBook(@RequestParam(value = "author") String author, @RequestParam(value = "name") String name,
            @RequestParam(value = "access") int access) {
        Book book = new Book();
        book.setBCID(bookService.getAll().size()+1);
        book.setAutor(author);
        book.setName(name);
        book.setReader(null);
        book.setAccess(access);
        book.setStatus(true);
        bookService.save(book);
        return "redirect:/";
    }
}
