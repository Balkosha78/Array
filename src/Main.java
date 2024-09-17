import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("В обратном порядке");
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
    public static void task2() {
        double[] arr = {3.5, 8.7, 1.2, 9.8, 2.1, 4.6, 6.6};
        System.out.println("сортировка по убыванию ");
        System.out.println(Arrays.toString(sortArr(arr)));
    }
        private static double[] sortArr(double[] arr){
                for (double i = 0; i < arr.length; i++) {
                    for (double j = 0; j < arr.length - 1; j++) {
                        if (arr[(int) j] < arr[(int) (j + 1)]) {
                            int temp = (int) arr[(int) j];
                            arr[(int) j] = arr[(int) (j + 1)];
                            arr[(int) (j + 1)] = temp;
                        }

                    }

                }
                return arr;
            }
    public static void task3(){
        System.out.println("Вывод четных элементов");
        int[] array = {6, 117, 44, 5, 32, 81, 9};
             for (int arrays : array) {
                if (arrays % 2 == 0) {
                    System.out.println(arrays);
                }
             }
    }
}






