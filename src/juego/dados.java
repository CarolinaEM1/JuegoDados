
package juego;

/**
 *
 * @author Carolina EM
 */
public class dados {
    private int Dado1;  
 private int Dado2;  
 private int Resultado; 
 public dados( int Dado1, int Dado2, int Resultado){ 
     this.Dado1=Dado1;  
 this.Dado2=Dado2;  
 this.Resultado=Resultado;  
 } 
 public int getDado1(){  
 return Dado1; 
 } 
 public void setDato1(){
 this.Dado1=Dado1;  
 }  
 public int getDado2(){  
 return Dado2; 
 } 
 public void setDato2(){ 
 this.Dado2=Dado2;  
 }  
 public int getResult(){  
 return Resultado; 
 } 
 public void setResu(){ 
 this.Resultado=Resultado;  
 }  
 public int Condiciones(int Dado1, int Dado2, int resultado){ 
 while (resultado!=7 && resultado!=11 && resultado!=2 && resultado!=3 &&  resultado!=12){ 
 switch(resultado){ 
 case 1:resultado=Dado1+Dado2; 
 if(resultado==7 && resultado==11){ 
  
 System.out.println("Gano el juego la suma de Dado 1 y Dado 2 es: "+resultado);  } 
 break; 
 case 2:
 resultado=Dado1+Dado2; 
 if(resultado==2 && resultado==3 && resultado==12){ 
 System.out.println("Perdio el juego la suma de Dado 1 y Dado 2 es: "+resultado); 
 } 
 break; 
 default: 
 ; 
 break; 
 } 
 } 
 return 0; 
  
 } 
  
}
    

