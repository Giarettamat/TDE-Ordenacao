import java.io.*;
import java.util.*;

public class LeituraCSV {

    public static int[] lerArquivo(String caminho) throws IOException {
        List<Integer> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        
        
        br.readLine();

        String linha;
        while ((linha = br.readLine()) != null) {
            try {
                if (!linha.trim().isEmpty()) {
                    lista.add(Integer.parseInt(linha.trim()));
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido encontrado e ignorado: " + linha);
            }
        }
        br.close();
        return lista.stream().mapToInt(i -> i).toArray();
    }
}
