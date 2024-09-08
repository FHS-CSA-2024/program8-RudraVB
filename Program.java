//import stuff here
import java.util.Scanner;
import java.lang.Math;
//Your code here
public class Program8{
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int diff = 0;
        int product = 0;
        double average = 0;
        int distance = 0;
        int min = 0;
        int max = 0;
        
        
        Scanner numScanner = new Scanner(System.in);
        
        System.out.println("Enter a integer number: ");
        num1 = numScanner.nextInt();
        System.out.println("Enter another integer number: ");
        num2 = numScanner.nextInt();
        
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1*num2;
        average = (double)sum/2;
        distance = Math.abs(diff);
        max = (num1+num2+Math.abs(num2-num1))/2;
        min = (num1+num2-Math.abs(num2-num1))/2;
        
        System.out.println("The numbers picked were "+num1+" and "+num2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = "+ diff);
        System.out.println("Product = "+ product);
        System.out.println("Average = "+average);
        System.out.println("Ablsolute Value = "+distance);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        
        
        
    }
}
//Paste console output below:
/*
Enter a integer number: 
13
Enter another integer number: 
20
The numbers picked were 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Ablsolute Value = 7
Maximum = 20
Minimum = 13

*/

