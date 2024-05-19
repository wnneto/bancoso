import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {

        String[] senhasValidas = {
            "3787"
        };

        Scanner scanner = new Scanner(System.in);
        
        // Variável para armazenar a senha
        String senhaFornecida;
        
        // Loop para 5 tentativas
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a senha (tentativa " + i + " de 5): ");
            senhaFornecida = scanner.nextLine();
            
            boolean senhaValida = false;
            for (String senha : senhasValidas) {
                if (senhaFornecida.equals(senha)) {
                    senhaValida = true;
                    break;
                }
            }
            
            if (senhaValida) {
                System.out.println("Senha correta! Acessando o Sistema.");
                return; // Sai do programa
            } else {
                if (i < 5) {
                    System.out.println("Senha incorreta. Você tem " + (5 - i) + " tentativa(s) restante(s).");
                } else {
                    System.out.println("Senha incorreta. Fechando Programa!");
                }
            }
        }
        
        scanner.close();
    }
}
