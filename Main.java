import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner firstQuestion = new Scanner(System.in); 
        System.out.println("Choisis entre pierre, papier et ciseaux");

        String userResponse = firstQuestion.nextLine();

        //condition

        if (userResponse.equals("pierre") || userResponse.equals("papier") || userResponse.equals("ciseaux")) {

            System.out.println("Tu as choisis" + ' ' + userResponse);

        } else {

            System.err.println("error");
            main(args);

        }

    }
    
}