/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodirectorio;

import java.util.ArrayList;

/**
 *
 * @author jefersson
 */
public class Directorio extends Objeto{
    protected String permisos;
   protected ArrayList<Objeto> directorios;
   

   
   public Directorio(String nombre,int tamaño,String permisos,ArrayList<Objeto> directorios){
   
       super(nombre,tamaño);
   this.directorios=directorios;
       this.permisos=permisos;
   
   
   }

    public String getPermisos() {
        return permisos;
    }

    public ArrayList<Objeto> getDirectorios() {
        return directorios;
    }
   
     public void addCarpeta(Directorio nueva)
    {
        if(directorios != null)
            directorios.add(nueva);
        else
        {
            directorios = new ArrayList<Objeto>();
            directorios.add(nueva);
        }
    }
   
     
     
      public void addArchivoUsuario(Archivo_Usuario nuevo)
    {
        if(directorios != null)
            directorios.add(nuevo);
        else
        {
            directorios = new ArrayList<Objeto>();
            directorios.add(nuevo);
        }
    }
     
     
      public void addArchivoSistema(Archivo_Sistem nuevo)
    {
        if(directorios != null)
            directorios.add(nuevo);
        else
        {
            directorios = new ArrayList<Objeto>();
            directorios.add(nuevo);
        }
    }
    
    public Directorio buscar_Carpeta(String nombre)
    {
        if(nombre.equals(this.nombre))
            return this;
        
        if(this.directorios == null)
            return null;
        else
        {
            for(int i = 0; i < directorios.size(); i++)
            {
                Directorio tmp = (Directorio) directorios.get(i);
                tmp = tmp.buscar_Carpeta(nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        
        return null;
    }
    public String toString(){
    return super.toString()+"Permisos :"+permisos;
    
    }  
public void Prueba(){
System.out.print(directorios.size());


}
}

