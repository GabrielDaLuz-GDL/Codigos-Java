import java.util.Scanner;
     public class CalculoImc {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            double altura = 0;
            double peso = 0;
            double imc = 0;
            int genero;

            System.out.println("Digite a sua altura: ");

            altura = sc.nextDouble();
            
            System.out.println("Digite o seu Peso: ");

            peso = sc.nextDouble();
            
            imc =  peso / ( altura * altura);
            
            System.out.println("Digite o seu Gênero: ");
            System.out.println("1. Homem");
            System.out.println("2. Mulher");
            
            genero =  sc.nextInt();
            
            System.out.println("Seu imc é: " + imc ); 
            
            if (genero == 1) {
                if (imc >= 39.9) {
                    System.out.println("Obesidade Mórbida");
                }
                else if (imc >= 30) {
                    System.out.println("Obesidade Moderada");
                }
                else if (imc >= 25) {
                    System.out.println("Obesidade Leve");
                }
                else if (imc >= 20) {
                    System.out.println("Normal");
                }
                else if (imc < 20) {
                    System.out.println("Abaixo do Normal");
                }
            }
            else  {
                if (imc >= 38.9) {
                    System.out.println("Obesidade Mórbida");
                }
                else if (imc >= 29) {
                    System.out.println("Obesidade Moderada");
                }
                else if (imc >= 24) {
                    System.out.println("Obesidade Leve");
                }
                else if (imc >= 19) {
                    System.out.println("Normal");
                }
                else if (imc < 19) {
                    System.out.println("Abaixo do Normal");
                }
            } 
        }
    }