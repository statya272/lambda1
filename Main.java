public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        /*
        Код выполнится с ошибкой из-за деления на 0.
        Способы решения:
        - Поместить код вычисления в блок try{} для обработки исключения;
        - В лямбда-выражении вычисления результата деления использовать тернарный оператор, аналогично
          переменной abs;
        - Тело лямбда-выражения реализовать в {} с проверкой делителя на 0 и необходимыми действиями.
         */

        calc.println.accept(c);
    }
}
