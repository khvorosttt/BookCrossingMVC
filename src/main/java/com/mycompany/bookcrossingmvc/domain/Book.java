/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookcrossingmvc.domain;

import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Book {

    private int BCID;
    private String author;
    private String name;
    private Reader reader;
    private int access;
    List<String> words;
    private boolean status = true;

    public int getBCID() {
        return BCID;
    }

    public void setBCID(int BCID) {
        this.BCID = BCID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = BCID * result + ((author == null) ? 0 : author.hashCode());
        result = BCID * result + ((name == null) ? 0 : name.hashCode());
        result = BCID * result + ((reader == null) ? 0 : reader.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Book [autor=" + author + ", name=" + name + ", reader=" + reader + ", access" + access + ", status" + status + "]";
    }

}
