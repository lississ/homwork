public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");

        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.3;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var massOne = 78.2;
        var massTwo = 82.7;
        var totalWeight = (massOne + massTwo);
        System.out.println(totalWeight);
        var difference = massTwo - massOne;
        System.out.println("Разница между массами бойцов " + difference);

        System.out.println("Задача 7");
        var remains = massTwo % massOne;
        System.out.println("Остаток от деления между двумя весами составляет" + remains);

        System.out.println("Задача 8");
        var hours = 640;
        var workingHours = 8;
        var workers = hours / workingHours;
        System.out.println("Всего раотников в компании - " + workers);

        workers = workers + 94;
        workingHours = hours / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workingHours + " часов работы может быть поделено между сотрудниками");

        System.out.println("Домашнее задание 2");

        System.out.println("Задача 1");
        byte one;
        short two;
        int three;
        long six;
        float seven;
        double eight;

        System.out.println("Задача 2");
        float floatOne = 27.12f;
        long longOne = 987678965549L;
        float floatTwo = 2.786f;
        short shortOne = 569;
        short shoetTwo = -159;
        int intOne = 27897;
        byte byteOne = 67;

        System.out.println("Задача 3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        int totalStudents = ludmila + anna + ekaterina;
        short totalSheets = 480;
        int sheetForOne = totalSheets / totalStudents ;
        System.out.println("Каждому ученику достанется " +sheetForOne + " листов бумаги");

        System.out.println("Задача 4");
        System.out.println("Дано: Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты");
        byte bottles = 16;
        int minute = bottles / 2 ;
        // за... произвела
        int productivityTwentyMinutes = minute *  20;
        int productivityDay = minute * 1440;
        int productivityThreeDays = productivityDay * 3;
        int productivityMonth = productivityDay * 30;

        System.out.println("За 20 минут машина произвела "+ productivityTwentyMinutes +" бутылок" );
        System.out.println("За сутки машина произвела " + productivityDay + " бутылок");
        System.out.println("За трое суток машина произвела"+ productivityThreeDays + " бутылок");
        System.out.println("За месяц машина произвела" + productivityMonth + " бутылок");

        System.out.println("Задача 5");
        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int totalPerClass = whitePerClass + brownPerClass;
        int numClasses = totalCans / totalPerClass;
        int whiteCans = whitePerClass * numClasses;
        int brownCans = brownPerClass * numClasses;
        System.out.println("В школе, где " + numClasses + " классов, нужно "+ whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски" );

        System.out.println("Задача 6");
        //Дано
        int bananaWeight = 80;
        int milkWeightPer100ml = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int bananaCount = 5;
        int milkMl = 200;
        int iceCreamCount = 2;
        int eggCount = 4;

        // общий вес каждого ингредиента
        int totalBananaWeight = bananaCount * bananaWeight;
        int totalMilkWeight = (milkMl / 100) * milkWeightPer100ml;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggWeight = eggCount * eggWeight;

        // рассчитываем общий вес в граммах
        int totalWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;

        // переводим в килограммы
        double totalWeightKg = totalWeightGrams / 1000.0;

        System.out.println("Общий вес спортзавтрака: " + totalWeightGrams + " грамм");
        System.out.println("Общий вес спортзавтрака: " + totalWeightKg + " килограмм");

        System.out.println("Задача 7");
        int targetWeightLossKg = 7;
        int targetWeightLossGrams = targetWeightLossKg * 1000;

        int minDailyLoss = 250; // Мин потеря в день
        int maxDailyLoss = 500; // Мак потеря в день

        // кол-во дней
        int daysMin = targetWeightLossGrams / minDailyLoss;
        int daysMax = targetWeightLossGrams / maxDailyLoss;
        int averageDays = (daysMin + daysMax) / 2;

        System.out.println("Минимальное количество дней: " + daysMax);
        System.out.println("Максимальное количество дней: " + daysMin);
        System.out.println("Среднее количество дней: " + averageDays);

        System.out.println("Задача 8");
        // дано
        double mashasSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double increaseRate = 1.1; // Повышение на 10%

        // новые зарплаты
        double newMashasSalary = mashasSalary * increaseRate;
        double newDenisSalary = denisSalary * increaseRate;
        double newKristinaSalary = kristinaSalary * increaseRate;

        // разница в годовом доходе
        double yearlyIncreaseMasha = (newMashasSalary - mashasSalary) * 12;
        double yearlyIncreaseDenis = (newDenisSalary - denisSalary) * 12;
        double yearlyIncreaseKristina = (newKristinaSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + (int)newMashasSalary + " рублей. Годовой доход вырос на " + (int)yearlyIncreaseMasha + " рублей.");
        System.out.println("Денис теперь получает " + (int)newDenisSalary + " рублей. Годовой доход вырос на " + (int)yearlyIncreaseDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (int)newKristinaSalary + " рублей. Годовой доход вырос на " + (int)yearlyIncreaseKristina + " рублей.");
    }

}