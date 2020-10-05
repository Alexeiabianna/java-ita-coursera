public class Pizza {
    private final int CAPACITY = 10;
    private double value1 = 15.00;   
    private String[] ingredientes;
    private int countIng;    
    
    public Pizza(){
        this.ingredientes = new String[CAPACITY];        
    }

    public boolean addIng(String e){
        if(countIng == CAPACITY)
            return false;
        ingredientes[countIng] = e;
        countIng++;
        return true;
    }

    public int getIng(){
        return countIng;
    }

    public double getPrice(){
        int n = countIng;
        if(n <= 2)
            return value1;
        else if(n>=3 && n<=5)
            return value1 + 5.00;
        else if(n>5)
            return value1 + 8.00;
        else 
            return 0;
    }
    
    public String toString(){
        String str = "";
        for(int i=0; i<countIng; i++){
            str += ingredientes[i] + "\n";
        }
        return str;
    }

}