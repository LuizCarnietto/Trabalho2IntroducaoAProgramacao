package Trabalho2IntroduçãoAProgramação;


public class Conta extends Pessoa{
    private double saldo;
    private int numeroDaConta;
    private String tipoConta;
    private int idade;

    public Conta(String nomeTitular,int idade , int numeroDaConta, double saldo, int cpf ) {
        super(nomeTitular, cpf);
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.idade = idade;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saque(double valor) {
        if (valor > 0) {
            if (this.saldo < valor) {
                System.out.println("Não é possível sacar um valor maior do que saldo.");
            } else {
                this.saldo = this.saldo - valor;
            }
        } else {
            System.out.println("Impossível sacar um valor negativo.");
        }
    }

    public void deposito(double valor, Conta conta) {
        if(valor > 0) {
            conta.saldo = conta.saldo + valor;
            System.out.println();
            System.out.println("Depósito concluído !");
        } else {
            System.out.println("Não é possível depositar valores negativos ou iguais a 0.");
        }
    }

    public void imprimeNomeTitular(){
        System.out.println("O nome do titular é: " + this.nomeTitular);
    }

    public void informaSaldo() {
        System.out.println("Saldo atual do : " + this.nomeTitular + " é igual a: " + this.saldo);
    }

    public void transfere(Conta contaDestino, double valor) {
        if(valor > 0  && valor <= this.saldo) {
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println();
            System.out.println("Transferência realizada !");
        } else {
            System.out.println("Não é possível transferir valores negativos ou iguais a 0.");
        }
    }

    public String devolveTipoConta() {
        return this.tipoConta;
    }
}