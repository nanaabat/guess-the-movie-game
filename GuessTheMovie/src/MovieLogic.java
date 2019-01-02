import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MovieLogic {

    //declaring my fields
    private File file;
    private Scanner scanner;


    //defining my constructors
    MovieLogic() throws Exception{

        this.file=new File("movies.txt");
        this.scanner=new Scanner(file);

    }

    //defining my methods

    /*
    This method is to read the file, save the names of the movies in a Array
     */
    public  String gameStart() throws Exception {

        //declaring my variables where word represent the words in the list and words counts
        String word;
        int words = 0;
        ArrayList<String> movieList = new ArrayList<String>();

        //this loop is to aid us split and display the movie list as placed or listed in the text
        while (scanner.hasNextLine()) {

            word = scanner.nextLine();
            word.split("");
            //System.out.println(word);
            words++;

            //printing movie list
            //System.out.println((words - 1) + " - " + word);

            // populating array list with each movie name
            movieList.add(word);
        }


        // creating a random number movie to be guess
        Random random= new Random();
        int randomNumber= random.nextInt(24);
       // int randomNumner=(int) Math.random()*words;


        //the random number to be guessed

        String randomMovie=movieList.get(randomNumber);


        //printing out the movieName


       // System.out.println(randomMovie);

        return randomMovie;
    }


     /*public void convertOpposite(String str)
    {
        char[] ln = new char[str.length()];

        // Conversion using predefined methods
        for (int i=0; i<str.length(); i++)
        {
            // all chars as underscores
            ln[i] = '-';
            // but whitespaces
            if (str.charAt(i) == ' ') {
                ln[i] = ' ';
            }
        }

        //printing the results out

        System.out.println(ln);
    }*/

}




