import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Logic{

    //declaring my fields
     private File file;
     private Scanner scanner;


    Logic() throws FileNotFoundException {

        this.file=new File("movies.txt");
        this.scanner= new Scanner(file);

    }

    public String randomMovie(){

        int count=0;
        ArrayList<String> movieName= new ArrayList<>();

        while(scanner.hasNextLine()){

            String line=scanner.nextLine();
            line.split("");
            count++;

            movieName.add(line);

        }


        Random random=new Random();
        int randomNumber=random.nextInt(24);

        return movieName.get(randomNumber);



    }
}
