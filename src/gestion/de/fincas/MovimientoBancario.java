/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.fincas;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class MovimientoBancario {
    
    private Local Local1;
    public void setLocal1(Local Local1p){
    
    this.Local1=Local1p;
    }
            public Local geLocal1(){
            return Local1;
            }
    private Pisos Pisos1;
    public void setPisos1(Pisos Pisos1p){
    
    this.Pisos1=Pisos1p;
    }
            public Pisos getPisos1(){
            return Pisos1;
            }
    
    
      private Edificio Edificio1;
    public void setEdificio1(Edificio Edificio1p){
    
    this.Edificio1=Edificio1p;
    }
            public Edificio getEdificio1(){
            return Edificio1;
            }      
    
    private Date FechaRealizado;
    public void setFechaRealizado(Date FechaRealizadop)
   {
   this.FechaRealizado=FechaRealizadop;
   }
   public Date getFechaRealizado()
   {
   return FechaRealizado;
   }

}
