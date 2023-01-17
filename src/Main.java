import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        System.out.println("Задача 1");

        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {2, 7, 5, 8, 9};

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {2, 7, 5, 8, 9};
        System.out.println(one[0] + "," + one[1] + "," + one[2]);
        System.out.println(two[0] + "," + two[1] + "," + two[2]);
        System.out.println(three[0] + "," + three[1] + "," + three[2] + "," + three[3] + "," + three[4]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {2, 7, 5, 8, 9};
        System.out.println(one[2] + "," + one[1] + "," + one[0]);
        System.out.println(two[2] + "," + two[1] + "," + two[0]);
        System.out.println(three[4] + "," + three[3] + "," + three[2] + "," + three[1] + "," + three[0]);

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] = one[i] + 1;
            }
            /*if (i == one.length - 1) {
              System.out.print(Arrays.toString(one));
                break;
            }*/
            System.out.print(one[i]+" ");
        }
    }
}


