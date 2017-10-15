package core;
import java.io.*;
public class Input_CSV {

	public static void main(String[] args) throws IOException {
       
       String csvFile = "/Users/val/HW28/input.csv";   //при запуске раскомментировать  //path to input.properties
       BufferedReader br = new BufferedReader(new FileReader(csvFile));
       
       while (br.ready()) {
       String line = br.readLine();  // John, Smith
       String[] csv = line.split(",");
       String first_name = csv[0];
       String last_name = csv[1];
       
       System.out.println("Full name is: " + first_name + ", " + last_name); }
       br.close(); }
       }
     
