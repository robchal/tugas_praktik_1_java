package modul3_arrayLatihan;

public class ArrayTest {
    private Integer[] array;

    public Integer[] getArray() {
        return array;
    }

    public void setArray(Integer[] array) {
        this.array = array;
    }

    public void rataRata() {
        float avg = 0;
        for(var arr : array) {
            avg += arr;
        }
        float rslt = avg/array.length;
        System.out.println("Nilai rata-rata : " + rslt);
    }

    public void maksimal() {
        var max = array[0];
        for(var arr : array) {
            if(max < arr) {
                max = arr;
            }
        }
        System.out.println("Nilai maksimum : " + max);
    }

    public void minimum() {
        var min = array[0];
        for(var arr : array) {
            if(min > arr) {
                min = arr;
            }
        }
        System.out.println("Nilai minimum : " + min);
    }

    public void index(int angka) {
        for(var i = 0; i < array.length; i++) {
            if(array[i] == angka) {
                System.out.println("Angka -3 ada pada index : " + i);
            }
        }
    }
}
