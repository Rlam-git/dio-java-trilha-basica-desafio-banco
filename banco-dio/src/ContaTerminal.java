import java.util.Scanner;

public class ContaTerminal {

    private static Conta cadastrarConta(Scanner in){

        Conta novaConta = new Conta();

            try {

                System.out.printf("\n Por favor, digite  o número da conta: ");
                novaConta.setNumeroConta(in.nextInt());

                System.out.printf("\n Por favor, digite o numero da agência: ");
                novaConta.setAgencia(in.next());

                System.out.printf("\n Por favor, digite  o nome do cliente: ");
                in.nextLine();
                String nome = in.nextLine();
                novaConta.setNomeCliente(nome);

                System.out.printf("\n Por favor, digite o valor do depósito inicial: ");
                novaConta.setSaldo(in.nextBigDecimal());
                
             } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
             }


        System.out.println("\nOlá " + novaConta.getNomeCliente()
                             +", obrigado por criar uma conta em nosso banco, sua agência é "+ novaConta.getAgencia() 
                             +", conta "+novaConta.getNumeroConta()
                             +" e seu saldo "+novaConta.getSaldo()
                             +" já está disponível para saque."
                           );

        return novaConta;
    }


    public static void main(String[] args) throws Exception {
      
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        int opcaoMenu = 0;
        while(continuar){

             System.out.println("===============================");
             System.out.println("====     BANCO DIO JAVA    ====");
             System.out.println("===============================");

             System.out.println("\n Escolha o número da operação que deseja realizar...\n");
             System.out.println("1 - Cadastro");
             System.out.println( "0 - sair\n");
             System.out.printf( "Opção selecionada é : ");
             opcaoMenu = in.nextInt();

             switch(opcaoMenu){
                case 1:
                  cadastrarConta(in);
                  break;
                default:
                  continuar = false;                
             }      

        }

        in.close();
    }
}
