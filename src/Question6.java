/*6)Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
Sample Output: Replace 'fox' with 'cat'
Original string: The quick brown fox jumps over the lazy dog.
New String: The quick brown cat jumps over the lazy dog.
*/
public class Question6 {
    //created a method replaceSubstring
    static void replaceSubstring(String value) {
        //decleared a string and added content
        String myString = "The quick brown fox jumps over the lazy dog";
        //decleared a regular expression and gave it a value
        String regex = "fox";
        //used replaceFirst to replace the first instance of the regex
        String result = myString.replaceFirst(regex, value);
        //print the result
        System.out.println(result);
    }
    //created my main method
    public static void main(String[] args) {
        //called the replaceSubString method
        replaceSubstring("cat");
    }
}
