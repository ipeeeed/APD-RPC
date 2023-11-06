import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);
        Scanner sc = new Scanner(System.in);
        // System.out.println("O Resultado da soma é: " + rpc.somar(1, 2));

        //Desenvolver  o menu
        System.out.println("Bem vindo(a), esculha uma das opções abaixo:\n\n");
        System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5.Outros calculos");
        String opcao = sc.nextLine();
        System.out.println(opcao);
    }
}
