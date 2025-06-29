/*
Leia o nome de 5 alunos
Leia 4 notas para cada aluno
Calcule a média de cada aluno
Informe se cada aluno foi aprovado ou reprovado (nota mínima para aprovação: 6.0)
*/

import java.util.Scanner;

public class ArraysExemplo {

    public static void main(String[] args){
        String[] alunos = new String[5];
        double[] media = new double[5];
        
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Digite o nome do aluno " +(i+1)+": ");
            alunos[i] = scanner.nextLine();

            double notas = 0; 

            for (int y=0; y<4; y++){
                System.out.println("Digite a nota "+(y+1)+" do aluno "+alunos[i]+": ");
                notas = notas + scanner.nextDouble();
            }    
            
            scanner.nextLine(); //Limpa o buffer

            media[i] = notas / 4;
        }

        System.out.println("Resultados: ");
        System.out.println("------------");

        for (int i=0; i<5; i++){
            System.out.println("Nome: "+alunos[i]+" - Media: "+media[i]);
        }
    }
}