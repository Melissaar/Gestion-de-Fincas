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
public class CuentadeBancos {
    private MovimientoBancario MovimientoBancario1;
    public void setMovimientoBancario1(MovimientoBancario MovimientoBancario1p){
    
    this.MovimientoBancario1=MovimientoBancario1p;
    }
            public MovimientoBancario getMovimientoBancario1(){
            return MovimientoBancario1;
            }
            
            
    private String Acreedor;
    public void setAcreedor(String Acreedorp)
   {
   this.Acreedor=Acreedorp;
   }
   public String getAcreedor()
   {
   return Acreedor;
   }
   
    private String Deudor;
   public void setDeudor(String Deudorp)
   {
   this.Deudor=Deudorp;
   }
   public String getDeudor()
   {
   return Deudor ;
   }
    private double Saldo;
   public void setSaldo (double  Saldop)
   {
   this.Saldo=Saldop;
   }
   public double  getSaldo()
   {
   return Saldo;
   }
   
}
   



