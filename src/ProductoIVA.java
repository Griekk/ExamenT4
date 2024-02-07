
public class ProductoIVA extends Producto {
    private final double iva;
    public ProductoIVA(String descripcion, double precioBruto, double iva) {
        super(descripcion, precioBruto);
        this.iva = iva;
    }

    @Override
    public double getPrecioNeto() {
        return getPrecioBruto() + getPrecioBruto()*iva;
    }

    @Override
    public String toString() {
        return getDescripcion() + ": " + getPrecioBruto() + "€ + " + iva*100 + "%" + " = " + String.format("%.2f", getPrecioNeto()) + "€";
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        return true;
    }

    @Override
    public void cogerUnidad() {
    }

    @Override
    public double getPrecioVenta() {
        return getPrecioNeto();
    }
}
