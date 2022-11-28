public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){

        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {

        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        var sum_num = 4;
        System.out.println(sum_num);

        dog = dog + sum_num;
        cat = cat + sum_num;
        paper = paper + sum_num;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task3() {

        System.out.println("Задача 3");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var decrease_dogNum = 3.5;
        System.out.println(decrease_dogNum);

        var decrease_dags = dog - decrease_dogNum;
        System.out.println(decrease_dags);

        var decrease_catNym = 1.6;
        System.out.println(decrease_catNym);

        var decrease_cats = cat - decrease_catNym;
        System.out.println(decrease_cats);

        var decrease_paperNum = 7639;
        System.out.println(decrease_paperNum);

        var decrease_papers = paper - decrease_paperNum;
        System.out.println(decrease_papers);

    }
    public static void task4() {

        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);

        var magnification_num = 2;
        System.out.println(magnification_num);

        friend = friend + magnification_num;
        System.out.println(friend);

        var divide_num = 7;
        System.out.println(divide_num);

        friend = friend / divide_num;
        System.out.println(friend);

    }
    public static void task5() {

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);

        var multiply_num = 10;
        System.out.println(multiply_num);

        frog = frog * multiply_num ;
        System.out.println(frog);

        var divide_num = 3.5;
        System.out.println(divide_num);

        frog = frog / divide_num;
        System.out.println(frog);

        var sum_num = 4;
        System.out.println(sum_num);

        frog = frog + sum_num;
        System.out.println(frog);

    }

    public static void task6() {

        System.out.println("Задача 6");

        var weightOneBoxer = 72.2;
        var weightTwoBoxer = 82.7;

        var sumWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Oбщий вес двух бойцов " + sumWeight + " кг.");

        var differenceWeight = weightTwoBoxer - weightOneBoxer;
        System.out.println("Pазницу между весами бойцов " + differenceWeight +  " кг.");

    }
    public static void task7() {

        System.out.println("Задача 7");

        var weightOneBoxer = 72.2;
        var weightTwoBoxer = 82.7;

        var differenceWeight = weightTwoBoxer - weightOneBoxer;
        System.out.println("Pазницу между весами бойцов " + differenceWeight +  " кг.");

        var divisionRemainder = weightOneBoxer % weightTwoBoxer;
        System.out.println("Oстаток от деления " + divisionRemainder );



    }
    public static void task8() {

        System.out.println("Задача 8");

        var allTime = 640;
        var workTime = 8;
        var worker = allTime / workTime;
        System.out.println("Всего работников в компании —" + worker + " человек");

        var workers = 94;

        var allWorkers = worker + workers;
        var time = allTime / allWorkers;

        System.out.println("Если в компании работает " + allWorkers + " человек, то всего " + time + " часов работы может");




    }
}