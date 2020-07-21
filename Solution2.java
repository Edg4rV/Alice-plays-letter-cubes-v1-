import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            String cs = scanner.next() + s;
            int[] prefix = prefixFunction(cs);
            Arrays.sort(prefix);
            System.out.print(cs.length() - prefix[prefix.length - 1] + " ");
        }
    }

    private static int[] prefixFunction(String str) {
        int[] prefixFunc = new int[str.length()];
        for (int i = 1; i < str.length(); i++) {
            int j = prefixFunc[i - 1];
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = prefixFunc[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j += 1;
            }
            prefixFunc[i] = j;
        }
        return prefixFunc;
    }   
}
