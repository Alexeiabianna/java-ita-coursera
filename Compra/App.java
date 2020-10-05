public class App {
    public static void main(String[] args) {
        Compra c1 = new Compra(120);
        Compra c2 = new Compra(120, 5);
        System.out.println(c1.getNumeroParcelas()+" "+c1.getValorParcela()+" "+c1.getValorTotal());
        System.out.println(c2.getNumeroParcelas()+" "+c2.getValorParcela()+" "+c2.getValorTotal());
    }
}