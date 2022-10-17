public class NinthEx {
    public static void main(String[] args) {
        int[] nums = {1,5,9}; // исходный список с числами
        System.out.println(sumOfCubes(nums)); // тестируем программу
    }

    public static int sumOfCubes(int[] numbers) {
        int result = 0; // инициализируем переменную result, в которую запишем результат и вернём
        for (int i=0; i < numbers.length; i++) { // в цикле добавляем к result переменную num умноженную саму на себя 3 раза
            int num = numbers[i];
            result += num*num*num;
        }
        return result; // возвращаем результат
    }

}
