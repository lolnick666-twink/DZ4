package DZ4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main extends Object{
    public static void main(String[] args){
        IUStudent student1=new IUStudent("Kuntuganov", "Arslanbek", "()", "Nachert", 5);
        IUStudent student2=new IUStudent("Anton", "Anikeev", "Alexandrovich", "Matan", 5);
        MathStudent student3=new MathStudent("Kirill", "Sachkov", "Olegovich", "Nachert", 5);
        MathStudent student4=new MathStudent("Kirill", "Nikolaev", "()", "Nachert", 5);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1); studentList.add(student2); studentList.add(student3); studentList.add(student4);
        for(Student s:studentList){System.out.println(s); if(Objects.equals(s.course, "Nachert")){s.writeExam();}}
    }
}