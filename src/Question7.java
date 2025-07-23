/*7)Write a Java program to check whether a given string starts with
 another string.
Sample Output:
Red is favorite color. starts with Red? true
Orange is also my favorite color. starts with Red? false
*/
public class Question7 {
    //created a method called startWithString
    static void startWithString(String value) {
        //decleared a string with a variable and value
        String myString = "Red is favorite color";
        //used the startwith method on the string
        boolean result = myString.startsWith(value);
        //print the result
        System.out.println(result);
    }
    //created the main method
    public static void main(String[] args) {
        //called the startWithString method with values
        startWithString("Red");
        startWithString("red");
    }
}
