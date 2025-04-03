public class FastExponentiation {
    public static void main(String[] args) {
        fastExponentiation(5, 2);
    }

    static void fastExponentiation(int num, int power) {
        double res = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                res = res * num;
                power = (power - 1) / 2;
            } else {
                power /= 2;
            }
            num = num * num;
        }
        System.out.println("Result is : " + res);
    }
}
