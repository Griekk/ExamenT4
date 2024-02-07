public class ProductoReducido extends ProductoIVA {
    private static final double IVA = 0.05;

    public ProductoReducido(String descripcion, double precioBruto) {
        super(descripcion, precioBruto, IVA);
    }
}