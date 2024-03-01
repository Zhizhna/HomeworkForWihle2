public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int givenMoney = 0;
        for (int month = 1; givenMoney <= 2459000; month++) {
            givenMoney += 15000;
            givenMoney *= 1.01;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + givenMoney + " рублей");
        }

        System.out.println("Task 2");
        int num = 0;
        while (num <= 10){
            System.out.print(num + " ");
            num++;
        }
        num--;
        System.out.print("\n");
        while (num >= 0){
            System.out.print(num + " ");
            num--;
        }
        System.out.print("\n");

        System.out.println("Task 3");
        int peopleInCountry = 12000000;
        double birthPercent = 0.017;
        double deathPercent = 0.008;
        double totalChanges = birthPercent - deathPercent;
        for (int year = 1; year <= 10; year++){
            peopleInCountry = (int) (peopleInCountry + peopleInCountry * totalChanges);
            System.out.println("Год " + year + " , численность населения составляет " + peopleInCountry);
        }

        System.out.println("Task 4");
        double percent = 0.07;
        int moneyCount = 15000;
        for (int month = 1; moneyCount <= 12000000; month++){
            moneyCount += moneyCount * percent;
            System.out.println(month + " he will earn " + moneyCount);
        }

        System.out.print("Task 5");
        double percent2 = 0.07;
        int moneyCount2 = 15000;
        for (int month = 1; moneyCount2 <= 12000000; month++){
            moneyCount2 += moneyCount2 * percent2;
            if (month % 6 == 0) {
                System.out.println(month + " he will earn " + moneyCount2);
            }
        }

        System.out.print("Task 6");
        double percent3 = 0.07;
        int moneyCount3 = 15000;
        int mothsInTotal = 9 * 12;
        for (int month = 1; month <= mothsInTotal; month++){
            moneyCount3 += moneyCount3 * percent3;
            if (month % 6 == 0) {
                System.out.println(month + " he will earn " + moneyCount3);
            }
        }

        System.out.print("Task 7");
        for (int numFri = 7;numFri <= 31;numFri += 7){
            System.out.println("Сегодня пятница, " + numFri + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Task 8");
        int cometYear = 0;
        int startingBorder = 2024 - 200;
        int endingBorder = 2024  + 100;
        while (cometYear <= startingBorder-79){
            cometYear += 79;
        }
        while (cometYear <= endingBorder-79){
            cometYear += 79;
            System.out.println(cometYear);
        }

    }
}