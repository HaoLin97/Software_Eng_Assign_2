package nuigalway.app;

public class Student {
    //Initialising variables
    private String name;
    private int age;
    private String date_of_birth;
    private double student_id;
    private Module module;
    private Course_Programme course;
    private String username;

    public Student(String name, int age, String dob, double id, Module module, Course_Programme course)
    {
        this.name = name;
        this.age = age;
        this.date_of_birth = dob;
        this.student_id = id;
        this.module = module;
        this.course = course;
        this.username = name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public double getStudent_id() {
        return student_id;
    }

    public void setStudent_id(double student_id) {
        this.student_id = student_id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Course_Programme getCourse() {
        return course;
    }

    public void setCourse(Course_Programme course) {
        this.course = course;
    }

    public String getUsername() {
        //Refreshes the username and returns the username
        this.username = name + student_id;
        return username;
    }
}
