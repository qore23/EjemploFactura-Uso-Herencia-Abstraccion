
package usoabstracpolimorfismo;

public class FacturaConIva extends Factura{

  
  @Override
  public double calcularTotal(){
      return this.getImporte()*1.19;
  }
    
}
