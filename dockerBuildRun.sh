#!/bin/bash

# Supprimer le conteneur existant, s'il existe
#echo "Suppression du conteneur existant..."
#docker rm -f mspr-kawa-db || true
#docker rm -f postgresql || true

# Supprimer l'image existante, s'il existe
echo "Suppression de l'image existante..."
docker rmi -f mspr-kawa-db || true
docker rmi -f postgresql || true

# Construire l'image Docker
echo "Construction de l'image Docker..."
docker build -t mspr-kawa-db .
docker build -t postgresql ./db_main

# Lancer le conteneur
#echo "Lancement du conteneur..."
#docker run --name mspr-kawa-db -d -p 8077:8077 mspr-kawa-db
#docker run --name postgresql -d -p 5432:5432 postgresql
