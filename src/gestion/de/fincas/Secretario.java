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
public class Secretario {
    
    private Recibo Recibo1;
    public void setRecibo1(Recibo Recibo1p)
    {
    this.Recibo1=Recibo1p;
    
    }
    public Recibo getRecibo1(){
    return Recibo1;
    }
    
    
    private MovimientoBancario MovimientoBancario1;
    public void setMovimientoBancario1(MovimientoBancario MovimientoBancario1p)
    {
    this.MovimientoBancario1=MovimientoBancario1p;
    
    }
    public MovimientoBancario getMovimientoBancario1(){
    return MovimientoBancario1;
    }
}
