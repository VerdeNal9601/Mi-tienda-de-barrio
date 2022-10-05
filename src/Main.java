public class Main {
    public static void main(String[] args) {

        proveedores op = new proveedores("AURALAC","COLANTA");
        clientes op1 = new clientes("ARMANDOPEREZ","GLORIACALLE","HERNANDOCASTRO","CAMILOTORRES");
        entradas op2 = new entradas(15,5,"14",11);
        salidas op3 = new salidas(14,5,12000,"14/02/22");
        devoluciones op4 = new devoluciones(051,3,0254);
        ventas op5 = new ventas(023,1040021254,0547);
        articulos op6 = new articulos(63,"azucar","manuelita","100");

        System.out.println(op);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);
        System.out.println(op5);
        System.out.println(op6);

    }

}
