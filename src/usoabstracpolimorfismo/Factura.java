/*
   este ejercicio se crean 3 clases, una llamada factura(padre) y dos
facturas mas llamadas facturaConIva y facturaSinIva que heredan de factura 
*/ 
package usoabstracpolimorfismo;

public abstract class Factura {
    private String id;
    private double importe;
    
    //metodos constructores
    public Factura() {
    }
    public Factura(String id, double importe) {
        this.id = id;
        this.importe = importe;
    }
    
    // se encapsula los atributos
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getImporte() {
        return importe;
    }
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    //metodo abstracto
    
    public abstract double calcularTotal();
    
}
