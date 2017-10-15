package dragon;

import java.util.Scanner;
public class Dragon {

public static void displayIntro() {
    System.out.println("You are in a land full of dragons. In front of you, ");
    System.out.println("You see two caves. In one cave, the dragon is friendly");
    System.out.println("and will share his treasure with you. The other dragon");
    System.out.println("is greedy and hungry, and will eat you on sight");
    System.out.println(' ');
}

public static int chooseCave() {
    Scanner in = new Scanner(System.in);
    int cave = 0;
    while (cave != 1 && cave != 2) {
        System.out.println("Which cave will you go into? (1 or 2)");

        cave = in.nextInt();

    }
    in.close();
    return cave;
} 

public static void checkCave(int chosenCave) {
    System.out.println("You approach the cave...");
    try
       {
       // Sleep at least n milliseconds.
       // 1 millisecond = 1/1000 of a second.
       Thread.sleep( 2000 );
       }
    catch ( InterruptedException e )
       {
       System.out.println( "awakened prematurely" );
       }
    System.out.println("It is dark and spooky...");
    try
       {
       // Sleep at least n milliseconds.
       // 1 millisecond = 1/1000 of a second.
       Thread.sleep( 2000 );
       }
    catch ( InterruptedException e )
       {
       System.out.println( "awakened prematurely" );
       }
    System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
    try
       {
       // Sleep at least n milliseconds.
       // 1 millisecond = 1/1000 of a second.
       Thread.sleep( 2000 );
       }
    catch ( InterruptedException e )
       {
       System.out.println( "awakened prematurely" );
       }

    double friendlyCave = Math.ceil(Math.random() * 2);

    if (chosenCave == friendlyCave) {
        System.out.println("Gives you his treasure!");
    }
    else {
        System.out.println("Gobbles you down in one bite!");
    }



}
public static void main(String[] args) {
    Scanner inner = new Scanner(System.in);
    String playAgain = "yes";
    boolean play = true;
    while (play) {
        displayIntro();
        int caveNumber = chooseCave();
        checkCave(caveNumber);
        System.out.println("Do you want to play again? (yes or no)");
        playAgain = inner.nextLine();
        if (playAgain == "yes") {
            play = true;
        }
        else {
            play = false;
        }
    }
    inner.close();

}

}