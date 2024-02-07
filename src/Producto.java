public abstract class Producto implements Comprable{
    private final String descripcion;
    private final double precioBruto;

    public Producto(String descripcion, double precioBruto) {
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        if (precioBruto < 0) {
            throw new IllegalArgumentException("El precio bruto debe ser mayor o igual que 0");
        }
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public abstract double getPrecioNeto();

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion + ": " + precioBruto + "€";
    }
}