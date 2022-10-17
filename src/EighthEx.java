public class EighthEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
    }

    public static int nextEdge(int firstSide, int secondSide) {
        return firstSide + secondSide - 1; // сумма двух сторон треугольника должна быть меньше третьей (условие существования треугольника)
    }
}
