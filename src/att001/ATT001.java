/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package att001;
import java.util.Scanner;

public class ATT001 {


    public static void main(String[] args) {
       Scanner  scanner = new Scanner(System. in);
        System.out.println("Informe o códico do item: ");
        int cod = scanner.nextInt();
        
        System.out.println("Informe o valor do item: ");
        int valor = scanner.nextInt();
        
        System.out.println("Informe a quantidade  de itens: ");
        float quanti = scanner.nextFloat();
        
        System.out.println("O valor total é: "+ valor*quanti + " R$");
    }
    
}
