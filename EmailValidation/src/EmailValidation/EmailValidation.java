package EmailValidation;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	private static final String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+↵\n" +
	           ")*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";


   public static void main(String args[]) {
       //adding  emails to an array list
       List<String> emails = new ArrayList<String>();
       //valid email addresses
       emails.add("mehataj@gmail.com");
       emails.add("farhanakhan@gmail.co.in");
       emails.add("sofiyashaik@outlook.com");
       emails.add("riyaz_shaik@yahoo.com");
       emails.add("sandhya'allur@example.com");
       //invalid email addresses
       emails.add("@gmail.com");
       emails.add("samrinsamrin.com");
       emails.add("mehataj..@gmail.com");
       emails.add("harrypotter@.com");

       //initialize the Pattern object
       Pattern pattern = Pattern.compile(regex);

       //searching for occurrences of regex
       for (String value : emails) {
           Matcher matcher = pattern.matcher(value);

           System.out.println("Email " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
       }
   }


}


