import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double Saldo = 237.48;

        System.out.println("Qual o número da sua conta?");
        int NumeroConta = scanner.nextInt();

        System.out.println("Qual sua agência?");
        String Agencia = scanner.next();

        System.out.println("Qual seu nome?");
        String Nome = scanner.next();

        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");
    }

}




