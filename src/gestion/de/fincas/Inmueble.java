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
public class Inmueble {
    
    private Edificio Edificio1;
    public void setEdificio1( Edificio Edificio1p)
    {
    this.Edificio1=Edificio1p;
    
    }
    public Edificio getEdificio1(){
    return Edificio1;
    }
    
    
    private String Direccion;
    public void setDireccion( String Direccionp)
    {
    this.Direccion=Direccionp;
    
    }
    public String getDireccion(){
    return Direccion;
    }
    
    private int Numero;
    public void setNumero(int Numerop)
    {
    this.Numero=Numerop;
    
    }
    public int getNumero(){
    return Numero;
    }
    
     private int Codigo_Postal;
    public void setCodigo_Postal(int Codigo_Postalp)
    {
    this.Codigo_Postal=Codigo_Postalp;
    
    }
    public int getCodigo_Postal(){
    return Codigo_Postal;
    }
    
}
