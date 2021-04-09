import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Homework6Task3 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Введите длину массива");
        String len = bufferedReader.readLine();
        int lenValue = Integer.parseInt(len);

        int []mas = new int[lenValue];

        for (int i=0; i < mas.length; i++){
            String m = bufferedReader.readLine();
            mas[i] = Integer.parseInt(m);
        }
        int min =mas[0];
        for (int i=0; i < mas.length;i++){
            if (min >= mas[i]){
                min = mas[i];
            }
        }
        System.out.println("Minimum value: "+min);
    }
}
