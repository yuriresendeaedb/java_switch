/*
Yuri Resende Corrêa - 20157082
 */
package execicios.switchh;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        
        float nota1, nota2, nota3, mp, ma;
        int op, cont = 1;
        
        Scanner scan = new Scanner (System.in);
        Scanner scanint = new Scanner (System.in);
        
        System.out.print("Digite a 1º nota: ");
        nota1 = scan.nextInt();
        System.out.print("Digite a 2º nota: ");
        nota2 = scan.nextInt();
        System.out.print("Digite a 3º nota: ");
        nota3 = scan.nextInt();
        
        System.out.print("Escolha uma opção: \n1) Média Aritmética. "
                + "\n2) Média Aritmética Ponderada. \nDigite: ");
        op = scanint.nextInt();
        

        switch(op){
            case 1:
                ma = (nota1 + nota2 + nota3)/3;
                System.out.println("A média é de " + ma);
                break;
            case 2:
                mp = (nota1 * 3 + nota2 * 3 + nota3 * 4)/(3 + 3 + 4);
                System.out.println("A média é de " + mp);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
