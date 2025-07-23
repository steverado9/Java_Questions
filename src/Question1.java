/*Write a Java program to get the character at the given index within the string
Sample Output:
Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i*/
public class Question1 {
    //decleared a method called getCharacters abd gave it a parameter of value
    static void getCharacters(int value) {
        //decleared a string variable and gave it a value
        String myString = "Java Exercises!";
        //use charAt method on the string
        char result = myString.charAt(value);
        System.out.println(result);
    }
    //decleared my main function
    public static void main(String[] args) {
        //called my getCharacter method in my main method
        getCharacters(0);
        getCharacters(9);
    }
}
