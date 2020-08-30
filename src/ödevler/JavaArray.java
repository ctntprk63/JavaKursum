package ödevler;

public class JavaArray {
    public static void main(String[] args) {

        //   3x3 lük 2 matrisi random (0-9 arası) doldurup, çarpımını ekrana yan yana yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız

        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];

        int[][] matrisCarpim = new int[3][3];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                arr[i][j] = (int) (Math.random() * 9) + 1;

                arr2[i][j] = (int) (Math.random() * 9) + 1;

                matrisCarpim[i][j] = arr[i][j] * arr2[i][j];
            }
        }




        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("arr2:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("arr ve arr2 nin carpimi :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(matrisCarpim[i][j] + "\t");
            }
            System.out.println();


        }


    }
}


