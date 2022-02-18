import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] arr = kb.nextLine().toCharArray();

        char[] ch = {'U', 'C', 'P', 'C'};
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (cnt == 4) {
                System.out.println("I love UCPC");
                return;
            }

            if (arr[i] == ch[cnt]) {
                cnt++;
            }
        }

        System.out.println("I hate UCPC");

    }
}
