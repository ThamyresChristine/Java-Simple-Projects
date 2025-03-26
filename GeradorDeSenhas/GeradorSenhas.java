package GeradorDeSenhas;

//import java.util.Random;
//import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;


public class GeradorSenhas {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho");
        int comprimento = input.nextInt();; // Comprimento padrão da senha
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        
        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }
        
        System.out.println("Senha gerada: " + senha.toString());

        input.close();


    }


}

