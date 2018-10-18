/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteServleWS;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AUTONOMA
 */
public class ServletConsumeClient extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletConsumeClient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='NewServlet' method='post'>");
            out.println("<table border>");
            out.println("<tr>"
                    + "<th colspan=6>Operaciones</th>"
                    + "</tr>"
                    + "<tr>"
                    + "<th colspan=2>CUADRADO</th>"
                    + "<th colspan=2>TRIANGULO</th>"
                    + "<th colspan=2>RECTANGULO</th>"
                    + "</tr>"
                    + "<tr>"
                    + "<td colspan=2>Calcular el Lado y el Perimetro <br> Ingresando:</td>"
                    + "<td colspan=2>Calcular el Perimetro y Area <br> Ingresando:</td>"
                    + "<td colspan=2>Calcular la Base y el Perimetro <br> Ingresando:</td>"
                    + "</tr>"
                    + "<td>Area: </td>  <td><input type=text name=areaC ></td>"
                    + "<td>Base: </td>  <td><input type=text name=baseT ></td>"
                    + "<td>Diagonal: </td>  <td><input type=text name=diagonalR ></td>"
                    + "</tr>"
                    + "</tr>"
                    + "<td>Medida: </td> "
                    + "<td>"
                    + "<select name=medida>"
                    + "<option>Metros</option>"
                    + "</select>"
                    + "</td>"
                    + "<td>Altura: </td>  <td><input type=text name=alturaT ></td>"
                    + "<td>Altura: </td>  <td><input type=text name=alturaR ></td>"
                    + "</tr>"
                    + "<tr>"
                    + "<td></td> <td></td>"
                    + "<td>Medida: </td> "
                    + "<td>"
                    + "<select name=medida>"
                    + "<option>Metros</option>"
                    + "</select>"
                    + "</td>"
                    + "<td>Medida: </td> "
                    + "<td>"
                    + "<select name=medida>"
                    + "<option>Metros</option>"
                    + "</select>"
                    + "</td>"
                    + "</tr>"
                    + "<tr> "
                    + "<td colspan=6><center><input type=submit value='Calcular operaciones'></center></td>"
                    + "</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
