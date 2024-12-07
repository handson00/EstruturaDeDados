public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

        lista.adicionarInicio(10);
        lista.adicionarInicio(20);
        lista.adicionarFim(5);
        System.out.println("Lista após adições: " + lista);

        System.out.println("Removido do começo: " + lista.removerComeco());
        System.out.println("Lista após remoção do começo: " + lista);

        System.out.println("Removido do final: " + lista.removerFinal());
        System.out.println("Lista após remoção do final: " + lista);

        lista.adicionarInicio(30);
        lista.adicionarInicio(50);
        lista.adicionarFim(15);
        System.out.println("Lista atualizada: " + lista);

        System.out.println("Maior valor: " + lista.getMaiorValor());
        System.out.println("Menor valor: " + lista.getMenorValor());
        System.out.println("Média dos valores: " + lista.getMediaValores());
    }
}
