import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Declare new Scanner object to read in input
    Scanner in = new Scanner(System.in);

    // Declare array list to hold list of movies
    ArrayList<String> Movies = new ArrayList<>();

    // Declare variable "movieTitle" to hold movie entered by the user
    String movieTitle = "";

    do {
      System.out.print("Enter movie or Q(quit): ");
      movieTitle = in.nextLine();

      // Add movie to array list if they did not enter "Q"
      if(!movieTitle.equalsIgnoreCase("Q")) {
        Movies.add(movieTitle);
      }

    }while(!movieTitle.equalsIgnoreCase("Q"));

    // Sort list of movies
    Collections.sort(Movies);

    // Print list of movies sorted
    for(String s : Movies){
      System.out.println(s);
    }

    // Randomly select movie from list for user to watch
    Random rand = new Random();
    // Generate random integer for index
    int index = rand.nextInt(Movies.size()-1);
    String movieToWatch = Movies.get(index);

    System.out.println("\nYou should watch " + movieToWatch + " today!");
  }
}