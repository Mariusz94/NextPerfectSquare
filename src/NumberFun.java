public class NumberFun {
    public static void main(String[] args) {
        int number = 122;
        System.out.println(findNextSquare(number));
    }

    public static long findNextSquare(long sq) {
        double number = Math.sqrt(sq);
        if (!(number % 1 == 0.0)) return -1;
        return (long) (++number * number);
    }
}