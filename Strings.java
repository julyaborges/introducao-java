public class Strings {

    public static void main(String[] args){

        String senha = "ABC";

        if (senha.length() > 3){
            System.out.println("Senha válida.");
        }else{
            System.out.println("Senha inválida. Tamanho: "+senha.length());
        }

        System.out.println("LowerCase: "+senha.toLowerCase());
        System.out.println("UpperCase: "+senha.toUpperCase());
        System.out.println("Normal case: "+senha);

        //Localizar caracteres
        String texto = "Hoje e terça-feira";
        System.out.println(texto.indexOf("e"));

        //Concatenar
        String nome = "Marcelo";
        String sobrenome = "Petri";
        System.out.println(nome+" "+sobrenome);
        System.out.println(nome.concat(" ").concat(sobrenome));

        String numero1 = "10";
        String numero2 = "20";
        System.out.println(numero1+numero2);

        System.out.println("Hoje esta fazendo \"calor\" e frio");
        System.out.println("Hoje esta fazendo \tcalor e frio");
    }    
}