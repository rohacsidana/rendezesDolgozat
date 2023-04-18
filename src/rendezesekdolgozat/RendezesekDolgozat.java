package rendezesekdolgozat;

import java.util.Arrays;

public class RendezesekDolgozat {

    public static void main(String[] args) {
        int[] tomb = new int[]{9,8,7,6,5,4,3,2,1};

        kiir(kertitorpeRendezes(tomb));
    }

    public static int[] kertitorpeRendezes(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            boolean ellenorzesSzukseges = false;
            if (i != tomb.length - 1 && tomb[i] > tomb[i + 1]) {
                int temp = tomb[i];
                tomb[i] = tomb[i + 1];
                tomb[i + 1] = temp;
                if (i != 0) {
                    if (tomb[i] < tomb[i - 1]) {
                    int tempElozonek = tomb[i];
                    tomb[i] = tomb[i - 1];
                    tomb[i - 1] = temp;
                }   
                }
                         
            }
            
            kiir(tomb);
        }

        return tomb;
    }

    public static boolean rendezettATomb(int[] tomb) {
        boolean rendezett = true;
        for (int i = 0; i < tomb.length; i++) {
            if (i != tomb.length - 1 && tomb[i] >= tomb[i + 1]) {
                rendezett = false;
            }
        }
        return rendezett;
    }

    public static void kiir(int[] tomb) {
        System.out.println(Arrays.toString(tomb));
    }

}
