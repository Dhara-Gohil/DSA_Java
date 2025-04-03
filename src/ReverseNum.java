public class ReverseNum {
    public static void main(String[] args) {
        reverseNum(123456789);
    }

    static void reverseNum(int num) {
        int revNum = 0;
        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse NUmber : " + revNum);
    }
}
