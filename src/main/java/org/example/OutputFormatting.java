//Hackerrank 5th question on java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                
                String s1 = scan.next();
                int x = scan.nextInt();
                //Complete this line
                
               System.out.printf("%-15s%03d%n", s1, x); 
                
            }
            System.out.println("================================");
            
            scan.close();