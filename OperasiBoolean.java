public class OperasiBoolean {
    public static void main(String[] args) {

        int angka1 = 29;
        int angka2 = 20;


        //
        boolean lulusUts = angka1 > 75;
        boolean lulusUas = angka1 > 75;
        boolean lulus = lulusUts && lulusUas;
        System.out.println(lulus);

        //
        boolean lulusUts1 = angka1 > 75;
        boolean lulusUas1 = angka1 > 75;
        boolean lulus21 = lulusUts1 || lulusUas1;
        System.out.println(lulus);

        //
        System.out.println(!lulus);

    }
}
