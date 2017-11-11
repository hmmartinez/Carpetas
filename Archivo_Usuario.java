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
public class Archivo_Usuario extends Objeto{
    protected String Extension;
    
    
    public Archivo_Usuario(String nombre ,int tamaño, String Extension){
   super(nombre,tamaño);
    this.Extension=Extension;
    }

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String Extension) {
        this.Extension = Extension;
    }
    
    
}
