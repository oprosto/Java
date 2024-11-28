public class main
{
    public static void main(String[] args)
    {
        Students a = new Students();
        a.printStudents(a.students.stream().toList(), 3);
        a.nextYear();
        a.printStudents(a.students.stream().toList(), 3);
    }
}
