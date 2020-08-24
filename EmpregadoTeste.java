import java.util.Scanner;
public class EmpregadoTeste{
    public static void main(String args[]){

        Empregado emp1;

        emp1.Nome="Alberto";
        emp1.Cargo="Analista";
        emp1.Salario=2.00;
        
        emp1.exibirInfo(); 
        emp1.aumentarSalario(5); 
        emp1.exibirInfo(); 
    }
}