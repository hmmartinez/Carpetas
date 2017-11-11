/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodirectorio;

/**
 *
 * @author jefersson
 */
public class Objeto {
    protected String nombre;
    protected int tamaño;
    
    public Objeto(String nombre, int tamaño){
    
    this.nombre=nombre;
    this.tamaño=tamaño;
    
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    @Override
    public String toString(){

return "Nombre :"+nombre+" Tamaño :"+tamaño;

}    
    
    
    
}
