
import java.util.Scanner;


    public class SistemaAtm {



    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;
            
            double saldo = 1000;
            
            do{
                System.out.println("\n====================");
                System.out.println("1 - Ver saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                System.out.println("Escolha uma das opções acima");
                
                option = scanner.nextInt();
                
                
                switch(option){
                    
                    case 1 -> System.out.println("Saldo atual: R$ " + saldo);
                        
                        
                    case 2 -> {

                        int optionDeposito;

                        do { 
                        System.out.println("\n====================");
                        System.out.println("1 - Depositar dinheiro");
                        System.out.println("2 - Voltar");
                        System.out.println("Escolha uma opção");

                        optionDeposito = scanner.nextInt();

                        switch(optionDeposito){

                            case 1 -> {
                                System.out.println("Digite o valor do deposito");
                                double deposito = scanner.nextDouble();

                                if( deposito > 0 ){
                                    saldo += deposito;

                                    System.out.println("Deposito realizado");
                                }else{
                                    System.out.println("Valor inválido");
                                }
                                break;
                            }

                            case 2 -> {
                                System.out.println("Voltando ao menu...");
                                break;
                            }
                            default -> {
                                System.out.println("Opção inválida");
                            }

                        }
                            
                        } while (optionDeposito != 2);

                        // System.out.println("Valor do deposito: ");
                        // double deposito = scanner.nextDouble();

                        
                        // saldo = saldo + deposito;
                        
                        // System.out.println("Deposito realizado");
                        // System.out.println("Saldo atual: R$ " + saldo);
                    }
                        
                    case 3 -> {

                    int optionSaque;

                        do { 

                        System.out.println("\n====================");
                        System.out.println("1 - Saque dinheiro");
                        System.out.println("2 - Voltar");
                        System.out.println("Escolha uma opção");


                        optionSaque = scanner.nextInt();

                        switch(optionSaque){

                            case 1 -> {
                                System.out.println("Digite o valor do deposito");
                                double saque = scanner.nextDouble();

                                if( saque > 0 ){
                                    saldo -= saque;

                                    System.out.println("Saque realizado");
                                }else{
                                    System.out.println("Valor inválido");
                                }
                                break;
                            }

                            case 2 -> {
                                System.out.println("Voltando ao menu...");
                                break;
                            }
                            default -> {
                                System.out.println("Opção inválida");
                            }

                        }
                            
                        } while (optionDeposito != 2);
                            
                        } while (true);
                        // System.out.println("Valor do saque: ");
                        // double saque = scanner.nextDouble();
                        
                        // saldo = saldo - saque;
                        
                        // System.out.println("Saque realizado");
                        // System.out.println("Saldo atual: R$ " + saldo);
                    }
                




















                        
                    case 4 -> System.out.println("Saindo...");
                        
                    default -> System.out.println("Opção inválida");
                }
                
                
            }  while (option != 4);
        }
    }


    public static void voltarMenu(Scanner scanner) {
        
    }
