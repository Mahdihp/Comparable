import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int i = sc.nextInt();
            if (i == -1) {
                break;
            } else {
                list.add(i);
            }
        }

        /*Collections.sort(list, (t1, t2) -> {
            if (t1.intValue() > t2.intValue())
                return -1;
            else if (t2.intValue() > t1.intValue())
                return 1;
            else
                return 0;
        });*/
        Collections.sort(list, (t1,t2)-> {
            return t1 % 5 - t2 % 5;
        });
        for (Integer i : list)
            System.out.println(i);
    }
}
