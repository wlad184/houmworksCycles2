public class Main {
    public static void main(String[] args) {
        //task #1.1
        int saving = 15000;
        double total = 0;
        int month = 0;
        while (total < 2459000) {
            month = month + 1;
            total = total + saving;
            System.out.println("Месяц " + month + "-й, сумма накоплений равна " + (int)total + " рублей");
            total = total * 1.01; // увеличение накоплений на 10%
        }
        System.out.println();


    }
}