//Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его десятичной записи).
public class task7 {
    public static void main(String[] args) {
        int a = 1234;
        System.out.println(a%100/10);
    }
}