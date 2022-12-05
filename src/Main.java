public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);

        System.out.println(" ");

        Car ladaGranta = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        Car kiaStortage = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaStortage);
        System.out.println(hyundaiAvante);
    }
}