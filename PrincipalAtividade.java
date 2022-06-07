package Atividade;

public class PrincipalAtividade {

    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Anderson", 27, "Desenvolvedor Júnior", "Ativo");
        Funcionarios f2 = new Funcionarios("Bárbara", 27, "Desenvolvedor Pleno", "Ativo");
        Funcionarios f3 = new Funcionarios("João", 35, "Desenvolvedor Sênior", "Ativo");
        Funcionarios f4 = new Funcionarios("Julia", 29, "Desenvolvedor Júnior", "Ativo");

        f1.demitirFuncionario();
        f2.trocarCargoFuncionario("Desenvolvedor Sênior");
        f3.fazerAniversario();
        f4.pagarSalario();
    }



}
