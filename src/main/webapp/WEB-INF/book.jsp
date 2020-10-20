<%-- 
    Document   : book
    Created on : 24.09.2020, 20:38:46
    Author     : Lenovo
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Library</title>
        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <th>BCID</th>
                <th>Author</th>
                <th>Title</th>
                <th>Reader</th>
                <th>Access</th>
                <th>Status</th>
            </tr>
            <c:forEach var="book" items="${bookList}">
                <tr>
                    <td>${book.BCID}</td>
                    <td>${book.author}</td>
                    <td>${book.name}</td>
                    <td>${book.reader}</td>
                    <td>${book.access}</td>
                    <td>${book.status}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="/BookCrossingMVC/add-new-book">Add new book</a>
    </body>
</html>
