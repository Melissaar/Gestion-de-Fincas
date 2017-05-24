/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.fincas;

/**
 *
 * @author SENA
 */
public class Ingresos extends MovimientoBancario {
    
    
    
    
    private Local Local1;
    public void setLocal1(Local Local1p){
    
    this.Local1=Local1p;
    }
            public Local geLocal1(){
            return Local1;
            }
    
         
    private Inmueble Inmueble1;
    public void setInmueble1(Inmueble Inmueble1p){
    
    this.Inmueble1=Inmueble1p;
    }
            public Inmueble getInmueble1(){
            return Inmueble1;
            }
            
            
     private Pisos Pisos1;
    public void setPisos1(Pisos Pisos1p){
    
    this.Pisos1=Pisos1p;
    }
            public Pisos getPisos1(){
            return Pisos1;
            }
}
