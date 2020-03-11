package com.sdzee.pro.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/creationCommande" )
public class CreationCommande extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* À la réception d'une requête GET, simple affichage du formulaire */

    }

    public void doPost( HttpServletRequest request, HttpServletResponse response )
            throws ServletException, IOException {
        /* Préparation de l'objet formulaire */

        /* Traitement de la requête et récupération du bean en résultant */

        /* Ajout du bean et de l'objet métier à l'objet requête */

    }
}