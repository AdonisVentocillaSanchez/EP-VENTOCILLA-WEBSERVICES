/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteServleWS;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import paquetews.ServiciosWeb_Service;

/**
 *
 * @author AUTONOMA
 */
public class NewServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8083/ServiciosWeb/ServiciosWeb.wsdl")
    private ServiciosWeb_Service service;

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
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //Recojo de los datos del formulario y conversion a double
            String areac = request.getParameter("areaC");
            double areaC = Double.parseDouble(areac);
            String baset = request.getParameter("baseT");
            double baseT = Double.parseDouble(baset);
            String diagonalr = request.getParameter("diagonalR");
            double diagonalR = Double.parseDouble(diagonalr);
            String alturat = request.getParameter("alturaT");
            double alturaT = Double.parseDouble(alturat);
            String alturar = request.getParameter("alturaR");
            double alturaR = Double.parseDouble(alturar);
            //
            //Obtencion de los resultados desde el WebService
            String Rcuadrado = calculaLadoPerimCuadrado(areaC, "m");
            String Rtriangulo = calculaPerimAreaTriangulo(baseT, alturaT, "m");
            String Rrectangulo = calculaBasePerimAreaRectangulo(diagonalR, alturaR, "m");
            out.println("<table border>"
                    + "<tr>"
                    + "<th>CUADRADO</th>"
                    + "<th>TRIANGULO</th>"
                    + "<th>RECTANGULO</th>"
                    + "</tr>"
                    + "<td>" + Rcuadrado + "</td>"
                    + "<td>" + Rtriangulo + "</td>"
                    + "<td>" + Rrectangulo + "</td>"
                    + "</table>");
        }finally{
            out.close();
        }
            out.println("</body>");
            out.println("</html>");
        
    
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

    private String calculaBasePerimAreaRectangulo(double diagonal, double altura, java.lang.String medida) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        paquetews.ServiciosWeb port = service.getServiciosWebPort();
        return port.calculaBasePerimAreaRectangulo(diagonal, altura, medida);
    }

    private String calculaLadoPerimCuadrado(double area, java.lang.String medida) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        paquetews.ServiciosWeb port = service.getServiciosWebPort();
        return port.calculaLadoPerimCuadrado(area, medida);
    }

    private String calculaPerimAreaTriangulo(double base, double altura, java.lang.String medida) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        paquetews.ServiciosWeb port = service.getServiciosWebPort();
        return port.calculaPerimAreaTriangulo(base, altura, medida);
    }

}
