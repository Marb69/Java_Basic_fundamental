import java.util.Arrays;
import java.util.stream.Collectors;

public class formate {
    



public static String format (String name) {
                    return Arrays.stream(name.trim().split("\\s+")) 
                    .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()) 
                    .collect(Collectors.joining(" ")); 


        }




}
