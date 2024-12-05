//Hackerrank 9th question
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner scanner = new Scanner(System.in);

        int lineNumber = 1;
        while (scanner.hasNext()) {
            // Read the next line
            String line = scanner.nextLine();

            // Print the line number and the content
            System.out.println(lineNumber + " " + line);

            // Increment the line number
            lineNumber++;
        }

        scanner.close();
    }
}
