/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafeteria;


import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        int opcion;
        boolean salida=true;
        Cafeteria1 miCafeteria=new Cafeteria1();
        Scanner teclado=new Scanner(System.in);
   do{
       System.out.println("menu");
       System.out.println("1 agregar producto");
       System.out.println("2 lista de productos");
       System.out.println("3 producto agotado ");
       System.out.println("0 para salir");
       System.out.println("digite su opcion");
       
       opcion=teclado.nextInt();
       switch (opcion){
           case 0:
               salida=false;
               break;
           case 1:
               miCafeteria.agregar_producto();
               break;
           case 2:
               miCafeteria.listar_producto();
               break;
           case 3:
               miCafeteria.productos_agotados();
               break;
       }
   }
   while(salida);
       } 
       
               
   
       
    
}
