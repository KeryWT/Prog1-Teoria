public class Prova {

    static void stampa(boolean[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
            System.out.println();
        }
    }
    static int quantiPari(int[] a, int i) {
        if (i == a.length) return 0;
        else if (a[i] % 2 == 0) return 1 + quantiPari(a, i + 1);
        else return quantiPari(a, i + 1);

    }

    static int quantiPariWrap(int[] a) {
        // conta gli interi pari presenti in a
        return quantiPari(a, 0);
    }

    static int quantiPariIt(int[] a) {
        int cont = 0;
        for (int i = 0; i < a.length; i++) { // invariante: cont == numero di pari in
            // a[0, ... , i-1]
            if (a[i] % 2 == 0) cont++;
        }
        return cont;
    }

    static boolean congiunzione(boolean[] a, int i) {
        // calcola con ricorsione controvariante la congiunzione di tutti gli
        // elementi di a
        if (i == a.length) return true;
        else return a[i] && congiunzione(a, i + 1);
    }

    static boolean congiunzioneWrap(boolean[] a) {
        return congiunzione(a,0);
    }

    public static void main(String[] args) {
        boolean[] a = {true, false, 5 < 3, true && false, true || false};
//        int[] a = {2, 5, 7, 6, 3, 8, 11};
//        System.out.println(quantiPariWrap(a));
        stampa(a);
        System.out.println(congiunzioneWrap(a));

    }
}
