 //Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
public class task5 {
    public static void main(String[] args) {
        int a, b;
        double c;
        a = 7;
        b = 8;
        c = Math.sqrt(a*a+b*b);

        System.out.println("a = "+a+" b = " +b);
        System.out.println("c = "+c);
    }
}