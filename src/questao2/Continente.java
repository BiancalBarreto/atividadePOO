package questao2;

import java.util.ArrayList;
import java.util.List;

public class Continente {

    private String nome;
    private List<Pais> paises;

    // Construtor que inicializa o nome do continente
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Método que permite adicionar países ao continente
    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    // Método que retorna a dimensão total do continente
    public double dimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    // Método que retorna a população total do continente
    public long populacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    // Método que retorna a densidade populacional do continente
    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    // Método que retorna o país com maior população no continente
    public Pais paisComMaiorPopulacao() {
        Pais maiorPopulacao = null;
        long maxPopulacao = Long.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maxPopulacao) {
                maxPopulacao = pais.getPopulacao();
                maiorPopulacao = pais;
            }
        }
        return maiorPopulacao;
    }

    // Método que retorna o país com menor população no continente
    public Pais paisComMenorPopulacao() {
        Pais menorPopulacao = null;
        long minPopulacao = Long.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getPopulacao() < minPopulacao) {
                minPopulacao = pais.getPopulacao();
                menorPopulacao = pais;
            }
        }
        return menorPopulacao;
    }

    // Método que retorna o país de maior dimensão territorial no continente
    public Pais paisMaiorDimensao() {
        Pais maiorDimensao = null;
        double maxDimensao = Double.MIN_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensao() > maxDimensao) {
                maxDimensao = pais.getDimensao();
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    // Método que retorna o país de menor dimensão territorial no continente
    public Pais paisMenorDimensao() {
        Pais menorDimensao = null;
        double minDimensao = Double.MAX_VALUE;
        for (Pais pais : paises) {
            if (pais.getDimensao() < minDimensao) {
                minDimensao = pais.getDimensao();
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    // Método que retorna a razão territorial do maior país em relação ao menor país
    public double razaoTerritorial() {
        return paisMaiorDimensao().getDimensao() / paisMenorDimensao().getDimensao();
    }
}
