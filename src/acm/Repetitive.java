package acm;
public class Repetitive {
    public static void main(String a[]) {
        int[] x = {9, 3, 7, 6, 4, 5, 2, 8, 9};
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    System.out.println(x[i] + " is repeated");
                }
            }
        }
    }
}