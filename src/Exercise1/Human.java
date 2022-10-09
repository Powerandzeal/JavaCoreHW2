package Exercise1;

public class Human {
    public int dateOfBirth;
    public String name;
    public String currentCity;

    public String post;

    public Human(String name, String currentCity, int dateOfBirth, String post) {
        if (name==null){
            this.name = "information not specified";
        } else this.name = name;

        if (currentCity==null) {
            this.currentCity = "information not specified"; // проверка на наличие или отсутствие города
        } else this.currentCity = currentCity;


        if (dateOfBirth > 0) {
            this.dateOfBirth = dateOfBirth;                 // проверка на наличие или отсутсвие даты рождения
        } else this.dateOfBirth = Math.abs(dateOfBirth);

        this.post = post;

    }

    public void Welcome() {
        System.out.println("Hi! My name is " + name + " I from " + currentCity + " I was born in  " + dateOfBirth +
                " nice to meet you" + " My post is " + post);
    }

}
