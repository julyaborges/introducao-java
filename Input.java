import java.util.Scanner;

public class Input {

    public static void main(String[] args){

        // Entrada de dados
        Scanner scanner = new Scanner(System.in); //Instancia de uma classe (Classe -> objeto)
        System.out.println("Digite o seu nome: "); 
        String nome = scanner.nextLine();
        System.out.println("Nome: "+nome);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Seu nome é "+nome+" e você tem "+idade+" anos.");

        // Saída de informação 
        System.out.println("hello word");
        System.out.println("Hoje faz 7 graus");
    }
}