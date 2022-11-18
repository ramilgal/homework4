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
    }
}