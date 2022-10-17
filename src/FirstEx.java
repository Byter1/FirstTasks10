public class FirstEx {
    public static void main(String[] args) {
        // тестируем выполнение
        System.out.println(reminder(1,3));
        System.out.println(reminder(3,4));
        System.out.println(reminder(-9,45));
        System.out.println(reminder(5,5));
    }

    public static int reminder(int firstNum, int secondNum) {
        return firstNum % secondNum;
    } // возвращаем результат
}
