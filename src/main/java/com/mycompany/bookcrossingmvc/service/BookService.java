/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcrossingmvc.service;

import com.mycompany.bookcrossingmvc.domain.Book;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface BookService {
    void save(Book book);
 
    void delete(Book book);
 
    List<Book> getAll();
 
    Book getByBCID(Integer BCID);
}
