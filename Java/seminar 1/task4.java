//- Даны две переменные. Поменяйте значения переменных друг с другом двумя способами
public class task4 {
    public static void main(String[] args){
        int a, b;
        a=1;
        b=2;
        System.out.println("a = "+a+" b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a+" b = "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("a = "+a+" b = "+b);
    }
}