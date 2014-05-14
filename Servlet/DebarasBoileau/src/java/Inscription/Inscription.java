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
import oracle.jdbc.*;
import oracle.jdbc.pool.*;
import java.sql.*;

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
            out.println("<p id=\"Form\"><strong><u>Inscription</u></strong> <br/> </p>");
            out.println("<form action=\"Inscription\" method=\"POST\">");
            out.println("<table id=\"T_Inscription\">");
            
            out.println("<tr><td> Nom d'usager : </td><td> <input id=\"Username\" type=\"text\" class=\"Text_Box\" name=\"User\" /> </td></tr>");
            
            out.println("<tr><td> Mot de passe : </td><td> <input id=\"Password\" type=\"password\" class=\"Text_Box\" name=\"Password\" /> </td></tr>");
            
            out.println("<tr><td> Nom : </td><td> <input id=\"Name\" type=\"text\" class=\"Text_Box\" name=\"Nom\" /> </td></tr>");
            
            out.println("<tr><td> Prénom : </td><td> <input id=\"firstname\" type=\"text\" class=\"Text_Box\" name=\"Prenom\" /> </td></tr>");
            
            out.println("<tr><td colspan=\"2\"> <button id=\"btninscription\" type=\"submit\" class=\"BTN_Inscrire\">S'inscrire</button> </td></tr>");
            
            out.println("</table>");
            out.println("</form>");
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
        System.out.println("GET");
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
    protected void doPost(
            HttpServletRequest request , HttpServletResponse response )
            throws ServletException, IOException
    {
        // Recup des params de la page
        String username = request.getParameter("User");
        String password = request.getParameter("Password");
        String nom = request.getParameter("Nom");
        String prenom = request.getParameter("Prenom");
        int nombreecus = 500;
        
        
        //avertit le navigateur qu'il va recevoir du code HTML
        response.setContentType("text/html;charset=UTF-8");
        
        //Flux ecriture
        PrintWriter out = response.getWriter();
        
        try
        {
            // Write Head
            ecrireTete(out,"Inscription");
            
            //Connexion
            ConnectionOracle oradb = new ConnectionOracle();
            oradb.connecter();
            
            // Insertion joueur
            String sqlins = "insert into Joueurs(NOMUSAGER,NOMJOUEUR,PRENOM,MOTDEPASSE,ECUSJOUEURS) values (?,?,?,?,?)";
            
            try
            {
                PreparedStatement stmins =
                        oradb.getConnexion().prepareStatement(sqlins);
                
                //Affectation
                stmins.setString(1,username);
                stmins.setString(2, nom);
                stmins.setString(3,prenom);
                stmins.setString(4, password);
                stmins.setInt(5, nombreecus);
                stmins.executeUpdate();
                stmins.close();
            }
            catch(SQLException se)
            {
                System.err.println(se.getMessage());
            }
            
        }
        finally
        {
            out.close();
        }
        
        //confirmation test
        out.println("<p>Vous avez bien ajoute le joueur suivant :</p>");
        out.println("<p>" + username+" "+password+" "+prenom+" "+nom+"</p>");
        
        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        //@Override
        //public String getServletInfo() {
        //    return "Short description";
        //}// </editor-fold>
        
    }
}
