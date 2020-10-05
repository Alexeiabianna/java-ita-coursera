public class App {
    public static void main(String[] app){
        System.out.println("Cálculo de IMC");
        Paciente p1 = new Paciente(60.00, 1.67);
        Paciente p2 = new Paciente(65.00, 1.71);
        Paciente p3 = new Paciente(120.00, 1.80);

        p1.calcularIMC();
        p2.calcularIMC();
        p3.calcularIMC();

        System.out.println(p1.diagnostico());
        System.out.println(p2.diagnostico());
        System.out.println(p3.diagnostico());
    }

    public static class Paciente {
        private double peso;
        private double altura;
    
        public Paciente(double kg, double h){
            this.peso = kg;
            this.altura = h;
        }
    
        public double calcularIMC(){
            double imc = 0;
            imc = peso/(altura * altura);
            return imc;
        }
    
        public String diagnostico(){
            String str = "";
            double imc = calcularIMC();
    
            if(imc<16)
                return str = str + "Baixo peso muito grave";
                    
            else if (imc>16 && imc<=16.99)
                return str = str + "Baixo peso grave";
                    
            else if (imc>17 && imc<=18.49)
                return str = str + "Baixo peso";
                    
            else if (imc>18.50 && imc<=24.99)
                return str = str + "Peso normal";
                    
            else if (imc>25 && imc<=29.99)
                return str = str + "Sobrepeso";
                    
            else if (imc>30 && imc<=34.99)
                return str = str + "Obesidade grau I";
                    
            else if (imc>35 && imc<=39.99)
                return str = str + "Obesidade grau II";
                    
            else if (imc>=40)
                return str = str + "Obesidade grau III (obesidade mórbida)";
                    
            else
                return str = "Fora de aplicação.";        
        }
    
    }
}