package tienda;

public abstract class Producto {

    protected String denominacion;

    protected Producto(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public abstract double calcularPrecio();

    public abstract int calcularStock();

    @Override
    public String toString() {
        return getDenominacion() + " -> $" + calcularPrecio() + " (stock: " + calcularStock() + ")";
    }
}
