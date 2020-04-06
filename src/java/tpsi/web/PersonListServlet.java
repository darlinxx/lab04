package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
            List<Person> Osoby = new ArrayList<>();
            
            Person osoba1 = new Person("Anna", "Anna", "anna_anna@wp.pl");
            Person osoba2 = new Person("Jola", "Jolanta", "jola_jolanta@wp.pl");
            Person osoba3 = new Person("Karol", "Karol", "karol_karol@wp.pl");
            Person osoba4 = new Person("Staś", "Stanisław", "stas_stanislaw@wp.pl");
            Person osoba5 = new Person("Karolina", "Karolina", "karolina_karolina@wp.pl");
            
            Osoby.add(osoba1);
            Osoby.add(osoba2);
            Osoby.add(osoba3);
            Osoby.add(osoba4);
            Osoby.add(osoba5);
            
            request.setAttribute("spis", Osoby);
            request.getRequestDispatcher("personList.jsp").forward(request, response);
        }
    }
}