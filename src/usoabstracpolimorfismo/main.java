/*
   este ejercicio se crean 3 clases, una llamada factura(padre) y dos
facturas mas llamadas facturaConIva y facturaSinIva que heredan de factura 
*/ 
package usoabstracpolimorfismo;

public class main {
    public static void main(String[] args) {
        // se crean dos objetos 
        
        FacturaConIva f1 =new FacturaConIva();
        f1.setId("1");
        f1.setImporte(1000);
        
        FacturaSinIva f2= new FacturaSinIva();
        f2.setId("2");
        f2.setImporte(1000);
        
        System.out.println("total con iva es: "+f1.calcularTotal());
        System.out.println("total sin iva es: "+f2.calcularTotal());
    }
}
