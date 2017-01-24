package compare;
/**
 * Created by akshay on 1/24/17.
 */
public class Compare {
    public static void main(String args[]) {

        int[] x = {1, 2, 3, 4, 5};
        int[] y = {1, 2, 3, 4};


        System.out.print(Comparearray(x, y));
    }

    public static int Comparearray(int[] x, int[] y) {
        for (int i = 0; i <= x.length-1; i++) {
            for (int j = 0; j <= y.length - 1; j++) {
                if (x[i] != y[j]) {
                    return x[i];
                }
            }
            break;
        }
        return 0;
    }
}