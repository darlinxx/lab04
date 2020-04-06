package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        List<String> dni = new ArrayList<>();
            dni.add("Poniedziałek");
            dni.add("Wtorek");
            dni.add("Środa");
            dni.add("Czwartek");
            dni.add("Piątek");
         request.setAttribute("dniTygodnia", dni);
        
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String email = request.getParameter("email");
        Person osoba = new Person(imie, nazwisko, email);
        
       
        request.setAttribute("person", osoba);
        request.getRequestDispatcher("hello.jsp").forward(request, response);
        
    }
}