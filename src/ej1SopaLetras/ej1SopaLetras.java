package ej1SopaLetras;

public class ej1SopaLetras {
    public static void main(String[] args) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        System.out.println(abecedario.length());
        System.out.println(abecedario.charAt(0));


        String[][] sopaLetras = new String[15][15];
        for (int i = 0; i < 15; i++) {
            for (int f = 0; f < 15; f++) {
                int randNum = (int) (Math.random() * 27);
                sopaLetras[i][f] = String.valueOf(abecedario.charAt(randNum));
            }
        }
        for (int i = 0; i <15 ; i++) {
            for (int j = 0; j <15 ; j++) {
                System.out.print(sopaLetras[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }