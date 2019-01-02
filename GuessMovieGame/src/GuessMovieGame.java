import java.util.Scanner;

public class GuessMovieGame {

    public static void main(String [] args){

    }

    public static void guessTheMovie(String str){

        //declaring my variables.Convert Strings to characters. Converts characters to underscores
        char [] character= new char[str.length()];

        //using the for loop to do the conversion form Char to Underscore
        for(int i = 0; i<str.length(); i++){

            character[i] ='-';

            //but with spaces
            if(str.charAt(i)==' '){
                character[i]=' ';
            }

        }

        System.out.println(character);



        //reading the user input
        //declaring my fields

        Scanner scanner= new Scanner(System.in);


        //displaying the rules of the game
        System.out.println("You are to guess a movie title that has been randomly picked");
        System.out.println("You first have to guess a letter and that will give you a clue as to what the title will be");

        




    }


}
