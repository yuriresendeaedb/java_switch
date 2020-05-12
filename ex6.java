/*
Yuri Resende Corrêa - 20157082
 */
package execicios.switchh;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        int codg;
        float sal, salfinal;
        
        Scanner scan = new Scanner (System.in);
        Scanner scanint = new Scanner (System.in);
        
        System.out.println(""
                + "|--------------------|"
                + "\n|Cargo       | Código|"
                + "\n|--------------------|"
                + "\n|Diretor     | 001   |"
                + "\n|Engenheiro  | 002   |"
                + "\n|Técnico     | 003   |"
                + "\n|Gerente     | 004   |"
                + "\n|Analista    | 005   |"
                + "\n|Coordenador | 006   |"
                + "\n|--------------------|");
        System.out.print("Digite seu CÓDIGO: 00");
        codg = scanint.nextInt();
        System.out.print("Digite seu SALÁRIO: R$");
        sal = scan.nextInt();
        
        switch (codg){
            case 1:
                salfinal = (sal * 10) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;
             case 2:
                salfinal = (sal * 20) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;   
            case 3:
                salfinal = (sal * 30) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;
            case 4:
                salfinal = (sal * 10) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;
            case 5:
                salfinal = (sal * 30) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;
            case 6:
                salfinal = (sal * 20) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;
            default:
                salfinal = (sal * 40) / 100;
                System.out.println("Seu novo salário é: R$"+(sal+salfinal));
                break;
        }
    }
}
