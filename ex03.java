/*
Yuri Resende Corrêa - 20157082
 */
package execicios.switchh;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int opc;
        
        System.out.println("Escolja uma opção:"
                + "\n(1) \n(2) \n(3) \n(4)");
        opc = scan.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("Executa a rotina de Inclusão de Alunos.");
                break;
            case 2:
                System.out.println("Executa a rotina de Alteração de Alunos.");
                break;
            case 3:
                System.out.println("Executa a rotina de Exclusão de Alunos.");
                break;
            case 4:
                System.out.println("Executa a rotina de Consulta de Alunos.");
                break;
        }
    }
          
}
