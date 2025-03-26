package Calculadora;
import java.util.Scanner;

public class UsuarioCalculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ConfigCalc calc = new ConfigCalc();
        
        
        System.out.println("Bem-vindo à calculadora!");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Escolha a operação:");
        System.out.println("1. Adição (+)");
        System.out.println("2. Subtração (-)");
        System.out.println("3. Multiplicação (*)");
        System.out.println("4. Divisão (/)");

        int escolha = scanner.nextInt();
        double resultado;

        switch (escolha) {
            case 1:
                resultado = calc.somar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                try {
                    resultado = calc.dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}
