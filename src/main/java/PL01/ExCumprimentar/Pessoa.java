package PL01.ExCumprimentar;

public class Pessoa {

    private String nome;
    private int idade;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final int IDADE_POR_OMISSAO = 0;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa() {
        setNome(NOME_POR_OMISSAO);
        setIdade(IDADE_POR_OMISSAO);
    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return this.nome;
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


    public String toString() {
        return String.format("O nome é %s e tenho %d anos", getNome(), getIdade());
    }

}
