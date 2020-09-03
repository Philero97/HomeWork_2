package ru.geekbrains.courses.java.HomeWork_5;

public class Main {

    public static void main(String[] args) {
        Worker [] persArray = new Worker[5];
        persArray [0] = new Worker ( " Кирилл О. А.", " Техник",
                " 312koa@test.ru", "+95257256525", 45, 43);
        persArray [1] = new Worker ("Семен З. Р.", "Тестер",
                "szr1985@test.ru", "+97773522552", 55, 25);
        persArray [2] = new Worker("Роза Е. Р.", " Секретарь",
                "rose14@test.ru", "+75553124268", 50, 44);
        persArray [3] = new Worker("Елизавета У. С.", " Медиа",
                "lizzzzzz@test.ru", "+98886522435", 55, 28);
        persArray [4] = new Worker(" Сергей Ю. М.", " Директор",
                "serzh@test.ru", "+96522584519", 74, 39);

        for (Worker worker : persArray) {
            if (40 < worker.getAge()){
                worker.printWorker();
                System.out.println("------------");
            }
        }
    }
}
