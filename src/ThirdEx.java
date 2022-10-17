public class ThirdEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(animals(2,3,5));
        System.out.println(animals(1,2,3));
        System.out.println(animals(5,2,8));
    }

    public static int animals(int chickens, int cows, int pigs) {
        // умножаем количество куриц на 2 ноги, коров на 4, свиней на 4, результат суммируем
        return (chickens*2 + cows*4 + pigs*4);
    }
}
