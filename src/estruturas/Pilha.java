package estruturas;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<Integer> elementos = new ArrayList<>();

    public void empilhar(int valor) {
        elementos.add(valor);
        System.out.println("Valor empilhado: " + valor);
    }

    public void desempilhar() {
        if (elementos.isEmpty()) {
            System.out.println("Estruturas.Pilha vazia! Não há elementos para desempilhar.");
        } else {
            int valorRemovido = elementos.remove(elementos.size() - 1);
            System.out.println("Valor desempilhado: " + valorRemovido);
        }
    }

    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Elementos da pilha: ");
            for (int i = elementos.size() - 1; i >= 0; i--) {
                System.out.print(elementos.get(i) + " ");
            }
            System.out.println();
        }
    }
}

