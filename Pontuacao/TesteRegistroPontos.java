public class TesteRegistroPontos {
    public static void main(String[] args){
        Usuario u = new Usuario();
        u.nome = "Guerra";
        u.vip = true;

        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;

        RegistroPontos rp = new RegistroPontos(cb);
        rp.CriarUmTopico(u);
        rp.darUmLike(u);
        

        System.out.println("Pontuação do Usuário: "+ u.nome +" "+ u.pontos + " pontos");

    }
    

    
}
