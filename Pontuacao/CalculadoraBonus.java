public class CalculadoraBonus {
    
    public int bonusDoDia = 1;
    
    public int bonus(Usuario u){
        int mult = bonusDoDia;
        if(u.vip)
            mult *= 5;
        return mult;
    }
}