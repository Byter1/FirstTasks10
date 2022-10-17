public class SecondEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
        triArea(10, 10);
    }

    public static int triArea(int base, int height) {
        // площадь треугольника равна половине основания умноженной на высоту
        return (base*height)/2;
    }
}
