
package usoabstracpolimorfismo;
public class FacturaSinIva extends Factura {
    @Override
    public double calcularTotal(){
        return this.getImporte();
    }
}
