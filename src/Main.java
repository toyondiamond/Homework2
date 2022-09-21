public class Main {
    public static void main(String[] args) {
        //задача1
        var dog = 8.0;
        double cat = 3.6;
        int paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача2
        dog = dog + 4;
        cat = cat +4;
        paper = paper +4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //задача5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        //задача6
        var boxerWeight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxerWeight + boxer2Weight;
        System.out.println("Общий вес двух бойцов " + totalWeight);

        var overWeight = boxer2Weight % boxerWeight;
        System.out.println( "Разница между весами бойцов составляет " + overWeight + " кг" );

        //Задача7
        var differenceWeight1 = boxer2Weight - boxerWeight;
        var differenceWeight2 = boxer2Weight % boxerWeight;
        System.out.println ("Разница в весе составляет " + differenceWeight1 + " кг");
        System.out.println("Разница в весе составляет " + differenceWeight2 + " кг");

        //Задача8
         var totalWorkHours = 640;
         var amountOfAllStuff = totalWorkHours / 8;
        System.out.println ("Всего работников в компании - " + amountOfAllStuff+ " человек");
        var newAmountOfAllStuff = amountOfAllStuff + 94;
        System.out.println ("В компании работает " + newAmountOfAllStuff + " человека");
        var totalWorkHours2 = newAmountOfAllStuff * 8;
        System.out.println ( "Если в компании работает " + newAmountOfAllStuff + " человек, то всего " + totalWorkHours2 + " часов работы может быть поделено между сотрудниками");




    }
}