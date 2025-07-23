/*3)Write a Java program to test if a given string contains the specified sequence of char values.
Sample Output:
Original String: PHP Exercises and Python Exercises
Specified sequence of char values: and
Result: true
*/
public class Question3 {
    //created an itContains method
    static void itContains(String value) {
        //decleared a string and gave it a value
        String myString = "PHP Exercises and Python Exercises";
        //used conatins method on the string and put it inside a variable called result
        boolean result = myString.contains(value);
        //print result
        System.out.println(result);
    }
    //creaed my main method
    public static void main(String[] args) {
        //called my itContains method
        itContains("and");
    }
}
