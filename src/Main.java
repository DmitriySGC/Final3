import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите количество строк" );
        int n = in1.nextInt();
        String[] str = new String[n];
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку" );
            str[i] = in2.nextLine();
        }
        int[] count = new int[n];
        for (int i = 0; i < str.length; i++) {
             String st = str[i].toLowerCase();
            char characters[] = st.toCharArray();
            int unique = str[i].length();
            for (int j = 0; j < characters.length; j++) {
                if (j != st.indexOf(characters[j])) {
                    unique--;
                }

            }
            count [i] = unique;
        }
        int max = 0;
        String answer = "";
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                answer = str[i];
            }
        }
        System.out.println(answer);
    }
}
