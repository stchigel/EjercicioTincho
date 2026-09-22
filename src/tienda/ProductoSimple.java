package tienda;

public class ProductoSimple extends Producto {

    private double precioUnitario;
    private int unidadesDisponibles;

    public ProductoSimple(String denominacion, double precioUnitario, int unidadesDisponibles) {
        super(denominacion);
        this.precioUnitario = precioUnitario;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public double calcularPrecio() {
        return precioUnitario;
    }

    @Override
    public int calcularStock() {
        return unidadesDisponibles;
    }

    public void reponer(int cantidad) {
        this.unidadesDisponibles = this.unidadesDisponibles + cantidad;
    }
}
