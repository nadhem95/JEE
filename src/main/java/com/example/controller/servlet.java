package com.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.ClientBean;

public class RendezVousController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prenom = request.getParameter("prenom");
        String nom = request.getParameter("nom");
        String genre = request.getParameter("genre");
        String telephone = request.getParameter("telephone");
        String raisonRendezVous = request.getParameter("raisonRendezVous");
        String dateRendezVous = request.getParameter("dateRendezVous");

        ClientBean client = new ClientBean();
        client.setPrenom(prenom);
        client.setNom(nom);
        client.setGenre(genre);
        client.setTelephone(telephone);
        client.setRaisonRendezVous(raisonRendezVous);
        client.setDateRendezVous(dateRendezVous);

        request.setAttribute("client", client);
        request.getRequestDispatcher("WEB-INF/views/accueil.jsp").forward(request, response);
    }
}
