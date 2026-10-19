public class Tesoro {
    public static void main(String[] args) {
        int ranLin;
        int ranCol;
        String[][] mapa = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int f = 0; f <5; f++) {
                mapa[i][f]= ". ";
            }
        }
        for (int i = 0; i < 3; i++) {
            do {
                ranLin = (int)(Math.random()*5);
                ranCol = (int)(Math.random()*5);
            }while (!mapa[ranLin][ranCol].equals(". "));
                mapa[ranLin][ranCol]= "X ";
            }
        for (int i = 0; i < 1; i++) {
            do {
                ranLin = (int)(Math.random()*5);
                ranCol = (int)(Math.random()*5);
            }while (!mapa[ranLin][ranCol].equals(". "));
            mapa[ranLin][ranCol]= "T ";
        }
        for (int i = 0; i < 5; i++) {
            for (int f = 0; f <5; f++) {
                System.out.print(mapa[i][f]);
            }
            System.out.println();
        }
    }
}

