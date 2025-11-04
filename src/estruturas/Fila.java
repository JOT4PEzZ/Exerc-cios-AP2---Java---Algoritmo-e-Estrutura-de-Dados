package estruturas;

public class Fila {
    private int[] elementos = new int[5];
    private int tamanho = 0;

    public void enfileirar(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
            System.out.println("Valor enfileirado: " + valor);
        } else {
            System.out.println("Estruturas.Fila cheia! Não é possível enfileirar mais elementos.");
        }
    }

    public void desenfileirar() {
        if (tamanho == 0) {
            System.out.println("Estruturas.Fila vazia! Não há elementos para desenfileirar.");
        } else {
            int valorRemovido = elementos[0];
            for (int i = 0; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
            System.out.println("Valor desenfileirado: " + valorRemovido);
        }
    }

    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.print("Elementos da fila: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}

