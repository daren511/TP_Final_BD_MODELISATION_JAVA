/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inscription;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 201093812
 */
@WebServlet(name = "Inscription", urlPatterns = {"/Inscription"})
public class Inscription extends HttpServlet {

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
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            ecrireTete(out,"Inscription");
            out.println("<body>");
            out.println("<div class=\"Inscription\">");
            out.println("<pre id=\"Form\">");
            out.println("<strong><u>Inscription</u></strong>");
            
            out.println("Nom d'usager : <input id=\"Username\" type=\"text\" class=\"Text_Box\" name=\"User\" />");
            
            out.println("Mot de passe : <input id=\"Password\" type=\"password\" class=\"Text_Box\" name=\"Password\" />");
            
            out.println("Nom : <input id=\"Name\" type=\"text\" class=\"Text_Box\" name=\"Nom\" />");
            
            out.println("Prénom : <input id=\"firstname\" type=\"text\" class=\"Text_Box\" name=\"Prenom\" />");
            
            out.println("<button id=\"btninscription\" type=\"button\" class=\"BTN_Inscrire\">S'inscrire</button>");
            out.println("</pre>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private void ecrireTete(PrintWriter writer, String Titre){
            writer.println("<head>");
            writer.println("<meta charset=\"utf-8\" />");
            writer.println("<title>"+Titre+"</title>"); 
            writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"WebApp.css\">");
            writer.println("</head>");
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
