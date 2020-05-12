/*
Yuri Resende Corrêa - 20157082
 */
package execicios.switchh;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int cod, quant;
        float valor;
        
        System.out.println(""
                + "\n|Especificação   |Código | Preço |"
                + "\n|----------------|-------|-------|"
                + "\n|Cachorro Quente |  100  | 3,20  |"
                + "\n|Bauru Simples   |  101  | 4,30  |"
                + "\n|Bauru com Ovo   |  102  | 5,50  |"
                + "\n|Hambúrger       |  103  | 3,20  |"
                + "\n|Cheeseburguer   |  104  | 4,30  |"
                + "\n|Refrigerante    |  105  | 4,00  |");
        
        System.out.print("\nEscolha uma opção informando o código: ");
        cod = scan.nextInt();
        System.out.print("Qunatos desse produto você quer: ");
        quant = scan.nextInt();
        
        switch (cod){
            case 100:
                System.out.println("O valor a ser pago é: "+(quant * 3.20));
                break;
            case 101:
                System.out.println("O valor a ser pago é: "+(quant * 4.30));
                break;
            case 102:
                System.out.println("O valor a ser pago é: "+(quant * 5.50));
                break;
            case 103:
                System.out.println("O valor a ser pago é: "+(quant * 3.20));
                break;
            case 104:
                System.out.println("O valor a ser pago é: "+(quant * 4.30));
                break;
            case 105:
                System.out.println("O valor a ser pago é: "+(quant * 4));
                break;
        }
    }
}
