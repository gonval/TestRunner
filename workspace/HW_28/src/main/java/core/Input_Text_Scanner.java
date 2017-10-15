package core;
import java.util.Scanner;
public class Input_Text_Scanner {
       public static void main(String[] args) throws FilleNotFoundExeption {
              String file = args[0];                        //при запуске раскоментировать
             // File file = new File("input.txt");     //при запуске закоментировать
              Scanner s = new Scanner(file);
              while (s.hasNext()) {
                    String first_name = s.next();
                    String last_name = s.next();
                    System.out.println("Full name is: " + first_name + " " + last_name);}
                    s.close(); }
                    }