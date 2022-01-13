<%@ page import="java.util.List" %>
<%@ page import="ru.geekbrains.model.Product" %>
<%@ page contentType="text/html; character=utf-8" language="java" %>

<html>
    <head>
        <title>Products</title>
    </head>
    <body>
        <h1>Products</h1>
        <ul>
            <% if(request.getAttribute("products") != null) %>
            <% for(Product product : (List<Product>) request.getAttribute("products")) { %>
                <li> <%=product.toString()%> </li>
            <% } %>
        </ul>
    </body>
</html>