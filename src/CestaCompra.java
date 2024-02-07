import java.util.ArrayList;
import java.util.List;

public class CestaCompra {
    private double presupuesto;
    private List<Comprable> cesta = new ArrayList<>();

    public CestaCompra(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Comprable> getCesta() {
        return cesta;
    }

    public void addElemento(Comprable c) throws PresupuestoInsuficienteException {
        if (c.getPrecioVenta()+ getPrecioCesta() > presupuesto) {
            throw new PresupuestoInsuficienteException();
        }
        cesta.add(c);
        c.cogerUnidad();
    }

    public double getPrecioCesta() {
        double precioTotal = 0;
        for (Comprable c : cesta) {
            precioTotal += c.getPrecioVenta();
        }
        return precioTotal;
    }

    void imprimir() {
        System.out.println("CESTA DE LA COMPRA");
        for (Comprable c : cesta) {
            System.out.println(c);
        }
        System.out.printf("Suma: %.2f €\n", getPrecioCesta());
        System.out.println("Presupuesto: " + presupuesto + "€");
        System.out.printf("Restante: %.2f €\n", (presupuesto-getPrecioCesta()));
    }
}
