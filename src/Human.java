import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > LocalDate.now().getYear()) {
            this.yearOfBirth = LocalDate.now().getYear();
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null || name.isEmpty()) {
            this.name = "неизвестно";
        } else {
            this.name = name;
        }

        if (town == null || town.isEmpty()) {
            this.town = "неизвестно";
        } else {
            this.town = town;
        }

        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "неизвестно";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Мне " + (LocalDate.now().getYear() - yearOfBirth) +
                ". Я работаю на должности " + jobTitle +
                ".";
    }
}
