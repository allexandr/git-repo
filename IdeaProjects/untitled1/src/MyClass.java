/**
 * Created by alex on 24.12.2015.
 */
public class MyClass {

    public static void main(String args[]) {
        int i = 100;
        while (i > 0) {
            do {
                if (i >= 10){
                    i--;
                    continue;
                }
                i--;
                break;
            } while (i > 0);
            System.out.print(i);
        }

    }
}


