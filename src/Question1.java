/*Write a Java program to get the character at the given index within the string
Sample Output:
Original String = Java Exercises!
The character at position 0 is J
The character at position 10 is i*/
public class Question1 {
    //decleared my main function
    public static void main(String[] args) {
        //called my getCharacter method in my main method
        getCharacterAtPosition(0);
        getCharacterAtPosition(9);
    }
    //decleared a method called getCharacters abd gave it a parameter of value
    public static void getCharacterAtPosition(int position) {
        //decleared a string variable and gave it a value
        String myString = "Java Exercises!";
        //use charAt method on the string
        char result = myString.charAt(position);
        System.out.println("The character at position " + position + " is " + result);
    }

}
