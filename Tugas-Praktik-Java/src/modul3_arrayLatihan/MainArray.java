package modul3_arrayLatihan;

public class MainArray {
    public static void main(String[] args) {
        ArrayTest array = new ArrayTest();
        Integer[] arr = {-5,-3,-6,-3,-4};
        array.setArray(arr);

        //nilai rata-rata
        array.rataRata();

        //nilai maksimal
        array.maksimal();

        //nilai minimum
        array.minimum();

        //index angka -3
        array.index(-3);

    }
}
