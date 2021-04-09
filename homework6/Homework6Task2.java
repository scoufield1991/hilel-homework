public class Homework6Task2 {
    public static void main(String[] args) {


        int[] mas = {2, 4, 0, 6, 1, 8, 9, -3};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        System.out.println("Sum " + sum);
        double sa = (double) sum / mas.length;
        System.out.println("Avg " + sa);

        //System.out.println(min(mas));
        //System.out.println(max(mas));
        System.out.println("Count: "+(Math.abs(max(mas)-min(mas))-1));
    }

    public static int min(int[] mas) {
        int min = mas[0];
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i]) {
                min = mas[i];
                k = i;
            }
        }
        return k;
    }

    public static int max(int[] mas) {
        int max = mas[0];
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                k = i;
            }
        }
        return k;
    }
}
