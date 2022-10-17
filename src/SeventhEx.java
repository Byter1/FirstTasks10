public class SeventhEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }

    public static int addUpTo(int roof) {
        int result = 0; // инициализация переменной, которую будем возвращать, как результат
        for (int i = 1; i <= roof; i++) { // в цикле суммируем числа до числа roof включительно
            result += i;
        }
        return result; // возвращаем результат
    }
}
