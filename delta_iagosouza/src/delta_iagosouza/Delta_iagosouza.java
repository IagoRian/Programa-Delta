/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delta_iagosouza;
import java.util.Scanner;
/**
 *
 * @author Naja
 */
public class Delta_iagosouza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada;
    double a,b,c,del,x1,x2;

    entrada = new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    a = entrada.nextDouble();
   
    System.out.print("Digite outro valor: ");
    b = entrada.nextDouble();
    
    System.out.print("Digite outro valor: ");
    c = entrada.nextDouble();
     if ((a!=0)){
     System.out.print("Não e possivel calcular a equação");
     del =((b*b)-(4*a*c));
     if((del>0)){
     x1 = ((-b)+ Math.sqrt(del)/(2*a));
     x2 = ((-b)- Math.sqrt(del)/(2*a));
     System.out.print(+ x1 + x2);}
     else if((del==0)){
     x1 = ((-b)+ Math.sqrt(del)/(2*a));
     }}else{
     System.out.print("A equação não possui resultados reais");}
      
     
     
     
     
     }
    }
    

