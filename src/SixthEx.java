public class SixthEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
    }

    public static int ctoa(char ch) {
        // преобразуем символ в ASCII
        return (int) ch;
    }
}
