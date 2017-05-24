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
public class Edificio {
        private final Inmueble  Inmueble1 = new  Inmueble();
        private String Pisos;
   public void setPisos(String Pisosp)
   {
   this.Pisos=Pisosp;
   }
   public String getPisos()
   {
   return Pisos;
   }
       private String Locales;
   public void setLocales(String Localesp)
   {
   this.Locales=Localesp;
   }
   public String getLocales()
   {
   return Locales;
   }
   
}




