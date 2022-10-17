public class FifthEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }

    public static String operation(int n, int firstNum, int secondNum) {
        if (firstNum + secondNum == n) { // если сумма чисел равна n, возвращаем "added"
            return "added";
        } else if (firstNum - secondNum == n) { // если разность чисел равна n, возвращаем "substracted"
            return "subtracted";
        } else if (firstNum * secondNum == n) { // если произведение чисел равно n, возвращаем "multiplied"
            return "multiplied";
        } else if (firstNum / secondNum == n) { // если частное чисел равно n, возвращаем "devided"
            return "devided";
        } else {
            return "none"; // если ни одна операция не прошла, то возвращаем "none"
        }
    }
}
