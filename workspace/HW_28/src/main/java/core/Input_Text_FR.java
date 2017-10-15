package core;
import java.io.*;
public class Input_Text_FR {
       public static void main(String[] args) throws IOException {
       String file = args[0];     //при запуске раскомментировать
       //File file1 = new File("input.txt");   //при запуске закомментировать
       BufferedReader br = new BufferedReader(new FileReader(file));
       while (br.ready()) {
             String first_name = br.readLine();
             String last_name = br.readLine();
             System.out.println("Ful name is: " + first_name + " " + last_name); }
             br.close(); }
             }