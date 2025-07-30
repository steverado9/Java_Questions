import java.util.HashMap;
import java.util.Map;

/*9)Write a Java program to find the most frequent
character in a given string.
Sample Output:
The given string is: successes
The second most frequent char in the string is: c
*/
public class Question9 {
    static void mostFrequentCharacter(String value) {
        // Initialize the character frequency map
        Map<Character, Integer> charCountMap = new HashMap<>(); // s:1,u:1, c:2,

        //count the frequency of each character
        for (char eachChar : value.toCharArray()) { // ["s", "u", "c", cesses"]
            charCountMap.put(eachChar, charCountMap.getOrDefault(eachChar, 0) + 1);
        }

        //Determine the maximum occurring character
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        //Display the result
        System.out.println("Maximum occuring character: " + maxChar);
        System.out.println("Occurence: " + maxCount);
    }

    public static void main(String[] args) {
        mostFrequentCharacter("successes");
    }
}
