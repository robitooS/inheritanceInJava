/**
 * @author higor.robinn on 11/12/2024.
 */

package exercColec;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
