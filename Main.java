import java.util.Scanner;

class Kalkulator {
    int a,b;
    Kalkulator (int a, int b) {
        this.a=a;
        this.b=b;
    }
    int Penambahan() {return a+b;}
    int Pengurangan() {return a-b;}
    int Perkalian() {return a*b;}
    int Pembagian() {return a/b;}
    int modulus() {return a%b;}
}

public class Main {
    public static void main(String[] args) {
        Scanner kalku = new Scanner(System.in);
        System.out.print("Nilai a = ");
        int a=kalku.nextInt();
        System.out.print("Nilai b = ");
        int b=kalku.nextInt();

        System.out.print("Pilih (+, -, *, /, %)  \n = ");
        String op=kalku.next();
        int c=0;
        Kalkulator obj = new Kalkulator(a,b);
        switch (op) {
            case "+" : c=obj.Penambahan(); break;
            case "-" : c=obj.Pengurangan(); break;
            case "*" : c=obj.Perkalian(); break;
            case "/" : c=obj.Pembagian(); break;
            case "%" : c=obj.modulus(); break;
            default : System.out.println("!!!");
        }
        System.out.println(a+op+b+"="+c);
    }
}