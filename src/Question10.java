import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*10)Write a Java program to print the result of
removing duplicates from a given string.
Sample Output:
The given string is: bobby
After removing duplicates characters the new string is: boy*/
public class Question10 {
    static void removeDuplicate(String value) {
        //split the string
        String[] myString = value.split("");
        System.out.println(Arrays.toString(myString));

        //Use a LinkedHashSet to remove duplicates and retain order
        Set<String> uniqueString = new LinkedHashSet<>();
        for (String singleChar : myString) {
            uniqueString.add(singleChar);
        }

        //Reassemble the string without duplicates
        String result = String.join("", uniqueString);

        // Display the result
        System.out.println("String after removing duplicate char: " + result);

    }

    public static void main(String[] args) {
        removeDuplicate("bobby");
    }
}
