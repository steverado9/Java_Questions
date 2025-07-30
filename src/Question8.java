/*8)Write a Java program to trim leading or trailing
whitespace from a given string.
Sample Output:
Original String:       Java Exercises
New String: Java Exercises
*/
public class Question8 {
    //created the main method
    public static void main(String[] args) {
        //call the trimString method
        trimString("       Java Exercises");
    }
    //created a method called trimString and gave it a parameter
    static void trimString(String value) {
        //used the .trim method on the method's parameter
        String result = value.trim();
        //print the result
        System.out.println(result);
    }
}
