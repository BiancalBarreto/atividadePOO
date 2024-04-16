package questao2;

public class Main {
    public static void main(String[] args) {
        // Criando alguns países
        Pais brasil = new Pais("Brasil", 8515767, 211_000_000);
        Pais argentina = new Pais("Argentina", 2780400, 45_000_000);
        Pais chile = new Pais("Chile", 756102, 19_000_000);

        // Criando um continente (América do Sul)
        Continente americaDoSul = new Continente("América do Sul");

        // Adicionando os países ao continente
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(chile);

        // Exibindo algumas informações sobre o continente
        System.out.println("Dimensão total do continente: " + americaDoSul.dimensaoTotal() + " km²");
        System.out.println("População total do continente: " + americaDoSul.populacaoTotal() + " habitantes");
        System.out.println("Densidade populacional do continente: " + americaDoSul.densidadePopulacional() + " hab/km²");
        System.out.println("País com maior população no continente: " + americaDoSul.paisComMaiorPopulacao().getNome());
        System.out.println("País com menor população no continente: " + americaDoSul.paisComMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial no continente: " + americaDoSul.paisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão territorial no continente: " + americaDoSul.paisMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país: " + americaDoSul.razaoTerritorial());
    }
}
