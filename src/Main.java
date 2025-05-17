public class Main {
    public static void main(String[] args) {
        //Задача 1
        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 12.0 / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        //Задача 2
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) System.out.print(number + " ");
        System.out.println();
        //Задача 3
        int country = 12_000_000;
        int natalityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            country += country * natalityPerThousand / 1000 - country * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + country);
        }
        //Задача 4
        desiredSum = 12_000_000;
        percent = 7.0 / 100;
        month = 0;
        sum = amount;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        //Задача 5
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //Задача 6
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //Задача 7
        int friday = 3;
        for (int day = friday; day <=31; day +=7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
        }
        //Задача 8
        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}
