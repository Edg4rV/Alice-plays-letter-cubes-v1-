import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = scanner.nextInt();
        String[] c = new String[len];
        for (int i = 0; i < len; i++) {
            String x = scanner.next();
            if (" ".equals(x)) {
                continue;
            } else {
                c[i] = x;
            }
        }
        int count = 0;
        String check = "";
        String result = "";
//        String s = "abacaba";
        Set<String> substr = new HashSet<>();
        for (int j = 0; j <= s.length(); j++) {
            for (int i = j; i <= s.length(); i++) {
                substr.add(check + s.substring(j, i));
            }
        }
//        substr.forEach( element ->{
//            System.out.println(element);
//        });

        for (int k = 0; k < c.length; k++) {
            count = 0;
            String add = "";
            String s1 = c[k] + s;
            Set<String> substr1 = new HashSet<>();
            for (int j = 0; j <= s1.length(); j++) {
                for (int i = j; i <= s1.length(); i++) {
                    substr1.add(add + s1.substring(j, i));
                }
            }
//            substr1.forEach(element -> {
//                System.out.println(element);
//            });

            List<String> list = new ArrayList<String>(substr);
            List<String> list1 = new ArrayList<String>(substr1);

            for (int i = 0; i < list1.size(); i++) {
                if (!list.contains(list1.get(i))) {
                    count++;
                }
            }
            result = result + " " + count;
//            result.trim();


        }
        System.out.println(result.trim());
      }
    }
