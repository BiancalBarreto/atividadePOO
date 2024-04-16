package questao1;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(5);
        System.out.println("Valor do contador: " + contador.getValor());

        contador.incrementar();
        System.out.println("Valor do contador após incrementar: " + contador.getValor());

        contador.zerar();
        System.out.println("Valor do contador após zerar: " + contador.getValor());
    }
}
