package nuigalway.app;

import java.util.ArrayList;

public class Module {
    // Initialising variables
    private String module_name;
    private String id;
    private ArrayList<Student> list_of_students = new ArrayList<Student>();
    private ArrayList <Course_Programme> associated_course = new ArrayList<Course_Programme>();

    public Module(String name, String id)
    {
        this.module_name = name;
        this.id = id;
    }

    public void addStudent(Student new_Student)
    {
        //Adding the student to the arraylist and adding the student's course to the list
        list_of_students.add(new_Student);
        addAssociated_course(new_Student.getCourse());
    }

    public void removeStudent(Student student)
    {//Removing the student from the arraylist
        list_of_students.remove(student);
    }


    public ArrayList get_students()
    {
        return list_of_students;
    }


    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList getAssociated_course() {
        return associated_course;
    }

    public void addAssociated_course(Course_Programme course) {
        if (!this.associated_course.contains(course))
        {
            this.associated_course.add(course);
        }
    }

    public void removeAssociated_courses(Course_Programme course)
    {
        if (this.associated_course.contains(course))
        {
            this.associated_course.remove(course);
        }
    }

}
