package Trabalho2IntroduçãoAProgramação;

    public class Pessoa {
        String nomeTitular;
        int cpf;
        int idade ;

        public Pessoa(String nome, int cpf) {
            this.nomeTitular = nome;
            this.idade = idade;
            this.cpf = cpf;
        }

        public String getNomeTitular() {
            return nomeTitular;
        }

        public void setNomeTitular(String nomeTitular) {
            this.nomeTitular = nomeTitular;
        }

        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
    }
