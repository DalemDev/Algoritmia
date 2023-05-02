package hackatonGoogle2022.RondaClasificacion;

import java.util.Scanner;

public class ProblemaUno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 1; i <= T; i++) {
            int R = in.nextInt();
            int C = in.nextInt();
            int aux = 0;
            int totalImpresiones = 2 * R + 1;

            System.out.println("Case #"+i+":");
            for (int rows = 1; rows <= totalImpresiones; rows++) {
                if (rows <= 2) {
                    System.out.print("..");
                }
                aux = 0;
                for (int columns = 1; columns <= totalImpresiones; columns++) {
                    if (rows % 2 == 1) {
                        if (aux == 0) {
                            System.out.print("+");
                            aux = 1;
                        } else {
                            System.out.print("-");
                            aux = 0;
                        }
                        if (rows > 2 && columns == totalImpresiones) System.out.print("-+");
                    } else {
                        if (aux == 0) {
                            System.out.print("|");
                            aux = 1;
                        } else {
                            System.out.print(".");
                            aux = 0;
                        }
                        if (rows > 2 && columns == totalImpresiones) System.out.print(".|");
                    }
                }
                System.out.println();
            }
        }
    }
}
