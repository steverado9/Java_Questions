/*2)Write a Java program to concatenate a given string to the end of another string.
Sample Output:
String 1: Java Exercises and
String 2: Python Exercises
Result: Java Exercises and Python Exercises
*/
public class Question2 {
    //decleared my main method
    public static void main(String[] args) {
        //called my concatinateString method
        concatinateString("Java Exercises ", "Python Exercises");
    }
    //created a concatinateString method
    static void concatinateString(String myString1, String myString2 ) {
        //used the concat method to concatinate string1 to string2
        String result1 = myString1.concat(myString2);
        //print the result
        System.out.println(result1);
        //used the + opertor to concatinate string1 and string2 and put the result in a variable
        String result2 = myString1 + myString2;
        //print the result
        System.out.println(result2);
    }

}
