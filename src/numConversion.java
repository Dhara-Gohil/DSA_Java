public class numConversion {
    public static void main(String[] args) {
        decimalToAnyBase(5, 2);
        AnyBaseTODecimal(0, 2);
    }

    static void decimalToAnyBase(int decimalNum, int base) {
        int resNUm = 0;
        int power = 0;
        while (decimalNum > 0) {
            int rem = decimalNum % base;
            decimalNum /= base;

            resNUm += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Result is  " + resNUm);
    }

    static void AnyBaseTODecimal(int binaryNum, int base) {
        int resNum = 0;
        int power = 0;
        while (binaryNum > 0) {
            int unitDigit = binaryNum % 10;
            binaryNum /= 10;
            resNum += unitDigit * Math.pow(base, power);
            power++;
        }
        System.out.println("Result is " + resNum);
    }
}
