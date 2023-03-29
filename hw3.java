
// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.printf("Ввод числа:");
        double num1 = iScanner.nextDouble();
        System.out.print("Ввод знака:");
        char symbol = iScanner.next().charAt(0);
        System.out.printf("Ввод числа:");
        double num2 = iScanner.nextDouble();
        
        if (symbol == '+') {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (symbol == '-') {
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (symbol == '/') {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        } else if (symbol == '*') {
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        }
    
        iScanner.close();
        
    }
    
}
