package aaa;

import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class hackaton {
    public static void main(String[] args) {
        char [][] matriz = new char[10][10];
        int vidas = 10;

        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                matriz[i][f] = '*';
            }
        }

        char FINAL = 'Y';

        matriz[9][9]=FINAL;

        Random aleatorio = new Random();

        int ranFila = aleatorio.nextInt(10);
        int ranCol = aleatorio.nextInt(10);

        matriz[ranFila][ranCol] = 'M';
        for (int i = 0; i <5; i++) {
            do {
                ranFila = aleatorio.nextInt(10);
                ranCol = aleatorio.nextInt(10);
            } while (matriz[ranFila][ranCol] != '*');
            matriz[ranFila][ranCol] = 'P';
           ;
        }


        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[i][f]+ " ");
            }
            System.out.println();
        }

        int filaYoda = 0;
        int columnaYoda = 0;
        matriz[filaYoda][columnaYoda] = 'Y';

        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D");
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una letra: ");
        char desplazamiento = sc.next().charAt(0);
        System.out.println("La letra elegida es "+ desplazamiento);


        if (desplazamiento == 'D'){
            columnaYoda += 1;
        }
        if (desplazamiento == 'W'){
            filaYoda +=1;
        }
        if (desplazamiento == 'A'){
            columnaYoda -=1;
        }
        if (desplazamiento == 'S'){
            filaYoda -=1;
        }

        matriz[filaYoda][columnaYoda] = 'Y';

        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[i][f]+ " ");
            }
            System.out.println();
        }
    }
}
