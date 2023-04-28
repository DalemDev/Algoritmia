package problemaDos;

public class Solucion {
    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }

    public static int pageCount(int n, int p) {
        double vueltasFrente = 0, vueltasReverso = 0;

        for (int i = 1; i <= n; i++) {
            if (i == p) {
                break;
            }
            vueltasFrente++;
        }

        for (int i = n; i >= 1; i--) {

            if (i == p) {
                if(n % 2 == 1) vueltasReverso--;
                break;
            }
            vueltasReverso++;
        }

        vueltasFrente = Math.ceil(vueltasFrente / 2);
        vueltasReverso = Math.ceil(vueltasReverso / 2);

        if(vueltasFrente < vueltasReverso){
            return (int) vueltasFrente;
        }
        return (int) vueltasReverso;
    }
}
