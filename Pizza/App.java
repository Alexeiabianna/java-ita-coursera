public class App{
    public static void main(String[] args){
        System.out.println("---- Qual o preço da pizza? ----");
        System.out.println();
        
        //Ingredientes solicitados.
        String a = "Calabresa";
        String b = "Mussarela";
        String c = "Portuguesa";
        String d = "4 Queijos";
        String e = "Frango";

        Pizza p1 = new Pizza();
        p1.addIng(a);
        p1.addIng(b);        
        
        System.out.println("Quantidade de ingredientes: "+p1.getIng());
        System.out.println("Ingredientes Adicionados: \n"+p1);
        System.err.println("Valor da Pizza: R$"+p1.getPrice());
        System.err.println();

        Pizza p2 = new Pizza();
        p2.addIng(a);
        p2.addIng(b);
        p2.addIng(c);
        p2.addIng(d);
        
        System.out.println("Quantidade de ingredientes: "+p2.getIng());
        System.out.println("Ingredientes Adicionados: \n"+p2);
        System.err.println("Valor da Pizza: R$"+p2.getPrice());
        System.err.println();
        
        Pizza p3 = new Pizza();
        p3.addIng(a);
        p3.addIng(b);
        p3.addIng(e);
        p3.addIng(c);
        p3.addIng(d);
        p3.addIng(d);

        System.out.println("Quantidade de ingredientes: "+p3.getIng());
        System.out.println("Ingredientes Adicionados: \n"+p3);
        System.err.println("Valor da Pizza: R$"+p3.getPrice());
        System.err.println();

        //Carrinho de Compras.
        Cart c1 = new Cart();
        c1.addItem(p1);
        c1.addItem(p2);
        c1.addItem(p3);
        double total = c1.getTotal();
        System.out.println("TOTAL PEDIDO = R$"+total);
        
    }
   
}
