<!-- accueil.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body>
    <%
        // Récupérer l'objet ClientBean de la requête
        ClientBean client = (ClientBean)request.getAttribute("client");
    %>
    <h1>Bonjour <%= client.getNom() %>!</h1>
    <p>Je vous confirme votre rendez-vous le <%= client.getDateRendezVous() %> à 10h. Je reste disponible pour toute information.</p>
</body>
</html>
