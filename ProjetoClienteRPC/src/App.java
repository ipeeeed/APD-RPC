import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);
        Scanner sc = new Scanner(System.in);
        int opcao = 99;

        //Desenvolver  o menu
        System.out.println("\nBem vindo(a)!\n");
        
        while (opcao != 0) {
            System.out.println("Escolha uma das opções abaixo:\n\n");
            System.out.println(" 1. Somar\n 2. Subtrair\n 3. Multiplicar\n 4. Dividir\n 5. Calcular a área quadrada\n 6. Calcular a área de um triângulo retângulo\n 7. Calcular a área de uma circunferência\n 8. Calcular a área de uma esfera\n 9. Calcular o volume de uma esfera\n10. Calcular a área de um cilindro\n11. Calcular o volume de um cilindro\n12. Calcular a área da superfície de um cubo\n13. Calcular o volume de um cubo\n 0. Sair\n");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("--------------------\nSOMAR\n--------------------");
                    System.out.println("Digite um número");
                    int somaUm = sc.nextInt();
                    System.out.println("Digite outro número");
                    int somaDois = sc.nextInt();
                    System.out.println("\nO resultado da soma é: " + rpc.somar(somaUm, somaDois));
                    break;
                case 2:
                    System.out.println("--------------------\nSUBTRAIR\n--------------------");
                    System.out.println("Digite um número");
                    int subtracaoUm = sc.nextInt();
                    System.out.println("Digite outro número");
                    int subtracaoDois = sc.nextInt();
                    System.out.println("\nO resultado da subtração é: " + rpc.subtrair(subtracaoUm, subtracaoDois));
                    break;
                case 3:
                    System.out.println("--------------------\nMULTIPLICAR\n--------------------");
                    System.out.println("Digite um número");
                    int multiplicacaoUm = sc.nextInt();
                    System.out.println("Digite outro número");
                    int multiplicacaoDois = sc.nextInt();
                    System.out.println("\nO resultado da multiplicação é: " + rpc.multiplicar(multiplicacaoUm, multiplicacaoDois));
                    break;
                case 4:
                    System.out.println("--------------------\nDIVIDIR\n--------------------");
                    System.out.println("Digite um número");
                    int divisaoUm = sc.nextInt();
                    System.out.println("Digite outro número");
                    int divisaoDois = sc.nextInt();
                    System.out.println("\nO resultado da divisão é: " + rpc.dividir(divisaoUm, divisaoDois));
                    break;
                case 5:
                    System.out.println("--------------------\nCALCULAR ÁREA DO QUADRADO\n--------------------");
                    System.out.println("Digite o tamanho de um lado do quadrado");
                    int areaQuadrada = sc.nextInt();
                    System.out.println("\nA área quadrada é: " + rpc.calcularAreaQuadrada(areaQuadrada));
                    break;
                case 6:
                    System.out.println("--------------------\nCALCULAR ÁREA DO TRIÂNGULO RETÊNGULO\n--------------------");
                    System.out.println("Digite o valor do base do triangulo");
                    int base = sc.nextInt();
                    System.out.println("Digite o valor da altura do triangulo");
                    int altura = sc.nextInt();
                    System.out.println("\nA área do triângulo retângulo é: " + rpc.calcularAreaTrianguloRetangulo(base, altura));
                    break;
                case 7:
                    System.out.println("--------------------\nCALCULAR ÁREA DA CIRCUNFERÊNCIA\n--------------------");
                    System.out.println("Digite o valor do raio da circunferência");
                    int raioCircunferencia = sc.nextInt();
                    System.out.println("\nA área da circunferência é: " + rpc.calcularAreaCircunferencia(raioCircunferencia));
                    break;
                case 8:
                    System.out.println("--------------------\nCALCULAR ÁREA DA ESFERA\n--------------------");
                    System.out.println("Digite o valor do raio da esfera");
                    int raioEsfera = sc.nextInt();
                    System.out.println("\nA área da esfera é: " + rpc.calcularAreaEsfera(raioEsfera));
                    break;
                case 9:
                    System.out.println("--------------------\nCALCULAR VOLUME DA ESFERA\n--------------------");
                    System.out.println("Digite o valor do raio da esfera");
                    raioEsfera = sc.nextInt();
                    System.out.println("\nO volume da esfera é: " + rpc.calcularVolumeEsfera(raioEsfera));
                    break;
                case 10:
                    System.out.println("--------------------\nCALCULAR ÁREA DO CILINDRO\n--------------------");
                    System.out.println("Digite o valor do raio do cilindro");
                    int raioCilindro = sc.nextInt();
                    System.out.println("Digite agora o valor da altura do cilindro");
                    int alturaCilindro = sc.nextInt();
                    System.out.println("A área do cilindro é: " + rpc.calcularAreaCilindro(raioCilindro, alturaCilindro));
                    break;
                case 11:
                    System.out.println("--------------------\nCALCULAR VOLUME DO CILINDRO\n--------------------");
                    System.out.println("Digite o valor do raio do cilindro");
                    raioCilindro = sc.nextInt();
                    System.out.println("Digite agora o valor da altura do cilindro");
                    alturaCilindro = sc.nextInt();
                    System.out.println("O volume do cilindro é: " + rpc.calcularVolumeCilindro(raioCilindro, alturaCilindro));
                    break;
                case 12:
                    System.out.println("--------------------\nCALCULAR ÁREA DA SUPERFÍCIE DO CUBO\n--------------------");
                    System.out.println("Digite o valor de uma das faces do cubo");
                    int faceCubo = sc.nextInt();
                    System.out.println("A área da superfície do cubo é: " + rpc.calcularAreaSuperficieCubo(faceCubo));
                    break;
                case 13:
                    System.out.println("--------------------\nCALCULAR VOLUME DO CUBO\n--------------------");
                    System.out.println("Digite o valor de uma das faces do cubo");
                    faceCubo = sc.nextInt();
                    System.out.println("O volume do cubo é: " + rpc.calcularVolumeCubo(faceCubo));
                    break;
                case 0:
                    System.out.println("Até Logo!");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;
            }
        }
    }
}
