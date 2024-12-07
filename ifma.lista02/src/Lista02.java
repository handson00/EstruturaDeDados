import java.util.Arrays;

public class Lista02 {
    private static final int[][] matrizPrincipal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    // Operação 1
    public static void operacaoDiagonalPrincipalZerada() {
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna < matrizPrincipal[linha].length; coluna++) {
                if (linha == coluna) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matrizPrincipal[linha][coluna] + " ");
                }
            }
            System.out.println();
        }
    }

    // Operação 2
    public static void operacaoDiagonalSecundariaZerada() {
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna < matrizPrincipal[linha].length; coluna++) {
                if (linha + coluna == matrizPrincipal.length - 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matrizPrincipal[linha][coluna] + " ");
                }
            }
            System.out.println();
        }
    }

    // Operação 3
    public static void extrairDiagonalSecundaria() {
        System.out.print("[ ");
        for (int indice = 0; indice < matrizPrincipal.length; indice++) {
            System.out.print(matrizPrincipal[indice][matrizPrincipal.length - 1 - indice] + (indice < matrizPrincipal.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }

    // Operação 4
    public static void somarDiagonalSecundaria() {
        int somaTotal = 0;
        for (int indice = 0; indice < matrizPrincipal.length; indice++) {
            somaTotal += matrizPrincipal[indice][matrizPrincipal.length - 1 - indice];
        }
        System.out.println("Soma: " + somaTotal);
    }

    // Operação 5
    public static void elementosTrianguloInferiorDireito() {
        System.out.print("[ ");
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = matrizPrincipal.length - 1 - linha; coluna < matrizPrincipal[linha].length; coluna++) {
                System.out.print(matrizPrincipal[linha][coluna] + (linha == matrizPrincipal.length - 1 && coluna == matrizPrincipal[linha].length - 1 ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    // Operação 6
    public static void calcularMediaTrianguloInferiorDireito() {
        int somaValores = 0, contadorValores = 0;
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = matrizPrincipal.length - 1 - linha; coluna < matrizPrincipal[linha].length; coluna++) {
                somaValores += matrizPrincipal[linha][coluna];
                contadorValores++;
            }
        }
        System.out.println("Media: " + (double) somaValores / contadorValores);
    }

    // Operação 7
    public static void elementosTrianguloInferiorEsquerdo() {
        System.out.print("[ ");
        for (int linha = 1; linha < matrizPrincipal.length; linha++) {
            for (int coluna = matrizPrincipal.length - linha; coluna < matrizPrincipal[linha].length; coluna++) {
                System.out.print(matrizPrincipal[linha][coluna] + (linha == matrizPrincipal.length - 1 && coluna == matrizPrincipal[linha].length - 1 ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    // Operação 8
    public static void encontrarMaiorValorTrianguloInferiorEsquerdo() {
        int maiorValor = Integer.MIN_VALUE;
        for (int linha = 1; linha < matrizPrincipal.length; linha++) {
            for (int coluna = matrizPrincipal.length - linha; coluna < matrizPrincipal[linha].length; coluna++) {
                if (matrizPrincipal[linha][coluna] > maiorValor) {
                    maiorValor = matrizPrincipal[linha][coluna];
                }
            }
        }
        System.out.println("Maior valor: " + maiorValor);
    }

    // Operação 9
    public static void elementosTrianguloSuperiorEsquerdo() {
        System.out.print("[ ");
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna <= matrizPrincipal.length - 1 - linha; coluna++) {
                System.out.print(matrizPrincipal[linha][coluna] + (linha == matrizPrincipal.length - 1 && coluna == matrizPrincipal.length - 1 - linha ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    // Operação 10
    public static void encontrarMenorValorTrianguloSuperiorEsquerdo() {
        int menorValor = Integer.MAX_VALUE;
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna <= matrizPrincipal.length - 1 - linha; coluna++) {
                if (matrizPrincipal[linha][coluna] < menorValor) {
                    menorValor = matrizPrincipal[linha][coluna];
                }
            }
        }
        System.out.println("Menor valor: " + menorValor);
    }

    // Operação 11
    public static void elementosAcimaTrianguloInferior() {
        System.out.print("[ ");
        for (int linha = 0; linha < matrizPrincipal.length - 1; linha++) {
            for (int coluna = 0; coluna <= matrizPrincipal.length - 2 - linha; coluna++) {
                System.out.print(matrizPrincipal[linha][coluna] + (linha == matrizPrincipal.length - 2 && coluna == matrizPrincipal.length - 2 - linha ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    // Operação 12
    public static void calcularProdutoAcimaTrianguloInferior() {
        int produtoTotal = 1;
        for (int linha = 0; linha < matrizPrincipal.length - 1; linha++) {
            for (int coluna = 0; coluna <= matrizPrincipal.length - 2 - linha; coluna++) {
                produtoTotal *= matrizPrincipal[linha][coluna];
            }
        }
        System.out.println("Produto: " + produtoTotal);
    }

    // Operação 13
    public static void criarNovaMatrizParImpar() {
        int[][] novaMatriz = new int[matrizPrincipal.length][matrizPrincipal[0].length];
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna < matrizPrincipal[linha].length; coluna++) {
                if (matrizPrincipal[linha][coluna] % 2 == 0) {
                    novaMatriz[linha][coluna] = matrizPrincipal[linha][coluna] * matrizPrincipal[linha][coluna];
                } else {
                    novaMatriz[linha][coluna] = matrizPrincipal[linha][coluna] * matrizPrincipal[linha][coluna] * matrizPrincipal[linha][coluna];
                }
            }
        }
        System.out.println("Nova Matriz: " + Arrays.deepToString(novaMatriz));
    }

    // Operação 14
    public static void rotacionarMatriz90Graus() {
        int[][] matrizRotacionada90 = new int[matrizPrincipal[0].length][matrizPrincipal.length];
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna < matrizPrincipal[linha].length; coluna++) {
                matrizRotacionada90[coluna][matrizPrincipal.length - 1 - linha] = matrizPrincipal[linha][coluna];
            }
        }
        System.out.println("Rotacionada 90°: " + Arrays.deepToString(matrizRotacionada90));
    }

    // Operação 15
    public static void rotacionarMatriz180Graus() {
        int[][] matrizRotacionada180 = new int[matrizPrincipal.length][matrizPrincipal[0].length];
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna < matrizPrincipal[linha].length; coluna++) {
                matrizRotacionada180[matrizPrincipal.length - 1 - linha][matrizPrincipal[0].length - 1 - coluna] = matrizPrincipal[linha][coluna];
            }
        }
        System.out.println("Rotacionada 180°: " + Arrays.deepToString(matrizRotacionada180));
    }

    // Operação 16
    public static void rotacionarMatriz270Graus() {
        int[][] matrizRotacionada270 = new int[matrizPrincipal[0].length][matrizPrincipal.length];
        for (int linha = 0; linha < matrizPrincipal.length; linha++) {
            for (int coluna = 0; coluna < matrizPrincipal[linha].length; coluna++) {
                matrizRotacionada270[matrizPrincipal[0].length - 1 - coluna][linha] = matrizPrincipal[linha][coluna];
            }
        }
        System.out.println("Rotacionada 270°: " + Arrays.deepToString(matrizRotacionada270));
    }
}
