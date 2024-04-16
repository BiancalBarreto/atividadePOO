package questao1;

public class Contador {
    private int valor;

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }


    public void zerar() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }
}
