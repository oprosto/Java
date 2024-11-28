import java.util.List;
import java.util.Vector;

public class Students
{
    Vector<Student> students = new Vector<>();

    Students()
    {
        init();
    }

    private void init()
    {
        students.add(new Student("Student1", 17, 1, 2, 2, 5));
        students.add(new Student("Student2", 27, 2, 4, 3, 5));
        students.add(new Student("Student3", 37, 3, 4, 5, 2));
        students.add(new Student("Student4", 47, 4, 4, 3, 5));
        students.add(new Student("Student5", 57, 5, 4, 4, 4));
    }
    public void nextYear()
    {
        for(Student student : students)
        {
            int sum = 0;
            for (int mark : student.marks.values())
                sum += mark;
            float AVGBall = (float)sum / student.marks.size();
            if (AVGBall < 3)
                students.remove(student);
            else
                student.yearOfStudy++;
        }
    }
    public void printStudents(List<Student> students, int course)
    {
        for (Student student : students)
        {
            if (student.yearOfStudy == course)
                System.out.println(student.name);
        }

    }
}
