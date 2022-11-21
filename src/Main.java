public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        int user = 17;
        if (user < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        //задача 2
        System.out.println("Задача 2");
        int ageChild = 7;
        if (ageChild >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        int ageMan = 19;
        if (ageMan >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        int ageHuman = 24;
        if (ageHuman >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //задача 3
        System.out.println("Задача 3");
        int capacityTrain = 102;
        int capacitySittingPlace = 60;
        int capacityStandingPlace = capacityTrain - capacitySittingPlace;
        int sittingPlace = 60;
        if (sittingPlace >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
        }
        if (sittingPlace < 60) {
            System.out.println("Сидячие места в вагоне есть");
        }
        int standingPlace = 35;
        if (standingPlace < capacityStandingPlace) {
            System.out.println("Есть стоячее место в вагоне");
        }
        if (standingPlace >= capacityStandingPlace) {
            System.out.println("Cтоячих мест в вагоне нет");
        }
        int allPlaces = 102;
        if (allPlaces >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
        //домашнее задание 2, задача 1
        System.out.println("Домашнее задание 2, Задание 1");
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        //домашнее задание 2, задача 2
        System.out.println("Домашнее задание 2, Задание 2");
        int ageChild1 = 7;
        if (ageChild1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок ходит в школу");
        }
        int ageMan1 = 17;
        if (ageMan1 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек еще не закончил школу и не может отправляться в университет");
        }
        int ageHuman1 = 24;
        if (ageHuman1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек еще не окончил университет и ему еще рано искать первую работу");
        }
        //домашнее задание 2, задача 3
        System.out.println("Домашнее задание 2, Задача 3");
        int capacityTrain1 = 102;
        int capacitySittingPlace1 = 60;
        int capacityStandingPlace1 = capacityTrain1 - capacitySittingPlace1;
        int sittingPlace1 = 60;
        if (sittingPlace1 >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
        }
        else {
            System.out.println("Сидячие места в вагоне есть");
        }
        int standingPlace1 = 42;
        if (standingPlace1 < capacityStandingPlace1) {
            System.out.println("Есть стоячее место в вагоне");
        }
        else {
            System.out.println("Стоячих мест в вагоне нет");
        }
        int allPlaces1 = 102;
        if (allPlaces1 >= 102) {
            System.out.println("Вагон уже полностью забит");
        }
        else {
            System.out.println("Вагон еще не полностью забит");
        }

        //домашнее задание 3, задача 1
        System.out.println("Домашнее задание 3, Задание 1");
        int age2 = 3;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        int age3 = 7;
        if (age3 >= 7 && age3 <= 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        }
        int age4 = 20;
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        }
        int age5 = 25;
        if (age5 > 24 ) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить на работу");
        }
        //домашнее задание 3, задача 2
        System.out.println("Домашнее задание 3, Задание 2");
        int age6 = 4;
        if (age6 < 5 ) {
            System.out.println("Если ребенку " + age6 + " года, то он не может кататься на аттракционе");
        }
        int age7 = 6;
        if (age7 >= 5 && age7 < 14) {
            System.out.println("Если ребенку " + age7 + " лет, то он может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        int age8 = 14;
        if (age8 >= 14) {
            System.out.println("Если ребенку " + age8 + " лет, то он может кататься на аттракционе без сопровождения взрослого");
        }
        //домашнее задание 3, задача 3
        System.out.println("Домашнее задание 3, Задание 3");
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two && one > free) {
            System.out.println("Число " + one + " самое большее");
        }
        else {
            System.out.println("Число " + one + " не самое большое");
        }
        if (two > one && two > free) {
            System.out.println("Число " + two + " самое большее");
        }
        else {
            System.out.println("Число " + two + " не самое большое");
        }
        if (free > two && free > one) {
            System.out.println("Число " + free + " самое большее");
        }
        else {
            System.out.println("Число " + free + " не самое большое");
        }
    }
}