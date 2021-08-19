package modul4_array2Tugas;

public class MatrixArray {
    private Integer[][] array;
    private Integer[][] matrixC;

    public Integer[][] getArray() {
        return array;
    }

    public void setArray(Integer[][] array) {
        this.array = array;
    }

    public void setMatrixC(Integer[][] mtrxA, Integer[][] mtrxB) {
        Integer[][] matrixC = new Integer[mtrxA.length][mtrxA[0].length];
        for(var i = 0; i < mtrxA.length; i++) {
            for(var j = 0; j < mtrxA[i].length; j++) {
                matrixC[i][j] = mtrxA[i][j] + mtrxB[i][j];
            }
        }
        this.matrixC = matrixC;
    }

    public Integer[][] getMatrixC() {
        for(var i = 0; i < matrixC.length-1; i++) {
            for(var j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j]);
                System.out.print(" ");
                System.out.println(matrixC[i+1][j]);
            }
            System.out.println(" ");
        }
        return this.matrixC;
    }

    public double[][] finalResult() {
        double[][] rslt = new double[matrixC.length][matrixC[0].length];
        for(var i = 0; i < matrixC.length; i++) {
            for(var j = 0; j < matrixC[i].length; j++) {
                rslt[i][j] = (matrixC[i][j] * 0.5);
                System.out.println(rslt[i][j]);
            }
        }
        return rslt;
    }


}
