import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> userChoice = new ArrayList<String>();

    public static void main(String[] args) {

        //user
        
        Scanner firstQuestion = new Scanner(System.in); 

        System.out.println("");


        

        //condition


        while(true) {

            System.out.println("Choisis entre pierre, papier et ciseaux ou exit pour arrêté");

            String userResponse = firstQuestion.nextLine();

            if (userResponse.equals("exit")) {

                System.out.println("Orvoir");

                break;
            }

        if (userResponse.equals("pierre") || userResponse.equals("papier") || userResponse.equals("ciseaux")) {

            userChoice.add(userResponse);

        } else {

            System.err.println("error 1");
            main(args);

        }

        //bot

        String[] obj = {"pierre", "papier", "ciseaux"};

        Random random = new Random();

        int index = random.nextInt(obj.length) +1;

        String botResponse = "";

        switch (index) {

            case 1:

                botResponse = "pierre";
                break;

            case 2:

                botResponse = "papier";
                break;

            case 3:

                botResponse = "ciseaux";
                break;
        
            default:

                System.out.println("Error 2");
                break;

        }

        
        

        //result

        if (userResponse.equals("pierre") && botResponse.equals("papier")) {

            System.out.println("Bot gagne avec papier!");

        } else if (userResponse.equals("papier") && botResponse.equals("pierre")) {

            System.out.println("Tu gagnes avec papier!");

        } else if (userResponse.equals("ciseaux") && botResponse.equals("pierre")) {
            
            System.out.println("Bot gagne avec pierre!");
    
        } else {

            System.out.println("Egalité, vous avez tous les deux choisi " + userResponse);

        }

        System.out.println(userChoice);

        }
    }
}