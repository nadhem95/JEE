// RendezVousController.java
package com.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.ClientBean;

public class RendezVousController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les données du formulaire
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        String genre = request.getParameter("genre");
        String telephone = request.getParameter("telephone");
        String raisonRendezVous = request.getParameter("raisonRendezVous");
        String dateRendezVous = request.getParameter("dateRendezVous");

        // Créer un objet ClientBean avec les données du formulaire
        ClientBean client = new ClientBean();
        client.setPrenom(prenom);
        client.setNom(nom);
        client.setGenre(genre);
        client.setTelephone(telephone);
        client.setRaisonRendezVous(raisonRendezVous);
        client.setDateRendezVous(dateRendezVous);

        // Envoyer l'objet ClientBean à la vue
        request.setAttribute("client", client);

        // Rediriger vers la vue d'accueil
        request.getRequestDispatcher("WEB-INF/views/accueil.jsp").forward(request, response);
    }
}
