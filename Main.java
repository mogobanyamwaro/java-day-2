import java.text.NumberFormat;

import javax.print.event.PrintJobListener;

/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int x = 10 + 3 * 3;
//         System.out.println(x);

//     }
// }

/**
 * Main
 */

// public class Main {

//     public static void main(String[] args) {
//         double z = 1.1;
//         double y = z +2;
//         String x = "1";
//         int p = Integer.parseInt(x) + 3;
//         System.out.println(y);

//     }
// }

/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         double result = Math.random() *100;
//         System.out.println(result);
//     }
// }

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // NumberFormat currency = new NumberFormat();
        NumberFormat currency =NumberFormat.getCurrencyInstance();
        String result = currency.format(122345688.981);
        System.out.println(result);
    }
}