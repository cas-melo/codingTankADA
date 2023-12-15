package CodingTankADA;

// Sei que não deveria usar o metodo .equals para fazer as comparações, mas utilizando a forma unidadeEntrada == "C" estava causando muitos bugs.
// Sei que o programa deveria retornar quando recebesse a unidade inválida ao invés de terminar porém o tempo é corrido :( 



import java.util.Scanner;

public class Coding2 {
    public static void main(String[] args) {

        double resultadoTemperatura = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura:");
        double temperatura = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left after nextDouble()
        System.out.println("Informe a unidade de origem da temperatura (C, K ou F)");
        String unidadeEntrada = scanner.nextLine();

        if (!(unidadeEntrada.equals("C") || unidadeEntrada.equals("K") || unidadeEntrada.equals("F"))) {
            System.out.println("Por favor, digite uma entrada válida (C, K ou F)");
        } else {
            System.out.println("Informe a unidade de saída da temperatura (C, K ou F)");
            String unidadeSaida = scanner.nextLine();

            if (!(unidadeSaida.equals("C") || unidadeSaida.equals("K") || unidadeSaida.equals("F"))) {
                System.out.println("Por favor, digite uma entrada válida (C, K ou F)");
            } else {
                if (unidadeEntrada.equals("C") && unidadeSaida.equals("K")) 
                {
                    resultadoTemperatura = temperatura + 273.15;
                    System.out.printf("C %.2f K = %.2f", temperatura, resultadoTemperatura);

                } 
                
                else if (unidadeEntrada.equals("C") && unidadeSaida.equals("F")) 
                {
                    resultadoTemperatura = (temperatura * 9 / 5) + 32;
                    System.out.printf("C %.2f F = %.2f", temperatura, resultadoTemperatura);
                } 
                
                else if (unidadeEntrada.equals("K") && unidadeSaida.equals("C")) 
                {
                    resultadoTemperatura = temperatura - 273.15;
                    System.out.printf("K %.2f C = %.2f", temperatura, resultadoTemperatura);
                } 
                
                else if (unidadeEntrada.equals("K") && unidadeSaida.equals("F")) 
                {
                    resultadoTemperatura = (temperatura - 273.15) * 9 / 5 + 32;
                    System.out.printf("K %.2f F = %.2f", temperatura, resultadoTemperatura);
                } 
                else if (unidadeEntrada.equals("F") && unidadeSaida.equals("C")) 
                {
                    resultadoTemperatura = (temperatura - 32) * 5 / 9;
                    System.out.printf("F %.2f C = %.2f", temperatura, resultadoTemperatura);
                } 
                
                else if (unidadeEntrada.equals("F") && unidadeSaida.equals("K"))     
                {
                    resultadoTemperatura = (temperatura - 32) * 5 / 9 + 273.15;
                    System.out.printf("F %.2f K = %.2f", temperatura, resultadoTemperatura);
                }
            }
        }
    }
}
