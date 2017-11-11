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
public class Archivo_Sistem extends Objeto{
    protected String Tipo;
    
    public Archivo_Sistem(String nombre,int tamaño,String Tipo){
    super(nombre,tamaño);
    this.Tipo=Tipo;
    
    
    
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public void Buscar_Carpteta(){
    
    
    
    }
    
    
    
}
