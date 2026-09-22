package tienda;

public abstract class DecoradorProducto extends Producto {

    protected Producto envuelto;

    protected DecoradorProducto(Producto envuelto) {
        super(envuelto.getDenominacion());
        this.envuelto = envuelto;
    }

    @Override
    public double calcularPrecio() {
        return envuelto.calcularPrecio();
    }

    @Override
    public int calcularStock() {
        return envuelto.calcularStock();
    }

    public Producto getEnvuelto() {
        return envuelto;
    }
}
