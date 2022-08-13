
package juego;
import java.util.Scanner;
/**
 *
 * @author Carolina EM
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
 int Dado1 = (int)(Math.random()*6)+1; 
 System.out.println("Dado 1 = "+Dado1);  int Dado2 = (int)(Math.random()*6)+1; 
 System.out.println("Dado 2 = "+Dado2);  Scanner scan = new Scanner(System.in);  int Resultado=sc.nextInt();  
 Dado1 = sc.nextInt();  
 Dado2 = sc.nextInt(); 
 dados Jugador1=new dados(Dado1,Dado2,Resultado);   Jugador1.Condiciones(Dado1, Dado2, Resultado);  System.out.println(Jugador1.getResult());  
  
 }
  
} 
    
    

