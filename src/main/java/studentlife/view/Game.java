package studentlife.view;

import studentlife.controller.GameController;
import studentlife.core.Day;
import studentlife.core.Schedule;
import studentlife.core.events.Cours;
import studentlife.core.events.Evenement;
import studentlife.core.events.Pause;
import studentlife.core.events.PauseType;

import java.util.Scanner;

public class Game {

    private final GameController gameController;

    public Game(GameController gameController) {
        this.gameController = gameController;
    }

    private void initGameView() {
        // Get user details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Firstname");
        String firstName = scanner.nextLine();

        System.out.println("Enter Lastname:");
        String lastName = scanner.nextLine();

        gameController.initGame(lastName, firstName);

        System.out.println("Welcome " + gameController.getUser().getNom() + " " + gameController.getUser().getPrenom());
    }

    public void run() {
        // LANCER LE JEU :)
        initGameView();

        for (Day day : gameController.getSchedule().getWeek()) {
            for (Evenement event : day.getEvenements()) {
                manageEvent(event);
            }
        }
    }

    private void manageEvent(Evenement event) {
        if(event instanceof Cours)
            manageCours((Cours) event);
        else
            managePause((Pause) event);
    }

    public void manageCours(Cours cours) {
        System.out.println("Cours de " + cours.getMatiere().getNom());
    }

    public void managePause(Pause pause) {
        System.out.println("Y a une pause a gérer");
    }
}
