/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcrossingmvc.repository;

import com.mycompany.bookcrossingmvc.domain.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class BookRepositoryImpl implements BookRepository {

    private List<Book> books=new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book = new Book();
        book.setAutor("Lermontov");
        book.setName("A Hero of Our Time");
        book.setBCID(1);
        books.add(book);
        Book book2 = new Book();
        book2.setAutor("Turgenev");
        book2.setName("Fathers and Sons");
        book2.setBCID(books.get(books.size()-1).getBCID()+1);
        books.add(book2);
        
    }
    
    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public void delete(Book book) {
        books.remove(book);
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book getByBCID(Integer BCID) {
        return books.get(BCID);
    }
    
}
