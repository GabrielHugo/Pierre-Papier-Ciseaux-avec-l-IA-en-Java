import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //user
        
        Scanner firstQuestion = new Scanner(System.in); 

        System.out.println("Choisis entre pierre, papier et ciseaux");

        String userResponse = firstQuestion.nextLine();

        //condition

        if (userResponse.equals("pierre") || userResponse.equals("papier") || userResponse.equals("ciseaux")) {

            System.out.println("Tu as choisis" + ' ' + userResponse);

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

    }
    
}