/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "ContadorServlet", urlPatterns = {"/contador.html"})
public class ContadorServlet extends HttpServlet {

    private static int c = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String comando = req.getParameter("comando");
        if("inc".equals(comando)){
            c++;
        }
        if("dec".equals(comando)){
            c--;
        }
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Divisao</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Valor de C</h1>");
        out.println("<p>C= "
                + c + "</p>");
        out.println("<p><a href='?comando=inc'>Incrementar</a></p>");
        out.println("<p><a href='?comando=dec'>Decrementar</a></p>");
        out.println("</body>");
        out.println("</html>");

    }

}
