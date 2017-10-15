package encapsulation;
 
public class Protected {
       
       private static String p_name;
       public static String getName() {return p_name;}
 
       public static void setName(String name) {
              if (name != null && name.length() >= 4 && name.length() <= 11) {
                     p_name = name;
              }
       }
}
