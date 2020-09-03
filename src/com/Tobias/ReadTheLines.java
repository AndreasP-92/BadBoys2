import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTheLines {

    public static int count = 0;
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:\\Users\\Tobia\\IdeaProjects\\Genopfriskning2\\Ressources\\Text"));

        while(s.hasNextLine()) {
            count ++;
            System.out.println(s.nextLine());

        }
        System.out.println("Total Lines: "+count);

    }

}