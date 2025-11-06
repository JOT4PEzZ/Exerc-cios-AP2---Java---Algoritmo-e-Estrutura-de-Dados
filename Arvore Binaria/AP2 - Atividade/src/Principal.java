public class Principal {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();


        int[] ra = {2, 4, 0, 4, 0, 8, 1};

        for (int num : ra) {
            arvore.inserir(num);
        }

        System.out.println("Raiz: " + arvore.raiz.valor);
        System.out.print("Folhas: ");
        arvore.mostrarFolhas(arvore.raiz);
        System.out.println();

        System.out.println("Altura da árvore: " + arvore.altura(arvore.raiz));

        System.out.print("Percurso em ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();
    }
}
