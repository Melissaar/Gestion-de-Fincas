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
public class Local {
    private final Inmueble Inmueble1 = new Inmueble();
  
    
    private String Planta;
    public void setPlanta(String Plantap)
   {
   this.Planta=Plantap;
   }
   public String getPlanta()
   {
   return Planta;
   }
  
    private String Letra;
    public void setLetra(String Letrap)
   {
   this.Letra=Letrap;
   }
   public String geLetra()
   {
   return Letra;
   }

   
}
