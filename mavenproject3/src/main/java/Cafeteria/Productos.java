/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafeteria;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class Productos {
    private int ID;
    private String nombre;
    private int referencia;
    private int precio;
    private String categoria;
    private int cantidad_existente;
    private String fecha;
    
public Productos(int ID,String nombre, int referencia,int precio,String categoria,int cantidad_existente, String fecha){
    this.ID=ID;
    this.nombre=nombre;
    this.precio=precio;
    this.referencia=referencia;
    this.categoria=categoria;
    this.cantidad_existente=cantidad_existente;
    this.fecha=fecha;
    

}

    Productos(int ID, String nombre, int referencia, int precio, String categoria, String fecha, int cantidad_existente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidad_existente() {
        return cantidad_existente;
    }

    public void setCantidad_existente(int cantidad_existente) {
        this.cantidad_existente = cantidad_existente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Productos{" + "ID=" + ID + ", nombre=" + nombre + ", referencia=" + referencia + ", precio=" + precio + ", categoria=" + categoria + ", cantidad_existente=" + cantidad_existente + ", fecha=" + fecha + '}';
    }

    int getcantidad_existente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
