package Atividade;

public class Funcionarios {

        private String nome;
        private int idade;
        private String cargo;
        private String situacao;

        public  Funcionarios(String nome, int idade, String cargo, String situacao) {
                this.nome = nome;
                this.idade = idade;
                this.cargo = cargo;
                this.situacao = situacao;
        }



        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public String getCargo() {
                return cargo;
        }

        public void setCargo(String cargo) {
                this.cargo = cargo;
        }

        public String getSituacao() {
                return situacao;
        }

        public void setSituacao(String situacao) {
                this.situacao = situacao;
        }

        public void demitirFuncionario() {
                setSituacao("Inativo");
                System.out.println("O funcionário " + getNome() + " foi demitido e está com situação: " + getSituacao());
        }

        public void trocarCargoFuncionario(String cargo) {
                setCargo(cargo);
                System.out.println("O funcionário " + getNome() + " foi promovido e agora é: " + getCargo());
        }

        public void pagarSalario() {
                System.out.println("O salário do funcionário " + getNome() + " foi pago");
        }

        public void fazerAniversario() {
                this.idade++;
                System.out.println("O funcionário " + getNome() + " faz aniversário e agora tem " + getIdade() + " anos");
        }
}




