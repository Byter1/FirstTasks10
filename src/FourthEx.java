public class FourthEx {
    public static void main(String[] args) {
        // тестируем программу
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }

    public static boolean profitableGamble(double prob, int prize, int pay) {
        // пишем простое условие
        return prob * prize > pay;
    }
}
