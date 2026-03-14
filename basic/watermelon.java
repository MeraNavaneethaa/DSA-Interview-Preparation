## Watermelon

**Problem Link:** https://codeforces.com/problemset/problem/4/A  
**Platform:** Codeforces  
**Topic:** Math / Basic Logic  

### Explanation
Given an integer `w` representing the weight of a watermelon.

The goal is to check whether it can be divided into **two parts such that both parts have even weight**.

Conditions:
- The number must be **even**
- The number must be **greater than 2**

If both conditions are satisfied, print **YES**, otherwise print **NO**.

Example:  
`8 → YES (4 + 4)`  
`2 → NO`

### Program (Java)

```java
import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}






