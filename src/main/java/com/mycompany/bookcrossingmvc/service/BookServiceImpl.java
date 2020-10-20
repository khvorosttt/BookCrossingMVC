/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcrossingmvc.service;

import com.mycompany.bookcrossingmvc.domain.Book;
import com.mycompany.bookcrossingmvc.repository.BookRepository;
import com.mycompany.bookcrossingmvc.repository.BookRepositoryImpl;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository = new BookRepositoryImpl();

    @Override
    public void save(Book book) {
        /*if (book != null) {
            List<Book> books = bookRepository.getAll();
            if (!books.isEmpty()) {
                Book lastBook = books.get(books.size() - 1);
                book.setBCID(lastBook.getBCID() + 1);
                bookRepository.save(book);
            }
        }*/
        bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        if (book != null) {
            bookRepository.delete(book);
        }
    }

    public Book getByBCID(Integer BCID) {
        if(BCID!=null){
            return bookRepository.getByBCID(BCID);
        }
        return null;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }
}
