public class ProductoGeneral extends ProductoIVA {
    private static final double IVA = 0.21;

    public ProductoGeneral(String descripcion, double precioBruto) {
        super(descripcion, precioBruto, IVA);
    }
}
