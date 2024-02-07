public class Main {
    public static void main(String[] args) throws PresupuestoInsuficienteException {
        ProductoGeneral pg = new ProductoGeneral("Teclado", 8.99);
        ProductoReducido pr = new ProductoReducido("Teclado", 8.99);
        Suscripcion s = new Suscripcion("Suscripcion Netflix", 1, 3);

    // Pruebas Ej1
        System.out.println(pg);
        System.out.println(pr);
        System.out.println();

    // Pruebas Ej2
        CestaCompra cc = new CestaCompra(30);
        cc.addElemento(pg);
        cc.addElemento(pr);
        cc.addElemento(s);
        //cc.addElemento(s); // intenta añadir una suscripcion que esta fuera de stock

        cc.imprimir();
    }
}