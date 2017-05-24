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
public class Recibo {
    
    private Pisos Pisos1;
    public void setPisos1(Pisos Pisos1p)
    {
    this.Pisos1=Pisos1p;
    
    }
    public Pisos getPisos1(){
    return Pisos1;
    }
    
    
    private Local Local1;
    public void setLocal1(Local Local1p)
    {
    this.Local1=Local1p;
    
    }
    public Local getLocal1(){
    return Local1;
    }
    
    
    private String NºRecibo;
    public void setNºRecibo( String NºRecibop)
    {
    this.NºRecibo=NºRecibop;
    
    }
    public String getNºRecibo(){
    return NºRecibo;
    }
    
    private Date Fecha_Emision;
    public void setFecha_Emision(Date Fecha_Emisionp)
    {
    this.Fecha_Emision=Fecha_Emisionp;
    
    }
    public Date getFecha_Emision(){
    return Fecha_Emision;
    }
    
    private int Renta;
    public void setRenta(int Rentap)
    {
    this.Renta=Rentap;
    
    }
    public int getRenta(){
    return Renta;
    }
    
    private int Agua;
    public void setAgua(int Aguap)
    {
    this.Agua=Aguap;
    
    }
    public int getAgua(){
    return Agua;
    }
    
    private int Luz;
    public void setLuz(int Luzp)
    {
    this.Luz=Luzp;
    
    }
    public int getLuz(){
    return Luz;
    }
    
    private int IPC_Anual;
    public void setIPC_Anual(int IPC_Anualp)
    {
    this.IPC_Anual=IPC_Anualp;
    
    }
    public int getIPC_Anual(){
    return IPC_Anual;
    } 
   
    
    private int Porteria;
    public void setPorteria(int Porteriap)
    {
    this.Porteria=Porteriap;
    
    }
    public int getPorteria(){
    return Porteria;
    } 
    
    private int IVA;
    public void setIVA(int IVAp)
    {
    this.IVA=IVAp;
    
    }
    public int getIVA(){
    return IVA;
    } 
    
}
