package ru.geekbrains.servlet;

import ru.geekbrains.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ProductsHttpServlet", urlPatterns = "/products")
public class ProductsServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", getProductsList());
        getServletContext().getRequestDispatcher("/products.jsp").forward(req, resp);

    }


    public ArrayList<Product> getProductsList() {
        ArrayList<Product> productsList = new ArrayList<>();

        productsList.add(new Product(1, "apple", 5));
        productsList.add(new Product(2, "pencil", 1));
        productsList.add(new Product(3, "pillow", 100));
        productsList.add(new Product(4, "car", 10000));
        productsList.add(new Product(5, "computer", 2000));
        productsList.add(new Product(6, "table", 500));
        productsList.add(new Product(7, "refrigerator", 1000));
        productsList.add(new Product(8, "bread", 3));
        productsList.add(new Product(9, "juice", 10));
        productsList.add(new Product(10, "meat", 20));

        return productsList;
    }


}
