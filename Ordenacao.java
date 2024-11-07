public class Ordenacao {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int atual = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = atual;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = chave;
        }
    }


    public static void quickSort(int[] arr, int menor, int maior) {
        if (menor < maior) {
            int pi = particao(arr, menor, maior);
            quickSort(arr, menor, pi - 1);
            quickSort(arr, pi + 1, maior);
        }
    }

    private static int particao(int[] arr, int menor, int maior) {
        int pivot = arr[maior];
        int i = (menor - 1);
        for (int j = menor; j < maior; j++) {
            if (arr[j] < pivot) {
                i++;
                int atual = arr[i];
                arr[i] = arr[j];
                arr[j] = atual;
            }
        }
        int atual = arr[i + 1];
        arr[i + 1] = arr[maior];
        arr[maior] = atual;
        return i + 1;
    }
}
