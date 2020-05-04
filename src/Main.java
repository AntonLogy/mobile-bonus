public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payed = 1100;
        int bonus;
        if (payed >= 1000) {
            bonus = payed / 100;
        } else {
            bonus = 0;
        }
        long total = balance + payed + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}
