import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Custom: Hello, World!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("TASK 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog value: " + dog);
        System.out.println("Cat value: " + cat);
        System.out.println("Paper value: " + paper);

        System.out.println("TASK 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Dog value: " + dog);
        System.out.println("Cat value: " + cat);
        System.out.println("Paper value: " + paper);

        System.out.println("TASK 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Dog value: " + dog);
        System.out.println("Cat value: " + cat);
        System.out.println("Paper value: " + paper);

        System.out.println("TASK 4");

        var friend = 19;

        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("TASK 5");

        var frog = 3.5;

        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("TASK 6");

        var guyOne = 78.2;
        var guyTwo = 82.7;
        var massTotal = guyOne + guyTwo;
        var massDiff = Math.abs(guyOne - guyTwo);

        System.out.println("Mass total: " + massTotal + " kg");
        System.out.println("Mass diff: " + massDiff + " kg");

        System.out.println("TASK 7");

        double remainderOfDivision;

        if (guyOne > guyTwo) {
            remainderOfDivision = guyOne % guyTwo;
        } else {
            remainderOfDivision = guyTwo % guyOne;
        }

        System.out.println(remainderOfDivision);

        System.out.println("TASK 8");

        var totalCapacity = 640;
        var employerCapacity = 8;
        var employersCount = totalCapacity / employerCapacity;
        var increasedEmployersCount = employersCount + 94;
        var increasedTotalCapacity = increasedEmployersCount * employerCapacity;

        System.out.println("Employers total (body): " + employersCount);
        System.out.println("If employers count: " + increasedEmployersCount + " then capacity available (hour): " + increasedTotalCapacity);
        System.out.println();

        // Homework 3

        System.out.println("TASK 1");

        int weight = 56500;
        byte age = 17;
        short totalDevices = 5000;
        long counter = 6;
        float progress = 99.6F;
        double longitude = 55.7558334867541;

        System.out.println("Variable: name 'weight', type 'int', value " + weight);
        System.out.println("Variable: name 'age', type 'byte', value " + age);
        System.out.println("Variable: name 'totalDevices', type 'short', value " + totalDevices);
        System.out.println("Variable: name 'counter', type 'long', value " + counter);
        System.out.println("Variable: name 'progress', type 'float', value " + progress);
        System.out.println("Variable: name 'longitude', type 'double', value " + longitude);
        System.out.println();

        System.out.println("TASK 2");

        float variableOne = 27.12F;
        long variableTwo = 987678965549L;
        float variableThree = 2.786F; /* OR 'char variableThree = "2,786";' ? */
        short variableFour = 569;
        short variableFive = -159;
        short variableSix = 27897;
        byte variableSeven = 67;

        // nothing output according the task
        System.out.println();

        System.out.println("TASK 3");

        short sheetsTotal = 480;
        byte countOfStudentsLudmilaPavlovna = 23;
        byte countOfStudentsAnnaSergeevna = 27;
        byte countOfStudentsEkaterinaAndreevna = 30;
        byte studentsTotal;
        byte sheetsPerStudent;

        studentsTotal = (byte) (countOfStudentsLudmilaPavlovna + countOfStudentsAnnaSergeevna + countOfStudentsEkaterinaAndreevna);
        sheetsPerStudent = (byte) (sheetsTotal / studentsTotal);

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
        System.out.println();

        System.out.println("TASK 4");

        byte itemsPerMinute;
        byte itemsPerTwoMinutes = 16;
        short itemsPerTwentyMinutes;
        int itemsPerOneDay;
        int itemsPerThreeDays;
        int itemsPerThirtyDays;

        itemsPerMinute = (byte) (itemsPerTwoMinutes / 2);
        itemsPerTwentyMinutes = (short) (itemsPerMinute * 20);
        itemsPerOneDay = itemsPerMinute * 60 * 24;
        itemsPerThreeDays = itemsPerOneDay * 3;
        itemsPerThirtyDays = itemsPerOneDay * 30;

        System.out.println("За 20 минут машина произвела " + itemsPerTwentyMinutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + itemsPerOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + itemsPerThreeDays + " штук бутылок");
        System.out.println("За 30 дней машина произвела " + itemsPerThirtyDays + " штук бутылок");
        System.out.println();

        System.out.println("TASK 5");

        byte paintTotal = 120;
        byte paintWhiteConsumption = 2;
        byte paintBrownConsumption = 4;
        byte roomsTotal;
        byte paintWhiteRequired;
        byte paintBrownRequired;

        roomsTotal = (byte) (paintTotal / (paintWhiteConsumption + paintBrownConsumption));
        paintWhiteRequired = (byte) (paintWhiteConsumption * roomsTotal);
        paintBrownRequired = (byte) (paintBrownConsumption * roomsTotal);

        System.out.println("В школе, где " + roomsTotal + " классов, нужно " + paintWhiteRequired
                + " банок белой краски и " + paintBrownRequired + " банок коричневой краски");
        System.out.println();

        System.out.println("TASK 6");

        short weightTotalGram;
        float weightTotalKGram;

        // One item weight in gram.
        byte weightBanana = 80;
        byte weightMilk = 105;  // 100 ml
        byte weightIceCream = 100;
        byte weightEgg = 70;

        weightTotalGram = (short) (weightBanana * 5 + weightMilk * 2 + weightIceCream * 2 + weightEgg * 4);
        weightTotalKGram = (float) (weightTotalGram / 1000);

        System.out.println("Breakfast weight in gram: " + weightTotalGram);
        System.out.println("Breakfast weight in Kg: " + weightTotalKGram);
        System.out.println();

        System.out.println("TASK 7");

        short minLostDynamic;
        short maxLostDynamic;
        short averageLostDynamic;

        short weightLoseGoal = 7000;
        short minLostPerDay = 250;
        short maxLostPerDay = 500;

        minLostDynamic = (short) Math.round((float) (weightLoseGoal / minLostPerDay));
        maxLostDynamic = (short) Math.round((float) (weightLoseGoal / maxLostPerDay));
        averageLostDynamic = (short) Math.round((float) (weightLoseGoal / ((minLostPerDay + maxLostPerDay) / 2)));

        System.out.println("Minimum weight lost dynamic in days: " + minLostDynamic);
        System.out.println("Maximum weight lost dynamic in days: " + maxLostDynamic);
        System.out.println("Average weight lost dynamic in days: " + averageLostDynamic);
        System.out.println();

        System.out.println("TASK 8");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        float coefficient = 1.1F;
        int periodInMonths = 12;

        int salaryPerYearMasha;
        int salaryPerYearDenis;
        int salaryPerYearKristina;

        double salaryIncreasedMasha;
        double salaryIncreasedDenis;
        double salaryIncreasedKristina;

        double salaryIncreasedPerYearMasha;
        double salaryIncreasedPerYearDenis;
        double salaryIncreasedPerYearKristina;

        double salaryDiffPerYearMasha;
        double salaryDiffPerYearDenis;
        double salaryDiffPerYearKristina;

        salaryIncreasedMasha = salaryMasha * coefficient;
        salaryIncreasedDenis = salaryDenis * coefficient;
        salaryIncreasedKristina = salaryKristina * coefficient;

        salaryPerYearMasha = salaryMasha * periodInMonths;
        salaryPerYearDenis = salaryDenis * periodInMonths;
        salaryPerYearKristina = salaryKristina * periodInMonths;

        salaryIncreasedPerYearMasha = salaryIncreasedMasha * periodInMonths;
        salaryIncreasedPerYearDenis = salaryIncreasedDenis * periodInMonths;
        salaryIncreasedPerYearKristina = salaryIncreasedKristina * periodInMonths;

        salaryDiffPerYearMasha = salaryIncreasedPerYearMasha - salaryPerYearMasha;
        salaryDiffPerYearDenis = salaryIncreasedPerYearDenis - salaryPerYearDenis;
        salaryDiffPerYearKristina = salaryIncreasedPerYearKristina - salaryPerYearKristina;

        System.out.println("Маша теперь получает " + salaryIncreasedMasha + " рублей. Годовой доход вырос на " + salaryDiffPerYearMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreasedDenis + " рублей. Годовой доход вырос на " + salaryDiffPerYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreasedKristina + " рублей. Годовой доход вырос на " + salaryDiffPerYearKristina + " рублей");
        System.out.println();

        // Homework 4

        System.out.println("TASK 1");

        byte personAge = 10;

        System.out.print("Если возраст человека равен " + personAge + ", то он ");

        if (personAge > 17) {
            System.out.print("совершеннолетний");
        } else {
            System.out.print("не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();

        System.out.println("TASK 2");

        byte temperature = 5;

        if (temperature < 5) {
            System.out.print("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.print("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println();

        System.out.println("TASK 3");

        byte speedCurrent = 60;

        if (speedCurrent > 60) {
            System.out.print("Если скорость " + speedCurrent + ", то придется заплатить штраф");
        } else {
            System.out.print("Если скорость " + speedCurrent + ", то можно ездить спокойно");
        }

        System.out.println();

        System.out.println("TASK 4");

        byte humanAge = 40;

        System.out.print("Если возраст человека равен " + humanAge + ", то ему нужно ходить ");

        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("в университет");
        } else if (humanAge > 24) {
            System.out.println("на работу");
        } else {
            System.out.println("... ему просто нужно ходить");
        }

        System.out.println();

        System.out.println("TASK 5");

        byte clientAge = 5;
        boolean hasClientAdult = true;

        System.out.print("Если возраст ребенка равен " + clientAge + ", то ему ");

        if (clientAge < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (clientAge >= 5 && clientAge < 14) {
            if (hasClientAdult) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("нельзя кататься на аттракционе без сопровождения взрослого");
            }
        } else {
            System.out.println("можно кататься на аттракционе");
        }

        System.out.println();

        System.out.println("TASK 6");

        int ticketsToSitSoldOut = 58;
        int ticketsToStandSoldOut = 39;

        byte wagonCapacity = 102;
        byte sitPlaces = 60;
        byte standPlaces = (byte) (wagonCapacity - sitPlaces);

        byte sitPlacesAvailable = (byte) (sitPlaces - ticketsToSitSoldOut);
        byte standPlacesAvailable = (byte) (standPlaces - ticketsToStandSoldOut);

        if (sitPlacesAvailable > 0) {
            System.out.println("В вагоне доступно " + sitPlacesAvailable + " сидячих мест");
        } else {
            System.out.println("В вагоне заняты все сидячие места");
        }

        if (standPlacesAvailable > 0) {
            System.out.println("В вагоне доступно " + standPlacesAvailable + " стоячих мест");
        } else {
            System.out.println("В вагоне заняты все стоячие места");
        }

        if (sitPlacesAvailable < 1 && standPlacesAvailable < 1) {
            System.out.println("Вагон уже полностью забит");
        }

        System.out.println();

        System.out.println("TASK 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two) {
            if (one > three) {
                System.out.println("Число one наибольшее: " + one);
            } else {
                System.out.println("Число three наибольшее: " + three);
            }
        } else {
            if (two > three) {
                System.out.println("Число two наибольшее: " + two);
            } else {
                System.out.println("Число three наибольшее: " + three);
            }
        }

        System.out.println();

        // Homework 5

        System.out.println("TASK 1");

        byte clientOS = 1; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();

        System.out.println("TASK 2");

        byte mobileClientOS = 0; // 0 — iOS, 1 — Android
        short clientDeviceYear = 2014;

        if (mobileClientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (mobileClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (mobileClientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();

        System.out.println("TASK 3");

        short year = 2021;
        boolean leapYear;
        int remainderFromFourHundred;
        int remainderFromOneHundred;
        int remainderFromFour;

        remainderFromFourHundred = year % 400;
        remainderFromOneHundred = year % 100;
        remainderFromFour = year % 4;

        if (year < 1584) {
            leapYear = false;
        } else if (remainderFromFourHundred == 0) {
            leapYear = true;
        } else if (remainderFromOneHundred == 0 && remainderFromFourHundred > 0) {
            leapYear = false;
        } else if (remainderFromFour == 0 && remainderFromOneHundred > 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();

        System.out.println("TASK 4");

        int deliveryDistance = 95; // km
        byte deliveryTime;

        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 0;
        }

        if (deliveryTime == 0) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        System.out.println();

        System.out.println("TASK 5");

        byte monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("принадлежит к сезону осень");
                break;
            default:
                throw new RuntimeException("Номер месяца меньше 1 или больше 12, программа не будет выполняться");
        }

        System.out.println();

        // --- Homework 6 ---

        System.out.println("TASK 1");

        for (var i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();


        System.out.println("TASK 2");

        for (var i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println("TASK 3");

        for (var i = 0; i < 17; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println("TASK 4");

        for (var i = 10; i >= -10; i--) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println("TASK 5");

        for (var i = 1904; i <= 2096; i += 4) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println("TASK 6");

        for (var i = 0; i <= 98; i += 7) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println("TASK 7");

        for (var i = 1; i <= 512; i *= 2) {
            System.out.print(i + ", ");
        }

        System.out.println();

        System.out.println("TASK 8");

        int sum = 0;

        for (var i = 1; i <= 12; i++) {
            sum += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println();

        System.out.println("TASK 9");

        int sumInBank = 0;

        for (var i = 1; i <= 12; i++) {
            sumInBank = sumInBank + sumInBank / 100 + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumInBank + " рублей");
        }

        System.out.println();

        System.out.println("TASK 10");

        int result;

        for (var i = 1; i <= 10; i++) {

            result = i * 2;

            System.out.println("2*" + i + "=" + result);
        }

        System.out.println();

        // --- Homework 7 ---

        System.out.println("TASK 1");
        var sumCurrent = 0;
        var sumGoal = 2459000;
        var sumIncrement = 15000;
        var monthNum = 0;

        while (sumCurrent < sumGoal) {
            sumCurrent = sumCurrent + sumIncrement;
            monthNum++;
        }

        System.out.println("Месяц " + monthNum + ", сумма накоплений равна " + sumGoal + " рублей");
        System.out.println();

        System.out.println("TASK 2");
        var someCounterOne = 0;

        while (someCounterOne < 10) {
            someCounterOne++;
            System.out.print(someCounterOne + " ");
        }

        System.out.println();

        for (; someCounterOne > 0; someCounterOne--) {
            System.out.print(someCounterOne + " ");
        }

        System.out.println();

        System.out.println("TASK 3");

        var population = 12000000;
        var incrementPerThousand = 17;
        var decrementPerThousand = 8;
        var periodInYears = 10;

        for (var i = 1; i <= periodInYears; i++) {
            population = population + (population / 1000 * incrementPerThousand) - (population / 1000 * decrementPerThousand);

            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println();

        System.out.println("TASK 4");

        var accountOfVasya = 15000;
        var goalOfVasya = 12000000;
        var incrementInPercent = 17;
        var monthCounter = 0;

        while (accountOfVasya < goalOfVasya) {
            monthCounter++;
            accountOfVasya = accountOfVasya + (accountOfVasya / 100 * incrementInPercent);

            System.out.println("Месяц " + monthCounter + ", баланс на счёте " + accountOfVasya);
        }

        System.out.println();
        System.out.print("Несчастному Васе придётся копить " + monthCounter + " месяцев");
        System.out.println(", чтобы собрать сумму в " + goalOfVasya + " рублей");

        System.out.println();

        System.out.println("TASK 5");

        accountOfVasya = 15000;
        goalOfVasya = 12000000;
        incrementInPercent = 17;
        monthCounter = 0;

        while (accountOfVasya < goalOfVasya) {
            monthCounter++;
            accountOfVasya = accountOfVasya + (accountOfVasya / 100 * incrementInPercent);

            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", баланс на счёте " + accountOfVasya);
            }
        }

        System.out.println();
        System.out.print("Несчастному Васе придётся копить " + monthCounter + " месяцев");
        System.out.println(", чтобы собрать сумму в " + goalOfVasya + " рублей");

        System.out.println();

        System.out.println("TASK 6");

        byte periodYears = 9;
        int periodMonths;
        long longTermAccount = 15000L;
        byte incrementPerMonthInPercent = 17;
        monthCounter = 0;

        periodMonths = periodYears * 12;

        while (monthCounter < periodMonths) {
            monthCounter++;
            longTermAccount = longTermAccount + (longTermAccount / 100 * incrementPerMonthInPercent);

            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ", баланс на счёте " + longTermAccount);
            }
        }

        System.out.println();
        System.out.println("Вася решил копить " + periodYears + " лет и соберёт сумму в " + longTermAccount + " рублей");
        System.out.println();

        System.out.println("TASK 7");

        int dayAsFirstFriday = 5;   // available values: 1-7
        byte dayCurrent;            // this variable created to avoid the dayAsFirstFriday changing according the task
        byte daysInMonth = 31;

        dayCurrent = (byte) dayAsFirstFriday;

        while (dayCurrent <= daysInMonth) {
            System.out.println("Сегодня пятница, " + dayCurrent + "-е число. Необходимо подготовить отчёт.");
            dayCurrent += 7;
        }

        System.out.println();

        System.out.println("TASK 8");

        int orbitPeriodYears = 79;
        int currentYear = 2025;
        int minYearLimit;
        int maxYearLimit;

        minYearLimit = currentYear - 200;
        maxYearLimit = currentYear + 100;

        for (currentYear = 0; currentYear <= maxYearLimit; currentYear += orbitPeriodYears) {
            if (currentYear >= minYearLimit) {
                System.out.println(currentYear);
            }
        }

        System.out.println();
        System.out.println();

        // --- Homework 8 ---

        System.out.println("TASK 1");

        int[] arrayOne = new int[3];

        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        float[] arrayTwo = {1.57F, 7.654F, 9.986F};

        Object[] arrayThree = {new Object(), new Object()};

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

        System.out.println();

        System.out.println("TASK 2");

        for (var i = 0; i < arrayOne.length; i++) {
            if (i == 0) {
                System.out.print(arrayOne[i]);
            } else {
                System.out.print(", " + arrayOne[i]);
            }
        }

        System.out.println();

        for (var i = 0; i < arrayTwo.length; i++) {
            if (i == 0) {
                System.out.print(arrayTwo[i]);
            } else {
                System.out.print(", " + arrayTwo[i]);
            }
        }

        System.out.println();

        for (var i = 0; i < arrayThree.length; i++) {
            if (i == 0) {
                System.out.print(arrayThree[i]);
            } else {
                System.out.print(", " + arrayThree[i]);
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("TASK 3");

        for (var i = arrayOne.length - 1; i >= 0; i--) {
            if (i == arrayOne.length - 1) {
                System.out.print(arrayOne[i]);
            } else {
                System.out.print(", " + arrayOne[i]);
            }
        }

        System.out.println();

        for (var i = arrayTwo.length - 1; i >= 0; i--) {
            if (i == arrayTwo.length - 1) {
                System.out.print(arrayTwo[i]);
            } else {
                System.out.print(", " + arrayTwo[i]);
            }
        }

        System.out.println();

        for (var i = arrayThree.length - 1; i >= 0; i--) {
            if (i == arrayThree.length - 1) {
                System.out.print(arrayThree[i]);
            } else {
                System.out.print(", " + arrayThree[i]);
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("TASK 4");

        for (var i = 0; i < arrayOne.length; i++) {

            if (arrayOne[i] % 2 != 0) {
                arrayOne[i]++;
            }

            if (i == 0) {
                System.out.print(arrayOne[i]);
            } else {
                System.out.print(", " + arrayOne[i]);
            }
        }

        System.out.println();
        System.out.println();

        // --- Homework 9 ---

        System.out.println("TASK 1");

        int[] salaryTransactions = {10000, 15000, 13000};
        int sumOfTransactions = 0;

        for (int transaction : salaryTransactions) {
            sumOfTransactions += transaction;
        }

        System.out.println("Сумма трат за месяц составила " + sumOfTransactions + " рублей");
        System.out.println();

        System.out.println("TASK 2");

        int[] somePayments = {200, 10, 50, 75, 580};
        int maxPayment = 0;
        int minPayment = 0;

        for (int somePayment : somePayments) {
            if (somePayment > maxPayment) {
                maxPayment = somePayment;
            }

            if (somePayment < minPayment || minPayment == 0) {
                minPayment = somePayment;
            }
        }

        System.out.print("Минимальная сумма трат за неделю составила " + minPayment + " рублей.");
        System.out.println(" Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        System.out.println();

        System.out.println("TASK 3");

        int[] paymentsByWeeks = {10000, 800, 740, 120, 2};
        int sumOfPayments = 0;
        float averagePayment;

        for (int paymentByWeek : paymentsByWeeks) {
            sumOfPayments += paymentByWeek;
        }

        averagePayment = (float) sumOfPayments / paymentsByWeeks.length;

        System.out.println("Средняя сумма трат за неделю составила " + averagePayment + " рублей");
        System.out.println();

        System.out.println("TASK 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char buffer;
        int halfLengthOfArray = reverseFullName.length / 2;

        for (int i = 0; i < halfLengthOfArray; i++) {

            buffer = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = buffer;
        }

        System.out.println(Arrays.toString(reverseFullName));
        System.out.println();
    }
}
