public class Arrays {
    
    public static void main(String[] args) {
        
        //           0       1      2       3
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        // Mostra o tamanho do Array
        System.out.println(carros.length);
        //Mostrar todos os elementos do Array
        for (int i=0; i < carros.length; i++){
            System.out.println(carros[i]);
        }
        //Altera o valor de um elemento do array
        carros[0] = "Fusca";
        // Motrar um elemento especifico do array
        System.out.println(carros[2]);
        //Criar novo array para adicionar outro elemento
        //Precisa fazer uma copia do array original (carros)
        String[] novoCarros = new String[carros.length + 1];
        for (int i=0; i < carros.length; i++){
            novoCarros[i] = carros[i];
        }
        //Adiciona o novo carro no novo array com base no ultimo elemento do array carros
        novoCarros[carros.length] = "Toyota";
        //Mostra os valores do novo array
        for (String carro : novoCarros){
            System.out.println(carro);
        }

    }
}
