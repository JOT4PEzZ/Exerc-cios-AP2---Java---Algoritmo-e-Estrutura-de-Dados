package estruturas;

public class Lista {
    private int[] elementos = new int[5];
    private int tamanho = 0;

    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Estruturas.Lista cheia! Não é possível inserir mais elementos.");
        }
    }

    public void mostrar() {
        System.out.print("Elementos da lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}

