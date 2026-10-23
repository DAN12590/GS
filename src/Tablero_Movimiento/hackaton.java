package Tablero_Movimiento;

import java.util.Random;
import java.util.Scanner;

public class hackaton {
    public static void main(String[] args) {
        char [][] matriz = new char[10][10];

        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                matriz[i][f] = '*';
            }
        }

        char FINAL = 'F';

        matriz[9][9]=FINAL;

        Random aleatorio = new Random();

        int ranFila;
        int ranCol;

        int filaYoda = 0;
        int columnaYoda = 0;
        matriz[filaYoda][columnaYoda] = 'Y';

        for (int i = 0; i <20; i++) {
            do {
                ranFila = aleatorio.nextInt(10);
                ranCol = aleatorio.nextInt(10);
            } while (matriz[ranFila][ranCol] != '*');
            matriz[ranFila][ranCol] = 'B';
           ;
        }



        for (int i = 0; i <matriz.length; i++) {
            for (int f = 0; f < matriz.length; f++) {
                System.out.print(matriz[i][f]+ " ");
            }
            System.out.println();
        }

        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("y te puedes desplazar con las letras W A S D ,q para salir");

        Scanner sc = new Scanner(System.in);

        char desplazamiento = ' ';

        int vidas = 5;
        int filaOld=0;
        int colOld=0;

        while (desplazamiento!='q') {
            System.out.println(vidas + " vidas");
        System.out.print("Dime una letra: ");
        desplazamiento = Character.toLowerCase(sc.next().charAt(0));

            switch (desplazamiento) {
                case 'd':
                    if (columnaYoda!=9) {
                        columnaYoda += 1;
                        matriz[filaOld][colOld] = matriz[filaYoda][columnaYoda];
                        matriz[filaYoda][columnaYoda] = 'Y';
                        matriz[filaYoda][columnaYoda - 1] = '*';
                    }
                    break;

                case 'w':
                    if (filaYoda!=0) {
                        filaYoda -= 1;
                        matriz[filaOld][colOld] = matriz[filaYoda][columnaYoda];
                        matriz[filaYoda][columnaYoda] = 'Y';
                        matriz[filaYoda + 1][columnaYoda] = '*';
                    }
                        break;
                case 'a':
                    if (columnaYoda!=0) {
                        columnaYoda -= 1;
                        matriz[filaOld][colOld] = matriz[filaYoda][columnaYoda];
                        matriz[filaYoda][columnaYoda] = 'Y';
                        matriz[filaYoda][columnaYoda + 1] = '*';
                    }
                    break;

                case 's':
                    if (filaYoda!=9) {
                        filaYoda += 1;
                        matriz[filaOld][colOld] = matriz[filaYoda][columnaYoda];
                        matriz[filaYoda][columnaYoda] = 'Y';
                        matriz[filaYoda - 1][columnaYoda] = '*';
                    }
                    break;

                case 'q':
                    break;

                default:
                    System.out.println("Letra no valida");
                    continue;
                }

            for (int i = 0; i <matriz.length; i++) {
                for (int f = 0; f < matriz.length; f++) {
                    System.out.print(matriz[i][f]+ " ");
                }
                System.out.println();
            }
            if (matriz[filaOld][colOld] == 'B'){
                vidas--;
            }
        }

    }
}
