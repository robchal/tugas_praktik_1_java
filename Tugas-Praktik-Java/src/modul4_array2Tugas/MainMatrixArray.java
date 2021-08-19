package modul4_array2Tugas;

public class MainMatrixArray {
    public static void main(String[] args) {

        //Matrix A
        MatrixArray matrixA = new MatrixArray();
        Integer[][] array1 = {{1,3,6}, {2,5,7}};
        matrixA.setArray(array1);

        //Matrix B
        MatrixArray matrixB = new MatrixArray();
        Integer[][] array2 = {{8,10,12}, {9,11,13}};
        matrixB.setArray(array2);

        //penjumlahan 2 matrix
        MatrixArray hasilJumlah = new MatrixArray();
        hasilJumlah.setMatrixC(matrixA.getArray() , matrixB.getArray());
        hasilJumlah.getMatrixC();

        //kalikan hasil penjumlahan matrix a dan matrix b dengan 0.5 untuk menghasilkan matrix baru
        hasilJumlah.finalResult();
    }

}
