import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
    allAnimal.add(new Cat("Беляш", "Дворовая благородная", "Есть", "Белый", "20 апреля 2018", 25, 8, "Желтые", "да"));
    allAnimal.add(new Tiger(1800, 65, "зеленые", "Азия", "12 декабря 1997"));
    allAnimal.add(new Dog("Грета", "Цверг-шнауцер", "Есть", "Черная", "24 мая 2022", 25, 6, "Карие", "Да"));
    allAnimal.add(new Wolf(70, 50, "Голубые", "Березинский заповедник", "11 февраля 2019", "Да"));
    allAnimal.add(new Chicken(30, 2, "Желтые", 2));
    allAnimal.add(new Stork(50, 7, "Желтые", 25));
    }

    public int size(){
        return allAnimal.size();
    }





    public void addCat(Scanner input){
        String name;
        String breed;
        String vaccination;
        String color;
        String dateBirthday;
        int height;
        int weight;
        String colorEye;
        String wool;

        System.out.print("Кличка: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Прививки есть?: ");
        vaccination = input.next();
        System.out.print("Введите цвет шерсти: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();

        Zoo.allAnimal.add(new Cat(name, breed, vaccination, color, dateBirthday, height, weight, colorEye, wool));
    }

    public void addDog(Scanner input){
        String name;
        String breed;
        String vaccination;
        String color;
        String dateBirthday;
        int height;
        int weight;
        String colorEye;
        String training;

        System.out.print("Кличка: ");
        name = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print("Прививки есть?: ");
        vaccination = input.next();
        System.out.print("Введите цвет шерсти: ");
        color = input.next();
        System.out.print("Дата рождения: ");
        dateBirthday = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Дрессирован?: ");
        training = input.next();

        allAnimal.add(new Dog(name, breed, vaccination, color, dateBirthday, height, weight, colorEye, training));
    }

    public void addTiger(Scanner input){
        int height;
        int weight;
        String colorEye;
        String place;
        String date;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата обнаружения: ");
        date = input.next();

        allAnimal.add(new Tiger(height, weight, colorEye, place, date));
    }

    public void addWolf(Scanner input){
        int height;
        int weight;
        String colorEye;
        String place;
        String date;
        String leader;

        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Место обитания: ");
        place = input.next();
        System.out.print("Дата нахождения: ");
        date = input.next();
        System.out.print("Вожак стаи?: ");
        leader = input.next();

        allAnimal.add(new Wolf(height, weight, colorEye, place, date, leader));
    }

    public void addChicken(Scanner input){
        int height;
        int weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Chicken(height, weight, colorEye, hightFly));
    }

    public void addStork(Scanner input){
        int height;
        int weight;
        String colorEye;
        int hightFly;


        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз: ");
        colorEye = input.next();
        System.out.print("Высота полета: ");
        hightFly = input.nextInt();

        allAnimal.add(new Stork(height, weight, colorEye, hightFly));
    }

    void showAll(){
        int index = 0;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", index);
            System.out.println(animal);
            System.out.println();
            index++;
        }
    }

    void removeAnimal(int num){
        allAnimal.remove(num);
    }

    void showAnimal(int num){
       System.out.println(allAnimal.get(num));
       if (allAnimal.get(num) instanceof Home){
        ((Home)allAnimal.get(num)).caress();
       }
       if (allAnimal.get(num) instanceof BirdFly){
        ((BirdFly)allAnimal.get(num)).toFly();
       }  
    }

    void sound(int num) {
        allAnimal.get(num).sound();
    }

    void sayAllAnimals(){
        for (Animal animal : allAnimal) {
            animal.sound();
        }
    }
    
}
