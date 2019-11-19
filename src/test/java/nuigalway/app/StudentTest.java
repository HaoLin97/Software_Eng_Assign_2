package nuigalway.app;

import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.mock;

public class StudentTest {

    @Test
    public void TestJunit_1_getters()
    {
        String name = "Hao Lin";
        int age = 22;
        String dob = "13-10-1997";
        double id = 16361486;
        Module module = mock(Module.class);
        Course_Programme course = mock(Course_Programme.class);
        Student uut = new Student(name, age, dob, id, module, course);

        Assert.assertEquals(uut.getName(), name);
        Assert.assertEquals(uut.getAge(), age);
        Assert.assertEquals(uut.getDate_of_birth(), dob);
        Assert.assertEquals(uut.getCourse(), course);
        Assert.assertEquals(uut.getModule(), module);
        Assert.assertEquals(Double.toString(uut.getStudent_id()), Double.toString(id));
        Assert.assertEquals(uut.getUsername(), name+id);
    }

    @Test
    public void TestJunit_2_setters()
    {
        String name = "Hao Lin";
        int age = 22;
        String dob = "13-10-1997";
        double id = 16361486;
        Module module = mock(Module.class);
        Course_Programme course = mock(Course_Programme.class);

        Student uut = new Student(name, age, dob, id, module, course);

        String name_2 = "Lin Hao";
        int age_2 = 2;
        String dob_2 = "13-01-1997";
        double id_2 = 100100100;
        Module module_2 = mock(Module.class);
        Course_Programme course_2 = mock(Course_Programme.class);

        uut.setName(name_2);
        uut.setAge(age_2);
        uut.setCourse(course_2);
        uut.setDate_of_birth(dob_2);
        uut.setModule(module_2);
        uut.setStudent_id(id_2);

        Assert.assertEquals(uut.getName(), name_2);
        Assert.assertEquals(uut.getAge(), age_2);
        Assert.assertEquals(uut.getDate_of_birth(), dob_2);
        Assert.assertEquals(uut.getCourse(), course_2);
        Assert.assertEquals(uut.getModule(), module_2);
        Assert.assertEquals(Double.toString(uut.getStudent_id()), Double.toString(id_2));
        Assert.assertEquals(uut.getUsername(), name_2+id_2);
    }
}