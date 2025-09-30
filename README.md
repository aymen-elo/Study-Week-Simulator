# Study Week simulator

Notre projet consiste à créer un jeu de simulation d’une vie étudiante. L’utilisateur sera l’étudiant. L’étudiant aura ses propres statistiques (faim, attention, fatigue) qui évolueront tout au long du jeu. Puis, il aura des statistiques liées à chaque matière et chaque professeur. En effet, tout au long de la simulation il devra faire des choix sur les éventements auxquels il va (ou non) assister. Les éventements possibles sont : Pause/Révision/Cours.

Un bilan de sa semaine sera alors donné à la fin du jeu. L’objectif de l’utilisateur est de la réussir, c’est à dire d’avoir les statistiques les plus élevés.
<img width="1540" height="280" alt="image" src="https://github.com/user-attachments/assets/c62844ad-4ad6-47a8-8ab2-192cb27da46c" />



## Installation
Nous avons utilisé Maven pour faciliter la compilation et l'exécution du jeu.

Pour compiler et exécuter le projet dans le terminal, d'abord faut se positionner dans le répertoire POO22_384J_C.  
Saisir la commande qui installera Maven:
```
mvn install
```
Puis utiliser la commande suivante pour lancer le jeu:
```
mvn -q exec:java
```

Bien sûr il est aussi possible de l'exécuter à l'aide d'un IDE comme IntelliJ ou VSC.  
Pour cela après l'ouverture du projet l'IDE va vous proposer d'installer les dépendances Maven.  
Après les avoir installé(e), vous pouvez lancer le jeu en exécutant la classe Main.


## Roadmap
Une fonctionnalité qu'on aimerait bien implémenter est un affichage graphique correct en utilisant du JavaFX ou Swing.


## Authors and acknowledgment
[Aida Amerkhanova](https://gitlab.univ-nantes.fr/E204135L)  
[Maty Diop](https://gitlab.univ-nantes.fr/E204018J)  
[Aymen El Ouagouti](https://gitlab.univ-nantes.fr/E21B584U)  
[Enzo Mantzoutsos](https://gitlab.univ-nantes.fr/E201789L)  


## Project status
Study Week Simulator possède un affichage sur console complet. Le développement est à son terme au niveau de l'affichage console. D'autres changements pourront avoir lieu pour une potentielle interface graphique.
