## Way Too Long Words

**Problem Link:** https://codeforces.com/problemset/problem/71/A  
**Platform:** Codeforces  
**Topic:** Strings  

### Explanation
Given an integer `n` representing the number of words.  
For each word:

- If the length of the word is **greater than 10**, shorten it using  
  **first letter + (length - 2) + last letter**.
- Otherwise, print the word normally.

Example:  
`localization → l10n`

### Program (Java)

```java
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String word = sc.next();

            if(word.length() > 10) {
                System.out.println(
                        word.charAt(0) + "" +
                        (word.length() - 2) +
                        word.charAt(word.length() - 1)
                );
            } else {
                System.out.println(word);
            }
        }
    }
}
