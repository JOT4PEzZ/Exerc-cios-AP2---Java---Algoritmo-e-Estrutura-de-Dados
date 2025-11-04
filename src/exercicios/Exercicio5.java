package exercicios;

import estruturas.Lista;
import estruturas.Pilha;
import estruturas.Fila;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcaoPrincipal;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Trabalhar com Lista");
            System.out.println("2 - Trabalhar com Pilha");
            System.out.println("3 - Trabalhar com Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuLista(lista, scanner);
                    break;
                case 2:
                    menuPilha(pilha, scanner);
                    break;
                case 3:
                    menuFila(fila, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcaoPrincipal != 0);

        scanner.close();
    }

    // ---------------- MENU LISTA ----------------
    private static void menuLista(Lista lista, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1 - Inserir valor");
            System.out.println("2 - Mostrar elementos");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a inserir: ");
                    int valor = scanner.nextInt();
                    lista.inserir(valor);
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    // ---------------- MENU PILHA ----------------
    private static void menuPilha(Pilha pilha, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar valor");
            System.out.println("2 - Desempilhar valor");
            System.out.println("3 - Mostrar elementos");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a empilhar: ");
                    int valor = scanner.nextInt();
                    pilha.empilhar(valor);
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    // ---------------- MENU FILA ----------------
    private static void menuFila(Fila fila, Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Enfileirar valor");
            System.out.println("2 - Desenfileirar valor");
            System.out.println("3 - Mostrar elementos");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a enfileirar: ");
                    int valor = scanner.nextInt();
                    fila.enfileirar(valor);
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.mostrar();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
