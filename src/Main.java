import java.math.BigDecimal;

//Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
// Задать перегруженные методы возвращающие результат арифметических операций над заданными полями и полями типа BigDecimal.

public class Main {

    public static void main(String[] args) {
        System.out.println(argument.summ(0.2, 0.2));
        System.out.println(argument.BigDecimalsumm(0.2, 0.2));

    }
}

class argument {

    private int a1;
    private int a2;
    private double b1;
    private double b2;

   static public int summ(int a1, int a2) {
        return a1 + a2;
    }

  static public double summ(double b1, double b2) {
        return b1 + b2;
    }

   static public BigDecimal BigDecimalsumm(int a1, int a2) {
        return (new BigDecimal(a1).add(new BigDecimal(a2)));
    }

    static public BigDecimal BigDecimalsumm(double b1, double b2) { BigDecimal now = new BigDecimal(b1);

        BigDecimal now1 = new BigDecimal(b2);
        return now.add(now1);
    }


}




















         /*BigDecimal result = Test.add(new BigDecimal(30));
         System.out.println(result);*/



        /* argumetnt argumetnt1 = new znach();

        argumetnt1.arg();
                argumetnt1.arg2();
                int c;
                double v;

                BigDecimal A = new BigDecimal("10000000000");
                BigDecimal B = new BigDecimal("20000000000");
                BigDecimal C = new BigDecimal("30000000000");
                BigDecimal resultSum = (A).add(B).add(C);
                System.out.println("A+B+C= " + resultSum);*/