//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int nthPattern = Math.abs(j - i);

                if (nthPattern <= width) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}