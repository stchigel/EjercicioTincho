package tienda;

public class Main {

    public static void main(String[] args) {
        ProductoSimple hamburguesa = new ProductoSimple("Hamburguesa", 4500, 20);
        ProductoSimple papas = new ProductoSimple("Papas fritas", 2800, 12);
        ProductoSimple gaseosa = new ProductoSimple("Gaseosa 500ml", 1800, 30);
        ProductoSimple postre = new ProductoSimple("Postre helado", 2200, 8);

        System.out.println("== Productos simples ==");
        System.out.println(hamburguesa);
        System.out.println(papas);
        System.out.println(gaseosa);
        System.out.println();

        Combo comboClasico = new Combo("Combo Clasico");
        comboClasico.incorporar(hamburguesa);
        comboClasico.incorporar(papas);
        comboClasico.incorporar(gaseosa);

        Combo comboFamiliar = new Combo("Combo Familiar");
        comboFamiliar.incorporar(comboClasico);
        comboFamiliar.incorporar(postre);

        System.out.println("== Combos ==");
        System.out.println(comboClasico);
        System.out.println(comboFamiliar);
        System.out.println();

        Producto comboEnPromo = new Descuento(comboClasico, 1500);
        Producto comboParaLlevar = new Packaging(comboEnPromo, "carton", 600, 5);
        Producto postreRegalo = new Packaging(new Descuento(postre, 200), "caja", 350, 25);

        System.out.println("== Productos decorados ==");
        System.out.println(comboEnPromo);
        System.out.println(comboParaLlevar);
        System.out.println(postreRegalo);
        System.out.println();

        System.out.println("Stock del Combo Familiar antes de reponer: " + comboFamiliar.calcularStock());
        postre.reponer(40);
        System.out.println("Stock del Combo Familiar despues de reponer postres: " + comboFamiliar.calcularStock());
    }
}
