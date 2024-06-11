
package pckg.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int option, result = 0, num1 = 0, num2 = 0;
        
        while (!exit) {
            
            System.out.println("Choose one number");
            num1 = sn.nextInt();
            
            System.out.println("Choose one number");
            
            num2 = sn.nextInt();
                    
            
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit");
            
        
            try {
                System.out.println("Choose one option");
                option = sn.nextInt();

                switch (option) {
                    case 1 :
                        result = num1 + num2;
                        break;
                    case 2 :
                        result = num1 - num2;
                        break;
                    case 3 :
                        result = num1 * num2;
                        break;
                    case 4 :
                        
                        if(num2 == 0){
                            System.out.println("This operation is not possible");
                        } else{
                            double div = (double)num1/num2;
                            System.out.println("Result: " + div);
                        }
                        break;
                    case 5 :
                        exit = true;
                        break;
                    default :
                        System.out.println("Error. Select one number between 1 to 5");
                        
                }
                if(option != 4) {
                    System.out.println("Result: " + result);

                }

            } catch (InputMismatchException e) {
                System.out.println("Select one number");
                sn.next();
            }
        }
    }
}
