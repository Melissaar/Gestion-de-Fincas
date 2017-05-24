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
public class Inquilino {
    
    private Local Local1;
    public void setLocal1(Local Local1p){
    
    this.Local1=Local1p;
    }
            public Local geLocal1(){
            return Local1;
            }
            
       private Edificio Edificio1;
    public void setEdificio1(Edificio Edificio1p){
    
    this.Edificio1=Edificio1p;
    }
            public Edificio getEdificio1(){
            return Edificio1;
            }      
            
            
    private Pisos Pisos1;
    public void setPisos1(Pisos Pisos1p){
    
    this.Pisos1=Pisos1p;
    }
            public Pisos getPisos1(){
            return Pisos1;
            }
            
            
    
   private String DNI;
   public void setDNI(String DNIp)
   {
   this.DNI=DNIp;
   }
   public String geDNI()
   {
   return DNI;
   }
   
         private String Nombre;
    public void setNombre(String Nombrep)
   {
   this.Nombre=Nombrep;
   }
   public String getNombre()
   {
   return Nombre;
   }
     private String Edad;
    public void setEdad(String Edadp)
   {
   this.Edad=Edadp;
   }
   public String getEdad()
   {
   return Edad;
   }

    private String Sexo;
    public void setSexo(String Sexop)
   {
   this.Edad=Sexop;
   }
   public String getSexo()
   {
   return Sexo;
   }
 private String Fotografia;
    public void setFotografia(String Fotografiap)
   {
   this.Edad=Fotografiap;
   }
   public String getFotografia()
   {
   return Fotografia;
   }
   
   
}


