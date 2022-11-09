public class Main {
    public static void main(String[] args) {

        //task 1
        int bananas = 1000;
        byte apples = 100;
        short pineapples = 250;
        long height = 50000L;
        float weight = 80.5f;
        double secondWeight = 65.8;

        System.out.println("Значение переменной bananas с типом int равно " + bananas);
        System.out.println("Значение переменной apples с типом byte равно " + apples);
        System.out.println("Значение переменной pineapples с типом short равно " + pineapples);
        System.out.println("Значение переменной height с типом long равно " + height);
        System.out.println("Значение переменной weight с типом float равно " + weight);
        System.out.println("Значение переменной secondWeight с типом double равно " + secondWeight);

        //task 2
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        boolean d = false;
        short e = 569;
        short f = -159;
        int g = 27897;
        byte j = 67;

        //task 3
        double totalPaper = 480;
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        double paperPerStudent = totalPaper / (firstClass + secondClass + thirdClass);
        System.out.println(paperPerStudent);

        //task 4
        byte bottles = 16;
        byte time = 2;

        int minutes = 20;
        int minutesPerDay = 60 * 24;
        int minutesFor3Days = minutesPerDay * 3;
        int minutesForMonth = minutesPerDay * 30;

        int bottlesPerMinutes = minutes / time * bottles;
        int bottlesPerDay = minutesPerDay / time * bottles;
        int bottlesPer3Days = minutesFor3Days / time * bottles;
        int bottlesPerMonth = minutesForMonth / time * bottles;

        System.out.println("За 20 минут машина произвела бутылок " + bottlesPerMinutes + " штук.");
        System.out.println("За день машина произвела бутылок " + bottlesPerDay + " штук.");
        System.out.println("За три дня машина произвела бутылок " + bottlesPer3Days + " штук.");
        System.out.println("За месяц машина произвела бутылок " + bottlesPerMonth + " штук.");

        //task 5
        int totalTin = 120;
        int whiteForClass = 2;
        int brownForClass = 4;
        int classes;

        classes = totalTin / (whiteForClass + brownForClass);
        int whiteTin = classes * whiteForClass;
        int brownTin = classes * brownForClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteTin +
                " банок белой краски и " + brownTin + " банок коричневой краски.");

        //task 6
        byte bananas1 = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;

        byte bananasWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;

        double breakfastWeight = bananas1 * bananasWeight + milk * milkWeight + iceCream * iceCreamWeight +
                eggs * eggsWeight;
        double breakfastWeightInKG = breakfastWeight / 1000;

        System.out.println("Вес завтрака " + breakfastWeightInKG);

        //task 7
        short weightToLose = 7000;
        short weightLess = 250;
        short weightMore = 500;
        int weightMiddle = (weightLess + weightMore) / 2;

        int daysToLoseLess = weightToLose / weightLess;
        int daysToLoseMore = weightToLose / weightMore;
        int daysToLoseMiddle = weightToLose / weightMiddle;

        System.out.println("Дней для похуедения при потере в весе " + weightLess + " грамм в день " + daysToLoseLess);
        System.out.println("Дней для похуедения при потере в весе " + weightMore + " грамм в день " + daysToLoseMore);
        System.out.println("Дней для похуедения при потере в весе в среднем "  + daysToLoseMiddle);

        //task 8
        String masha = "Маша";
        String denis = "Денис";
        String kris = "Кристина";
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;

        float salaryIncrease = 1.1f;

        float mashaSalaryUp = mashaSalary * salaryIncrease;
        float denisSalaryUp = denisSalary * salaryIncrease;
        float krisSalaryUp = krisSalary * salaryIncrease;

        float mashaSalaryUpPerYear = (mashaSalary * salaryIncrease - mashaSalary) * 12;
        float denisSalaryUpPerYear = (denisSalary * salaryIncrease - denisSalary) * 12;
        float krisSalaryUpPerYear = (krisSalary * salaryIncrease - krisSalary) * 12;


        System.out.println(masha + " теперь получает " + mashaSalaryUp + " рублей. Годовой доход вырос на " + mashaSalaryUpPerYear + " рублей.");
        System.out.println(denis + " теперь получает " + denisSalaryUp + " рублей. Годовой доход вырос на " + denisSalaryUpPerYear + " рублей.");
        System.out.println(kris + " теперь получает " + krisSalaryUp + " рублей. Годовой доход вырос на " + krisSalaryUpPerYear + " рублей.");








    }
}
