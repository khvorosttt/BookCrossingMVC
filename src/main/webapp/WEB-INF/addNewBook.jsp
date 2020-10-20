<%-- 
    Document   : addNewBook
    Created on : 24.09.2020, 23:16:45
    Author     : Lenovo
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>New Book</title>
    </head>
    <body>
        <form action="/BookCrossingMVC/add-new-book" method="POST">
            <label>Author</label>
            <input type="text" name="author">
            <label>Title</label>
            <input type="text" name="name">
            <label>Access</label>
            <input type="number" name="access">
            <input type="submit" value="Add new book">
        </form>
    </body>
</html>
