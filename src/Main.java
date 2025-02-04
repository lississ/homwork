public class Main {
    public static void main(String[] args) {
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
        var totalWeight = (massOne+ massTwo);
        System.out.println(totalWeight);
        var difference = massTwo - massOne;
        System.out.println("Разница между массами бойцов " + difference);

        System.out.println("Задача 7");
        var remains = massTwo % massOne;
        System.out.println("Остаток от деления между двумя весами составляет" +remains);

        System.out.println("Задача 8");
        var hours = 640;
        var workingHours = 8;
        var workers = hours / workingHours;
        System.out.println("Всего раотников в компании - " + workers);

        workers = workers + 94;
        workingHours = hours / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workingHours + " часов работы может быть поделено между сотрудниками");

    }
}