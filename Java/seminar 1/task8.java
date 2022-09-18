//Дано двузначное число. Найдите число десятков в нем.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8 {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        System.out.println(n/10);
    }
}