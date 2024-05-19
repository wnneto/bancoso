import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 25.0;
        // saldo inicial do usuário

        System.out.println("Digite o valor do saque:");
        // Usuário irá informar valor do saque.
        Double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo) {
        // Teste lógico (SE o valor do SAQUE for menor que o SALDO).
            saldo = saldo - valorSolicitado;   
        System.err.println(saldo);
        // Print do resultado SALDO INICIAL - SAQUE.    
    }else if(valorSolicitado > saldo) {
        // Teste lógico (SE o valor do SAQUE for maior que o SALDO).
        System.err.println("Saldo insuficiente");
    }

}
}
