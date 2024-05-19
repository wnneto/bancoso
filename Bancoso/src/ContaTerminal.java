import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Digite sua agência:");
            String agencia = scanner.next();
    
            System.out.println("Digite sua conta:");
            String conta = scanner.next();
    
            System.out.println("Nome do Cliente:");
            String cliente = scanner.next();
            
    
            System.out.println("Aguarde um momento, estamos verificando.");

            System.out.println("Prontinho " + cliente + ", sua conta " + conta + " agência " + agencia + ", foi acessada com sucesso.");
            System.out.println("Deseja visualizar seu saldo? [1] SIM - [2] NÃO");
            int visualizar = scanner.nextInt();

            if (visualizar == 1){
                System.out.println("Seu saldo é de : R$ 257,83");
            } else if (visualizar == 2){
                System.out.println("Finalizando atendimento...");
            } else {
                System.out.println("Opção Inválida...");
            }
            scanner.close();
    }




  /**  public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escolha sua opção: [1] - Acessar [2] - Criar Conta");
        int opção = scanner.nextInt();

        if (opção == 1) {
            System.out.println("Opção 1");
        } else if (opção == 2) {
            ContaTerminal app = new ContaTerminal();
            User user = app.new User();
            System.out.println(user);
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
        
    }
    */



}
