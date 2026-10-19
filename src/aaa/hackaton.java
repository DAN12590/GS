package aaa;

public class hackaton {
    public static void main(String[] args) {
        char [][] matriz = new char[10][10];
        int vidas = 10;

        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                matriz[i][f] = '*';
            }
        }
        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[i][f]+ " ");
            }
            System.out.println();
        }
    }
}
