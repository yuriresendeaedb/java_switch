/*
Yuri Resende Corrêa - 20157082
 */
package execicios.switchh;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int cod;
        
        System.out.print("Digite o código: 00");
        cod = scan.nextInt();
        
        System.out.print("\nO código correspode ao item: ");
        switch (cod){
            case 1:
                System.out.println("Parafuso.");
                break;
            case 2:
                System.out.println("Porca.");
                break;
            case 3:
                System.out.println("Prego.");
                break;
            case 4:
                System.out.println("Ferramenta.");
                break;
            default:
                System.out.println("Diversos.");
                break;
        }
    }
}
