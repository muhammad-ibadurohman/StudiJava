public class array {
    public static void main(String[] args) {

        //cara membuat Array
        //cara 1
        String[] name;
        name = new  String[10];
        name[0] = "zuhud";
        name[1] = "varonlez";
        name[2] = "muhammad";
        name[3] = "ibadur";
        name[4] = "rohman";

        int[] umur = new int[]{
                2, 4, 6, 10,29
        };

        //cara3
        String[] mahasiswa = {
                "zuhud", "varonlez", "rohman"
        };

        System.out.println(mahasiswa[1]); //mengambil
        var result = mahasiswa[0] = "rohman"; //mwngubah
        System.out.println(mahasiswa.length); //mengambil panjang array

        String[][] data = {
                {
                    "muhammad", "ibadur", "rohman"
                },

                {
                    "zuhud", "varonlez", "mumer"
                }
        };

        //cara mengambil data
        String [] hasil = data[0];
        System.out.println(hasil[1]);

        //cara ke2
        System.out.println(data[1][1]);








    }
}
