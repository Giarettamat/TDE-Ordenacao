import java.util.Arrays;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String[] arquivos = {
            "aleatorio_100.csv", "aleatorio_1000.csv", "aleatorio_10000.csv",
            "crescente_100.csv", "crescente_1000.csv", "crescente_10000.csv",
            "decrescente_100.csv", "decrescente_1000.csv", "decrescente_10000.csv"
        };

        for (String arquivo : arquivos) {
            int[] dados = LeituraCSV.lerArquivo(arquivo);
            System.out.println("Arquivo: " + arquivo);

            int[] copia = Arrays.copyOf(dados, dados.length);
            long inicio = System.nanoTime();
            Ordenacao.bubbleSort(copia);
            long tempoExecucao = System.nanoTime() - inicio;
            System.out.println("Bubble Sort: " + tempoExecucao + " ns");

            copia = Arrays.copyOf(dados, dados.length);
            inicio = System.nanoTime();
            Ordenacao.insertionSort(copia);
            tempoExecucao = System.nanoTime() - inicio;
            System.out.println("Insertion Sort: " + tempoExecucao + " ns");

            copia = Arrays.copyOf(dados, dados.length);
            inicio = System.nanoTime();
            Ordenacao.quickSort(copia, 0, copia.length - 1);
            tempoExecucao = System.nanoTime() - inicio;
            System.out.println("Quick Sort: " + tempoExecucao + " ns");

            System.out.println();
        }
    }
}