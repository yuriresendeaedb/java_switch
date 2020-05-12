/*
Yuri Resende Corrêa - 20157082
 */
package execicios.switchh;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        
        int codg;
        float valor, vfinal;
        
        Scanner scanint = new Scanner (System.in);
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite o preço do produto: R$");
        valor = scan.nextFloat();
        
        System.out.print("1) À vista em dunheiro ou cheque: Desconto de 10%"
                + "\n2) À vista com cartão de crédito: Desconto de 5%"
                + "\n3) 2 parcelas sem juros"
                + "\n4) 3 parcelas com juros de 10%"
                + "\nEscolha a opção para o pagamento: ");
        codg = scanint.nextInt();
        
        switch (codg){
            case 1:
                vfinal = (valor * 10) / 100;
                System.out.println("O valor a ser pago é: R$"+(valor-vfinal));
                break;
            case 2:
                vfinal = (valor * 5) / 100;
                System.out.println("O valor a ser pago é: R$"+(valor-vfinal));
                break;
            case 3:
                System.out.println("O valor a ser pago é: 2 parcelas de "
                        + "R$"+(valor/2));
                break;
            case 4:
                vfinal = (valor * 10) / 100;
                System.out.println("O valor a ser pago é: 3 parcelas de "
                        + "R$"+((valor+vfinal)/3));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
