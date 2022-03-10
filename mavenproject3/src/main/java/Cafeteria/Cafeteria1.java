/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafeteria;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Cafeteria1 {

    static ArrayList<Productos> array_Productos = new ArrayList<>();

    private int ID;
    private String nombre;
    private int precio;
    private int referencia;
    private String categoria;
    private String fecha;
    private int cantidad_existente;
    static Scanner teclado = new Scanner(System.in);

    public Cafeteria1() {

    }

  
    public void agregar_producto()  {
        
        
        
        System.out.println("ingrese ID del producto:");
        ID = teclado.nextInt();
        System.out.println("ingrese nombre del producto:");
        nombre = teclado.nextLine();
        System.out.println("ingrese referencia del producto:");
        referencia = teclado.nextInt();
        System.out.println("ingrese precio del producto:");
        precio = teclado.nextInt();
        System.out.println("ingrese la categoria");
        categoria= teclado.nextLine();
        System.out.println("ingrese la fecha de ingreso dd/MM/AA");
        fecha=teclado.nextLine();
        System.out.println("ingrese cantidad del producto:");
        cantidad_existente=teclado.nextInt();
        Productos productos_cafeteria=new Productos(ID,nombre,referencia,precio,categoria,fecha,cantidad_existente);
        array_Productos.add(productos_cafeteria);

    }
    public void listar_producto(){
        array_Productos.forEach(producto -> {
            producto.toString();
        });
    }
    public void productos_agotados(){
        int agotado=0;
        for (Productos producto:array_Productos){
            if( producto.getcantidad_existente()<=0){
                producto.toString();
                agotado=1;
            }
        }
        if (agotado==0);{
        System.out.println("no se puede realizar la venta");
    }
    }
}
