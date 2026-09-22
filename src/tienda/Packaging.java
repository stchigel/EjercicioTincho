package tienda;

public class Packaging extends DecoradorProducto {

    private String material;
    private double costoEmpaque;
    private int unidadesEmpaque;

    public Packaging(Producto envuelto, String material, double costoEmpaque, int unidadesEmpaque) {
        super(envuelto);
        this.material = material;
        this.costoEmpaque = costoEmpaque;
        this.unidadesEmpaque = unidadesEmpaque;
    }

    @Override
    public double calcularPrecio() {
        return envuelto.calcularPrecio() + costoEmpaque;
    }

    @Override
    public int calcularStock() {
        int stock = envuelto.calcularStock();
        if (unidadesEmpaque < stock) {
            return unidadesEmpaque;
        }
        return stock;
    }

    @Override
    public String toString() {
        return super.toString() + " + empaque " + material;
    }
}
