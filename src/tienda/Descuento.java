package tienda;

public class Descuento extends DecoradorProducto {

    private double montoDescuento;

    public Descuento(Producto envuelto, double montoDescuento) {
        super(envuelto);
        this.montoDescuento = montoDescuento;
    }

    @Override
    public double calcularPrecio() {
        double precio = envuelto.calcularPrecio() - montoDescuento;
        if (precio < 0) {
            return 0;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " [-$" + montoDescuento + "]";
    }
}
