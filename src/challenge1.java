public class challenge1 {
    public static void main(String[] args){
        int ranFil;
        int ranCol;
        int cont = 0;
        int contV = 0;
        int contY = 0;
        int contM = 0;
        int contL = 0;

        String[][] escenario = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int f = 0; f < 10; f++) {
                escenario[i][f]= ". ";
            }
        }
        for (int i = 0; i < 1; i++) {
            do {
                ranFil = (int) (Math.random() * 10);
                ranCol = (int) (Math.random() * 10);
            }
            while (!(escenario[ranFil][ranCol]).equals(". "));
            escenario[ranFil][ranCol] = "V ";
        }

        for (int i = 0; i < 1; i++) {
            do {
                ranFil = (int) (Math.random() * 10);
                ranCol = (int) (Math.random() * 10);
            }
            while (!(escenario[ranFil][ranCol]).equals(". "));
            escenario[ranFil][ranCol] = "Y ";
        }

        for (int i = 0; i < 5; i++) {
            do {
                ranFil = (int) (Math.random() * 10);
                ranCol = (int) (Math.random() * 10);
            }
            while (!(escenario[ranFil][ranCol]).equals(". "));
            escenario[ranFil][ranCol] = "M ";
        }

        for (int i = 0; i < 10; i++) {
            for (int f = 0; f < 10; f++) {
                System.out.print(escenario[i][f]);
                cont +=1;
                if (escenario[i][f].equals("V ")){
                    contV += 1;
                }else if (escenario[i][f].equals("Y ")){
                    contY += 1;
                }else if (escenario[i][f].equals("M ")){
                    contM += 1;
                }else if (escenario[i][f].equals(". ")){
                    contL += 1;
                }
            }
            System.out.println();
        }
        System.out.println(contV +" Numero de Vs");
        System.out.println(contY +" Numero de Ys");
        System.out.println(contM +" Numero de Ms");
        System.out.println(contL +" Numero de posiciones libres");
        System.out.println(cont+ " Numero de posiciones totales");

        for (int i = 0; i < 5; i++) {
            do {
                ranFil = (int) (Math.random() * 10);
                ranCol = (int) (Math.random() * 10);
            }
            while (!(escenario[ranFil][ranCol]).equals(". "));
            escenario[ranFil][ranCol] = "M ";
        }

        cont = 0;
        contV = 0;
        contY = 0;
        contM = 0;
        contL = 0;

        for (int i = 0; i < 10; i++) {
            for (int f = 0; f < 10; f++) {
                System.out.print(escenario[i][f]);
                cont += 1;
                if (escenario[i][f].equals("V ")) {
                    contV += 1;
                } else if (escenario[i][f].equals("Y ")) {
                    contY += 1;
                } else if (escenario[i][f].equals("M ")) {
                    contM += 1;
                } else if (escenario[i][f].equals(". ")) {
                    contL += 1;
                }
            }
            System.out.println();
        }

            System.out.println();
            System.out.println("Nuevas posiciones");
            System.out.println(contV + " Numero de Vs");
            System.out.println(contY + " Numero de Ys");
            System.out.println(contM + " Numero de Ms");
            System.out.println(contL + " Numero de posiciones libres");
            System.out.println(cont + " Numero de posiciones totales");

    }
}
