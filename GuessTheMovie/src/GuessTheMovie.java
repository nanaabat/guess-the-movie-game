import java.util.ArrayList;
import java.util.Scanner;



public class GuessTheMovie {
    public static void main(String[] args) throws Exception {


        //This is to print out the result of everything
        MovieLogic guessGame = new MovieLogic();
        String r = guessGame.gameStart();

        opposite(r);
        //declaring other variables

    }


    public static void opposite(String str) throws Exception {
        char[] ln = new char[str.length()];
        int wrong = 0;
        // Conversion using predefined methods
        for (int i = 0; i < str.length(); i++) {
            // all chars as underscores
            ln[i] = '-';
            // but whitespaces
            if (str.charAt(i) == ' ') {
                ln[i] = ' ';
            }
        }


        //printing the results out
        System.out.println(ln);


        //declaring my fields
        Scanner scanner1 = new Scanner(System.in);
        //tring r=guessGame.gameStart();

        //declaring my variables.
        int wrongTimes = 10; //this is to help keep track of the number of wrongs

        //Printing out a rules to help the user know what one is suppose to do
        System.out.println("You are to guess a movie title that has been randomly picked");
        System.out.println("You first have to guess a letter and that will give you a clue as to what the title will be");

        ArrayList<Character> repeated = new ArrayList< >();
        //using a while loop to help keep track on when the game is over and also to help with decision making
        while (wrongTimes > 0) {

            //declaring a variable to check for repeated output

            //ArrayList<Character> repeated = new ArrayList<Character>();
            //printing out what the user have to do

            System.out.println("Guess a letter");
            char letter = scanner1.next().charAt(0);

            //using the if/else statement to determine if their guess was right

            if (repeated.contains(letter)) {

                System.out.println("That character has already been entered");
                continue;

            }
            //add the character to the array list
            repeated.add(letter);


           // System.out.println(repeated.add(letter));

            if (str.contains(letter + "")) {
                //if the guess was right,iterate the movie string and then replace the underscore by the guessed letter
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == letter) {
                        ln[i] = letter;  //System.out.println(ln);
                        // System.out.println("You have guessed (" +wrong +")wrong letter(s)");
                    }
                }
            } else {
                wrongTimes--;
                wrong++;   // System.out.println(ln);
                //System.out.println("You have guessed (" +wrong +")wrong letter(s)");  }
                //ystem.out.println(ln);

            }

            System.out.println(ln);
            System.out.println("You have guessed (" + wrong + ")wrong letter(s)");


            if (str.equals(String.valueOf(ln))) {
                System.out.println(ln);
                System.out.println("YOU WIN");
                break;
            } else if (wrongTimes == 0) {
                System.out.println("YOU LOOSE");
                System.out.println("Movie To Be Guessed Was " + str);
            }

        }

    }

}








