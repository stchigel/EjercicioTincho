package tienda;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto {

    private List<Producto> items = new ArrayList<>();

    public Combo(String denominacion) {
        super(denominacion);
    }

    public void incorporar(Producto item) {
        items.add(item);
    }

    public void remover(Producto item) {
        items.remove(item);
    }

    public List<Producto> getItems() {
        return items;
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Producto item : items) {
            total = total + item.calcularPrecio();
        }
        return total;
    }

    @Override
    public int calcularStock() {
        if (items.isEmpty()) {
            return 0;
        }
        int menor = items.get(0).calcularStock();
        for (Producto item : items) {
            if (item.calcularStock() < menor) {
                menor = item.calcularStock();
            }
        }
        return menor;
    }
}
