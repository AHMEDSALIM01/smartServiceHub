# Cahier des Charges : SmartServiceHub

1. Introduction
Titre du projet : SmartServiceHub – Plateforme de gestion des services à la demande
Objectif principal :
Créer une plateforme interactive qui connecte des prestataires de services et des clients, avec une gestion simplifiée pour l’administrateur, tout en respectant les standards modernes de développement logiciel et les bonnes pratiques DevOps.
Public cible :
Clients cherchant des services divers.
Prestataires de services souhaitant proposer leurs compétences.
Administrateurs en charge de la gestion de la plateforme.

2. Acteurs
Client : Recherche, réserve, et évalue des services.
Prestataire : Ajoute/modifie ses services et gère les réservations.
Administrateur : Supervise la plateforme, gère les utilisateurs, services, et litiges.

3. Scénarios par acteur
3.1. Scénarios client
S'inscrire/Se connecter :
Le client peut créer un compte ou se connecter à un compte existant.
Exemple: Un client crée un compte avec son e-mail et un mot de passe.
Rechercher un service :
Le client utilise des filtres (localisation, prix, avis) pour trouver un prestataire.
Exemple: Un client cherche un électricien à proximité.
Réserver un service :
Le client choisit une date, une heure, et réserve un service. Il peut aussi effectuer un paiement en ligne.
Exemple: Un client réserve un plombier pour demain à 14h et paie via PayPal.
Consulter l’historique des réservations :
Le client visualise ses réservations passées et à venir.
Exemple: Le client consulte son historique et annule une réservation pour la semaine prochaine.
Donner un avis :
Après un service, le client laisse une note et un commentaire.
Exemple: Le client donne 5 étoiles et un commentaire positif pour une intervention rapide.

3.2. Scénarios prestataire
S'inscrire/Se connecter :
Le prestataire crée un compte ou se connecte.
Exemple: Un prestataire entre ses informations et s’inscrit comme électricien.
Ajouter des services :
Le prestataire configure ses services (description, prix, catégorie).
Exemple: Un plombier ajoute un service de réparation de fuites à 200 MAD.
Gérer les réservations :
Le prestataire accepte ou refuse des réservations.
Exemple: Un prestataire accepte une réservation pour la semaine prochaine.
Voir ses statistiques :
Le prestataire consulte ses revenus mensuels et le nombre de réservations.
Exemple: Un prestataire visualise ses statistiques et remarque une hausse en fin de mois.

3.3. Scénarios administrateur
Gérer les utilisateurs :
L’administrateur peut activer/désactiver les comptes des utilisateurs (clients ou prestataires).
Exemple: Un administrateur suspend un compte frauduleux.
Superviser les services :
L’administrateur vérifie les descriptions de services et peut les approuver ou les refuser.
Exemple: Un administrateur valide une nouvelle offre de service d’un plombier.
Analyser les données :
L’administrateur visualise des tableaux de bord avec des graphiques sur les revenus, les réservations par région, etc.
Exemple: L’administrateur remarque une augmentation des réservations dans une région spécifique.
Envoyer des notifications :
L’administrateur peut envoyer des campagnes promotionnelles ou des alertes.
Exemple: L’administrateur informe les clients d’une promotion pour le mois de mars.

4. Fonctionnalités
4.1. Fonctionnalités principales
Gestion des comptes utilisateur (client et prestataire).
Recherche et réservation de services.
Paiement en ligne sécurisé.
Gestion des avis et commentaires.
Tableau de bord analytique pour les administrateurs.
4.2. Fonctionnalités avancées
Notifications en temps réel via WebSocket.
Recommandations personnalisées basées sur l’historique et la géolocalisation.
Chat intégré pour la communication client-prestataire.

5. Architecture
Frontend
Angular : Développement de l’interface utilisateur.
Tailwind CSS : Design réactif et moderne.
Google Maps API : Gestion de la géolocalisation.
Backend
Spring Boot : Développement des services RESTful.
Liquibase : Gestion des migrations de base de données.
JWT : Authentification sécurisée.
Base de données
MySQL/PostgreSQL avec tables pour les utilisateurs, services, réservations, etc.
DevOps et CI/CD
Docker : Conteneurisation des services.
Jenkins : Automatisation des builds et tests.
Kubernetes : Orchestration des conteneurs.
SonarQube : Vérification de la qualité du code.
Tests
JUnit 5 & Mockito : Tests unitaires backend.
Cucumber : Tests BDD backend.
Jasmine/Karma : Tests unitaires frontend.
Cypress : Tests E2E.

6. Étapes de réalisation
Conception de la base de données :
Modélisation des entités principales (users, services, bookings, etc.).
Développement backend :
Création des APIs REST.
Mise en place de la sécurité avec Spring Security et JWT.
Développement frontend :
Création des interfaces utilisateur avec Angular.
Intégration des APIs backend.
DevOps :
Conteneurisation avec Docker.
Déploiement avec Jenkins et Kubernetes.
Tests et qualité :
Écriture des tests unitaires et E2E.
Analyse continue du code avec SonarQube.
Livraison et suivi :
Déploiement sur un environnement cloud.
Surveillance et maintenance.

7. Livrables
Plateforme fonctionnelle (frontend + backend).
Docker-compose pour le déploiement local.
Pipeline CI/CD configuré (Jenkins).
Rapport SonarQube sur la qualité du code.
Documentation technique et guide utilisateur.

