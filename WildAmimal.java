public abstract class WildAmimal extends Animal{
    private String place;
    private String date;

    protected WildAmimal(int height, int weight, String colorEye, String place, String date) {
        super(height, weight, colorEye);
        this.place = place;
        this.date = date;
    }
    
    @Override
    public abstract void sound();

    @Override
    public String toString() {
        return String.format("Место обитания: %s; Дата нахождения: %s", 
        this.place, this.date, super.toString());
    }
}