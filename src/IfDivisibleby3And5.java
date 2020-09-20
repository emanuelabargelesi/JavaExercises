public class IfDivisibleby3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Number " + i + " can be devided both by 3 and 5");
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }
}
