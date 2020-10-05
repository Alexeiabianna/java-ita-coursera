public class Cart{
    private Pizza[] item;    
    private int count;
    private double total = 0;
    private final int CAPACITY = 1000;
    

    public Cart(){
        this.item = new Pizza[CAPACITY];
        this.total = total;      
    }

    public int getPedido(){
        return count;
    }

    public boolean addItem(Pizza e){
        if(count == CAPACITY)
            return false;
        item[count] = e;
        count++;
        return true;
    }

    public double getTotal(){             
        for(int i=0; i<count; i++){
            total += item[i].getPrice();             
        }
        return total;
    }

    public String toString(){
        String str = "";
        return str;
    }
}
