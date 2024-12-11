/**
 * @author higor.robinn on 11/12/2024.
 */

package exercColec;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa Higor = criarPF("Higor", 18, "949-304-492-94");
        Pessoa Teste = criarPJ("Teste", 19, "001029029100/34");
        List<Pessoa> pessoas = new ArrayList<>();

        imprimirDados(Higor);
        imprimirDados(Teste);

        pessoas.add(Higor);
        pessoas.add(Teste);

        System.out.println("Pessoas:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));
    }

    private static void imprimirDados(Pessoa pessoa) {
        if (pessoa instanceof PessoaFisica) {
            PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
            System.out.println("--- Pessoa física ---");
            System.out.printf("""
                    Nome: %s
                    Idade: %d
                    CPF: %s
                    """, pessoa.getNome(), pessoa.getIdade(), pessoaFisica.getCpf());
        } else if (pessoa instanceof PessoaJuridica) {
            PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
            System.out.println("--- Pessoa jurídica ---");
            System.out.printf("""
                    Nome: %s
                    Idade: %d
                    CNPJ: %s
                    """, pessoa.getNome(), pessoa.getIdade(), pessoaJuridica.getCnpj());
        }
    }

    private static Pessoa criarPJ(String nome, int i, String cnpj) {
        return new PessoaJuridica(nome, i, cnpj);
    }

    private static Pessoa criarPF(String nome, int i, String cpf) {
        return new PessoaFisica(nome, i, cpf);
    }

}
