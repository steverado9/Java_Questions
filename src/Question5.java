/*5)Write a Java program to replace a specified character with another character.
Sample Output: Replace 'd' with 'f'
Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown fox jumps over the lazy fog.
*/
public class Question5 {
    //created a replaceCharacter method
    static void replaceCharacter() {
        //decleared a string
        String myString = "The quick brown fox jumps over the lazy dog";
        //used replace method on the string
        String result = myString.replace('d', 'f');
        //print the result
        System.out.println(result);
    }

    public static void main(String[] args) {
        //called the replaceCharacter method
        replaceCharacter();
    }
}
