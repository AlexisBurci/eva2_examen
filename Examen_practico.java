/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_practico;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen_practico {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int al = 0;
      double el;
      String maquina = ("");
      String user = ("");
      int ganador = 0;
      int perdedor = 0;
      int empate = 0;
      Scanner captu = new Scanner(System.in);
      
      while(al!=4) {
         System.out.println("Seleccione una:");
         System.out.println("-piedra=1, -papel=2, -tijera=3");
         al = captu.nextInt();
         el = Math.random();
         if(el<=.3){
            maquina = "papel";
         } else if (el>.3 && el<=.6){
            maquina = "piedra";
         }else if (el>.6 && el<=.9){
            maquina = "tijeras";
         }
         if(al==2){
            user="piedra";
         }else if (al==2){
            user="papel";
         }else if(al==3){
            user="tijeras";
         }
         System.out.println("Computadora:" +maquina);
         if(maquina.equals("tijeras") && user.equals("piedra")|| maquina.equals("piedra") && user.equals("tijeras") || maquina.equals("papel") && user.equals("piedra")){
            System.out.println("Haz ganado");
            ganador++;
         }else if(maquina.equals("tijeras") && user.equals("papel") || maquina.equals("piedra") && user.equals("tijeras") || maquina.equals("papel") && user.equals("piedra")){
            System.out.println("Haz perdido");
            perdedor++;
         }else if(maquina.equals(user)){
            System.out.println("Han empatado");
            empate++;
         }
         System.out.println(" ");
         System.out.println("Ganadas:" +ganador);
         System.out.println("Perdidas" +perdedor);
         System.out.println("Empate" +empate);
            
                    
         }
      System.out.println("Gracias por jugar");
     
   
         
      }
}

      
        
      
      
      
      
      
      
      
      
      
   
   
   

