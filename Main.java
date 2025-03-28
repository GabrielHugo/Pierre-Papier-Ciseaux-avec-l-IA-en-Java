import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList<String> userChoice = new ArrayList<String>();

    public static void main(String[] args) {

        //user
        
        Scanner firstQuestion = new Scanner(System.in); 

        //condition

        while(true) {

            System.out.println("Choisis entre pierre, papier et ciseaux ou exit pour arrêté");

            String userResponse = firstQuestion.nextLine();

            if (userResponse.equals("exit")) {

                System.out.println("Au revoir");

                break;
            }

        if (userResponse.equals("pierre") || userResponse.equals("papier") || userResponse.equals("ciseaux")) {

            userChoice.add(userResponse);

        } else {

            System.err.println("Erreur 1");
            continue;

        }

        //bot algorithm
        
        String botResponse = "";

        String averagePlayerResponse = Collections.max(userChoice);

        String getTheLastResponse = userChoice.get(userChoice.size() - 1);

        if (averagePlayerResponse.equals("pierre")) {

            botResponse = "papier";

        } else if (averagePlayerResponse.equals("papier")) {
            
            botResponse = "ciseaux";

        } else if (averagePlayerResponse.equals("ciseaux")) {

            botResponse = "pierre";

        } else {

            System.out.println("Erreur du bot");

        }

        System.out.println("Réponse du bot " + botResponse);
        

        //result

        if (userResponse.equals("pierre") && botResponse.equals("papier") 
            || userResponse.equals("papier") && botResponse.equals("ciseaux")
            || userResponse.equals("ciseaux") && botResponse.equals("pierre")) {

            System.out.println("Bot à gagner avec " + botResponse);

        } else if (botResponse.equals("pierre") && userResponse.equals("papier") 
            || botResponse.equals("papier") && userResponse.equals("ciseaux")
            || botResponse.equals("ciseaux") && userResponse.equals("pierre")) {

                System.out.println("Tu as gagné avec " + userResponse);

        } else {

            System.out.println("Egalité");

        }

        System.out.println("Tableau des choix du joueur " + userChoice);

        System.out.println("Jeu le plus joué " + averagePlayerResponse);

        System.out.println("La dernière réponse du joueur " + getTheLastResponse);

        }
    }
}