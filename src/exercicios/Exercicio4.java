package exercicios;

import estruturas.Lista;
import estruturas.Pilha;
import estruturas.Fila;

public class Exercicio4 {
    public static void main(String[] args) {
        // ----------------- LISTA -----------------
        System.out.println("----- LISTA -----");
        Lista lista = new Lista();
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);

        lista.mostrar();

        // Linha em branco para separar visualmente
        System.out.println();

        // ----------------- PILHA -----------------
        System.out.println("----- PILHA -----");
        Pilha pilha = new Pilha();
        pilha.empilhar(5);
        pilha.empilhar(8);
        pilha.empilhar(13);
        pilha.empilhar(21);
        pilha.empilhar(34);

        System.out.println("\nEstado atual da Pilha (antes de desempilhar):");
        pilha.mostrar();

        pilha.desempilhar();
        System.out.println("Estado da Pilha após desempilhar o topo:");
        pilha.mostrar();

        // Linha em branco para separar visualmente
        System.out.println();

        // ----------------- FILA -----------------
        System.out.println("----- FILA -----");
        Fila fila = new Fila();
        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(5);
        fila.enfileirar(7);
        fila.enfileirar(9);

        System.out.println("\nEstado atual da Fila (antes de desenfileirar):");
        fila.mostrar();

        fila.desenfileirar();
        System.out.println("Estado da Fila após desenfileirar o primeiro elemento:");
        fila.mostrar();

        // Linha em branco final
        System.out.println();
    }
}
