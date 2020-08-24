public class Empregado{
    private String  nome;
    private String  cargo;
    private double salario;



    void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
    }
    void aumentarSario(double Percentual){
        salario = (Percentual / 100) * salario + salario ;
    }
}   