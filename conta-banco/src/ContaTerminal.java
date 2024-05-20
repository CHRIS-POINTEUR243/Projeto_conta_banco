import java.util.Scanner; // chamada da biblioteca de scanner

public class ContaTerminal {
    public static void cliente_imprime(int numero, String agencia, String nome, double soldo) {

        System.out.println("olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " 123e seu saldo " + soldo +" já está disponível para saque");
       }
   
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in); // fazer nosso scanner
        int numero;
        String agencia;
        String nome;
        double soldo;
        // entrada via scanner
        System.out.println("Por favor, digite o número da conta  !");
        numero = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = entrada.next();
        System.out.println("Por favor, digite o seu nome !");
        nome = entrada.next();
        System.out.println("Por favor, digite o seu soldo ");
        soldo = entrada.nextDouble();

        // chamada da função para imprimir
        cliente_imprime(numero, agencia, nome,soldo);

    }
}
