public class Homework6Task1 {
    public static void main(String[] args) {
        int[] mas = {2, 4, 8, 5, 0, 9};
        int k = 3;
        System.out.println(sum(mas,k));
        if (sum(mas, k) == 0) {
            System.out.println("Happy ticket");
        } else
            System.out.println("Unhappy ticket");
    }

    public static int sum(int[] mas, int k) {
        /*int sum = 0;
        for (int i = 0; i < mas.length - k; i++) {
            sum = sum + mas[i];
        }
        int sum1 = 0;
        for (int i = mas.length - 1; i >= mas.length - k; i--) {
            sum1 = sum1 + mas[i];
        }
        return sum - sum1;
    }*/
        int sum = 0;
        for (int i = 0; i < mas.length / 1 ; i++) {
            sum += mas[i];
        }
        return sum;
    }
}

