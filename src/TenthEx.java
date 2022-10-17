public class TenthEx {
    public static void main(String[] args) {
        // тестируем результат
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    public static boolean abcmath(int num, int amount, int devider) {
        int result = 0; // инициализируем переменную result
        result += num; // добавляем к ней число num
        for (int i = 1; i < amount; i++) { // в цикле добавляем к result переменную result до тех пор, пока i < amount
            result += result;
        }

        if (result % devider == 0) { // проверяем, делится ли result на devider
            return true; // возвращаем true, если делится
        } else {
            return false; // возвращаем false, если не делится
        }
    }
}
