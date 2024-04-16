package questao2;

public class Pais {
    private String nome;
    private double dimensao;
    private long populacao;

    // Construtor que inicializa o nome, dimensão e população do país
    public Pais(String nome, double dimensao, long populacao) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    // Métodos de acesso aos atributos
    public String getNome() {
        return nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }
}
