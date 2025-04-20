public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int desiredSum = 2_459_000;
        int month = 0;
        int sum = 0;
        int amount = 15_000;
        double procent = 10 / 100;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + procent));
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
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int country = 12_000_000;
        int natalityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear;
                year < currentYear + 10; year++) {
            country += country * natalityPerThousand / 1000 - country * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + country);
        }
        System.out.println("Задание 4");
        procent = 70/100;
        desiredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + procent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задание 5");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + procent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        //Задание 6
        sum = amount;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + procent));
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
        //Задание 8
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
