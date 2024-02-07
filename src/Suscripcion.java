public class Suscripcion implements Comprable{
    private final String descripcion;
    private int existencias;
    private final double precio;

    public Suscripcion(String descripcion, int existencias, double precio) {
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio bruto debe ser mayor o igual que 0");
        }
        if (existencias < 0) {
            throw new IllegalArgumentException("No puedes tener existencias negativas");
        }
        this.descripcion = descripcion;
        this.existencias = existencias;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        return true;
    }

    @Override
    public void cogerUnidad() {
        if(existencias == 0) {
            throw new NoHayExistenciasException();
        } else {
            existencias--;
        }
    }

    @Override
    public double getPrecioVenta() {
        return precio;
    }

    @Override
    public String toString() {
        return getDescripcion() + " = " + getPrecioVenta() + "€";
    }
}
