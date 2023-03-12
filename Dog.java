public class Dog extends HomeAnimal {
    private final String training;

    protected Dog(String name, String breed, String vaccination, String color, String dateBirthday, int height,
            int weight, String colorEye, String training) {
        super(name, breed, vaccination, color, dateBirthday, height, weight, colorEye);
        this.training = training;

    }

    @Override
    public void sound() {
        System.out.println("Гав-гав");

    }

    public void doTraining(){
        System.out.println("Дрессировка");
    }

    @Override
    public String toString() {
        return String.format("Собака; %s; Дресировка: %s", super.toString(), this.training);
       }

    @Override
    public void caress() {
        System.out.println("Виляет хвостом");
    }
}