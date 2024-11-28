import java.util.HashMap;

public class Student
{
    public String name;
    public Integer group;
    public Integer yearOfStudy;
    public HashMap<String, Integer> marks;

    Student()
    {
        name = null;
        group = -1;
        yearOfStudy = -1;
        marks = new HashMap<String, Integer>(3);
        marks.put("Math", -1);
        marks.put("MathLogic", -1);
        marks.put("Informatica", -1);
    }
    Student(String _name, Integer _group, Integer _yearOfStudy, HashMap<String, Integer> _marks)
    {
        name = _name;
        group = _group;
        yearOfStudy = _yearOfStudy;
        marks = _marks;
    }
    Student(String _name, Integer _group, Integer _yearOfStudy, Integer _MMark, Integer _MLMark, Integer _IMark)
    {
        name = _name;
        group = _group;
        yearOfStudy = _yearOfStudy;
        marks = new HashMap<String, Integer>(3);
        marks.put("Math", _MMark);
        marks.put("MathLogic", _MLMark);
        marks.put("Informatica", _IMark);
    }
}
