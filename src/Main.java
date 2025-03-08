public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println(" Task 1 ");


        int deposit = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_450_000) {
            total = total + deposit;
            i++;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }

        // Task 2
        System.out.println(" Task 2 ");

        int a = 0;
        while (a<10){
            a++;
            System.out.print(a + " ");
        }

        System.out.println();

        for (int b = 10; b >= 1; b--){
            System.out.print(b + " ");
        }
        System.out.println();

        // task 3
        System.out.println(" Task 3");

        int initialPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int years = 0;
        while (years<10){
            initialPopulation = initialPopulation + initialPopulation * (birthRate - deathRate)/1000;
            years++;
            System.out.println("Год " + years + " численность населения составляет " + initialPopulation);
        }

        // Task 4
        System.out.println(" Task 4 ");

        double initialAmount = 15_000;
        double targetAmount = 12_000_000;
        int  month = 0;
        double interestRate = 0.07;
        while(initialAmount < targetAmount){
            initialAmount = initialAmount + initialAmount * interestRate;
            month++;
            System.out.println(" Месяц " + month + " , сумма накоплений " + initialAmount + " рублей ");
        }

        // Task 5
        System.out.println("Task 5");

        double initialAmount1 = 15_000;
        double targetAmount1 = 12_000_000;
        int month1 = 0;
        double interestRate1 = 0.07;
        while (initialAmount1 < targetAmount1) {
            initialAmount1 += initialAmount1 * interestRate1;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println(" Месяц " + month1 + " , сумма накоплений " + initialAmount1 + " рублей ");
            }
        }

        // Task 6
        System.out.println(" Task 6 ");

        double initialAmount2 = 15_000;
        double interestRate2 = 0.07;
        int years1 = 9;
        int months = years1 * 12;
        int month2 = 0;
        while(month2 <= months){
            initialAmount2 += initialAmount2 * interestRate2;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(" Месяц " + month2 + " , сумма накоплений " + initialAmount2 + " рублей ");
            }
        }

        // Task 7
        System.out.println(" Task 7 ");

        int daysMonth = 31;
        int firstFriday = 5;
        int day = 1;
        while (day <= daysMonth) {
            if ((day - firstFriday) % 7 == 0) {
                System.out.println(" Сегодня пятница " + day + " число ");
            }
            day++;
        }

        // Task 8
        System.out.println(" Task 8 ");

        int cometInterval = 79;
        int currentYear = 2025;
        int startPeriod = currentYear - 200;
        int finishPeriod = currentYear + 100;
        for (int year = startPeriod; year <= finishPeriod; year++){
            if (year % cometInterval == 0 ) {
                System.out.println(year);
            }
        }


    }
}