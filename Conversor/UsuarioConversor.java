package Conversor;
import java.util.Scanner;

public class UsuarioConversor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ConfigConversor conversor = new ConfigConversor();

       System.out.println("Conversor de Unidades");
       System.out.println("Escolha a opção:");
       System.out.println("1. Celsius para Fahrenheit");
       System.out.println("2. Fahrenheit para Celsius");
       System.out.println("3. Metro para Quilometro");
       System.out.println("3. Quilometro para Metro");

       int escolha = input.nextInt();
       
       switch (escolha) {
        
            case 1:
               System.out.println("Digite o valor em Celsius:");
               double celsius = input.nextDouble();
               double resultadoUm = conversor.CelsiusParafahrenheit(celsius);
               System.out.println("Resultado: " + resultadoUm);
               break;
           case 2:
               System.out.println("Digite o valor em Fahrenheit:");
               double fahrenheit = input.nextDouble();
               double resultadoDois = conversor.FahrenheitParaCelsius(fahrenheit);
               System.out.println("Resultado: " + resultadoDois);
               break;
           case 3:
           System.out.println("Digite o valor em metros:");
               double metro = input.nextDouble();
               double resultadoTres = conversor.MetroParaQuilometro(metro);
               System.out.println("Resultado: " + resultadoTres);
               break;
           case 4:
               System.out.println("Digite o valor em quilometros:");
               double quilometros = input.nextDouble();
               double resultadoQuatro = conversor.QuilomentroParaMetro(quilometros);
               System.out.println("Resultado: " + resultadoQuatro);
               break;
           default:
               System.out.println("Opção inválida!");
       }

       input.close();

    }    
}
