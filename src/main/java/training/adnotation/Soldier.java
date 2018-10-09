package training.adnotation;


@Information(
        author = "Awesome programmer",
        date = "2015-09-09",
        description = "Base class")
public class Soldier {

    @Information(
            author = "Awesome programmer",
            date = "2015-09-09",
            description = "Actual grade")
    private String grade;
    private String division;
    private String name;

    @Information(
            author = "Good writer",
            date = "2017-12-29",
            description = "Default constructor with initialization")
    public Soldier() {
        grade = "private";
        division = "NN";
        name = "NN";
    }

    @Deprecated
    @SuppressWarnings(value = "uncheced")
    public Soldier(String grade, String division, String name) {
        this.grade = grade;
        this.division = division;
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDivision() {
        return division;
    }

    @Information(
            author = "Good writer",
            date = "2017-12-29",
            description = "added as needed")
    public void setDivision(String division) {
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println("ATTACK !!!!!!");
    }

    public void confirmOrder(String order){
        System.out.println("ROGER " + order);
    }
}
