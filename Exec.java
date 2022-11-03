package Trabalho2IntroduçãoAProgramação;

    public class Exec {
        public static void main(String[] args) {

            Conta c1 = new Conta("Luiz Guilherme",19, 123456789, 1, 2000);
            System.out.println("Nome do Titular: " + c1.getNomeTitular());
            System.out.println("Idade: " + c1.getIdade());
            System.out.println("CPF: " + c1.getCpf());
            System.out.println("Número da Conta" + c1.getNumeroDaConta());
            System.out.println("Saldo do Cliente: " + c1.getSaldo());
            System.out.println();
        }
    }

