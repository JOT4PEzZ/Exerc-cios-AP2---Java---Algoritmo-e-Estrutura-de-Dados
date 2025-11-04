package exercicios;
import estruturas.Fila;

public class Exercicio3 {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(5);
        fila.enfileirar(7);
        fila.enfileirar(9);

        fila.mostrar();

        fila.desenfileirar();
        fila.mostrar();
    }
}
