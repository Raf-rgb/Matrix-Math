public class Matrix {
    public int rows;
    public int columns;
    public float[][] matrix;

    //Constructor
    public Matrix(int rows_, int columns_) {
        rows = rows_;
        columns = columns_;

        //Initializing the matrix
        matrix = new float[rows][columns];
        zeros();
    }

    public Matrix() {
        rows = 2;
        columns = 2;

        //Initializing the matrix
        matrix = new float[rows][columns];
        zeros();
    }

    //Fill the matrix with the zeros
    public void zeros() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    //Fill the matrix with ones
    public void ones() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = 1;
            }
        }
    }

    //Fill the matrix with parameter n
    public void fill(int n) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = n;
            }
        }
    }

    //Fill the matrix with random numbers between 0 and 1
    public void random() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = (float)Math.random();
            }
        }
    }

    //Fill the matrix with random numbers between 0 and parameter n
    public void random(int n) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = Math.round((float)Math.random() * n);
            }
        }
    }

    //Fill the matrix with random numbers  between parameter min and parameter max
    public void random(int min, int max) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = Math.round((float)Math.random() * (max - min) + min);
            }
        }
    }

    //Add parameter n to each element of matrix
    public void add(int n) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] += n;
            }
        }
    }

    //Add parameter n to Matrix
    public void add(Matrix n) {
        if(rows == n.rows && columns == n.columns) {
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < columns; j++) {
                    matrix[i][j] += n.matrix[i][j];
                }
            }
        } else {
            System.out.println("ERROR: the dimensions of both matrix don't match");
        }
    }

    //Scalar the matrix by parameter n
    public void mult(int n) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] *= n;
            }
        }
    }

    //Statics Functions

    //Add Matrix A to Matrix B, and return result
    public static Matrix add(Matrix a, Matrix b) {
        if(a.rows == b.rows && a.columns == b.columns) {
            Matrix c = new Matrix(a.rows, b.columns);

            for(int i = 0; i < c.rows; i++) {
                for(int j = 0; j < c.columns; j++) {
                    c.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
                }
            }
            return c;
        } else {
            System.out.println("ERROR: the dimensions of both matrix don't match");
            return null;
        }
    }

    //Multiply the Matrix A by Matrix B and return result of that
    public static Matrix mult(Matrix a, Matrix b) {
        if(a.columns != b.rows) {
            return null;
        } else {

            Matrix c = new Matrix(a.rows, b.columns);


            for(int i = 0; i < c.rows; i++) {
                for(int j = 0; j < c.columns; j++) {
                    float sum = 0;

                    for(int k = 0; k < a.columns; k++) {
                        sum += a.matrix[i][k] * b.matrix[k][j];
                    }

                    c.matrix[i][j] = sum;
                }
            }

            return c;
        }
    }

    //Transposed Matrix n
    public static Matrix transpose(Matrix n) {
        Matrix t = new Matrix(n.columns, n.rows);

        for(int i = 0; i < t.rows; i++) {
            for(int j = 0; j < t.columns; j++) {
                t.matrix[i][j] = n.matrix[j][i];
            }
        }

        return t;
    }

    //Display the matrix
    public void show() {
        for(int i = 0; i < rows; i++) {
            System.out.print("|  ");
            for(int j = 0; j < columns; j++) {
                System.out.printf("%4f  ", matrix[i][j]);
            }
            System.out.print("|\n");
        }
    }

    //Cloning a matrix
    public Matrix clone() {
        Matrix c = new Matrix(rows, columns);
        c.matrix = matrix;

        return c;
    }
}
