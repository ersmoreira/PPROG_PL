package PL01.ExCumprimentar;

public class Pessoa {

    private String nome;
    private int idade;

    private static final String NOME_POR_OMISSAO = "sem nome";

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa() {
        setNome(NOME_POR_OMISSAO);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return String.format("O nome é: %s", getNome());
    }

}
