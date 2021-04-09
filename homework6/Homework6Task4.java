import java.util.Arrays;

public class Homework6Task4 {
    public static void main(String[] args) {
        int[] mas = {6, 9, 8, 5, 0, 4, 2, 11};

        for (int i = 0; i < mas.length; i++) {
            System.out.println("Output mas: "+mas[i]);
        }
        for (int j =0; j < mas.length-1; j++) {
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    int c = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = c;
                }
            }
        }
        //Out put using for
        for (int i = 0; i < mas.length; i++){
            System.out.println("Out put using for: "+mas[i]);
        }
        //Out put using foreach
        for (int i: mas){
            System.out.println("Out put using foreach: "+i);
        }

        //Out put using for arrays
        String s = Arrays.toString(mas);
        System.out.println(s);
    }
}
