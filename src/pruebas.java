public class pruebas {
    public static void main(String[] args){
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        System.out.println(abecedario.length());
        System.out.println(abecedario.charAt(0));


        String[][] sopaLetras = new String[15][15];

                int randNum = (int)(Math.random()*27);
                System.out.println(randNum);
        System.out.println(String.valueOf(abecedario.charAt(randNum)));
            }
        }
