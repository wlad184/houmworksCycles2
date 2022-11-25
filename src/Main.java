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

        //task #1.2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task #1.3
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int growth1000 = fertility - mortality; //прирост населения на 1000 человек в год
        int growthY = population / 1000 * growth1000; // общий прирост населения в стране Y в год
        for (int j = 1; j < 11; j++) {
            population = population + growthY;
            System.out.println("Год "+ j + ", численность населения составляет "+ population);
        }
        System.out.println();

        //task #2.1
        double contribution = 15000;
        double bid = 0.07; //процент ежемесячной ставки 7%
        total = 0;
        for (int m = 1; total < 14_000_000; m++) {
            total = total + contribution;
            System.out.println("Месяц " + m + "-й, сумма накоплений равна " + (int)total + " рублей");
            contribution = total * bid;
        }
        System.out.println();

        //task #2.2
        contribution = 15000;
        total = 0;
        for (int m = 1; total < 14_000_000; m++) {
            total = total + contribution;
            if (m % 6 == 0) System.out.println("Месяц " + m + "-й, сумма накоплений равна " + (int)total + " рублей");
            contribution = total * bid;
        }
        System.out.println();

        //task #2.3
        contribution = 15000;
        total = 0;
        for (int m = 1; m <=108; m++) { // 9 лет равняется 108 месяцам
            total = total + contribution;
            if (m % 6 == 0) System.out.println("Месяц " + m + "-й, сумма накоплений равна " + (int)total + " рублей");
            contribution = total * bid;
        }
        System.out.println();

        //task #2.4
        int friday = 5;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }



    }
}