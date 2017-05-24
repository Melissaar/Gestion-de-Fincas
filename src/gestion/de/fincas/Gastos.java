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
public class Gastos extends MovimientoBancario{
    
    private Inmueble Inmueble1;
    public void setInmueble1(Inmueble Inmueble1p)
    {
    this.Inmueble1 = Inmueble1p;
    }
    public Inmueble getInmueble1()
    {
    return Inmueble1;
    }
    
    private String Tipo_de_gasto;
    public void setTipo_de_gasto( String Tipo_de_gastop)
    {
    this.Tipo_de_gasto=Tipo_de_gastop;
    
    }
    public String getTipo_de_gasto(){
    return Tipo_de_gasto;
    }
}
