/*
          *
      *     *
    *         *
  *             *
*                 *
  *             *
    *         *
      *     *
         *

 */


public class Pattern30 {
    public static void main(String args[]) {
        int n = 5;
        for(int i = 1; i <= n; i++) { 
            for(int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k < i; k++) { 
                if(k == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= i; j++) {
                if(j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for(int k = i; k < n; k++) { 
                if(k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for(int j = i; j <= n; j++) {
                if(j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
