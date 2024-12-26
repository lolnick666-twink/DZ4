package DZ4;

public abstract class Student {
    protected String name; protected String surname; protected String patronymic; protected String course;
    protected int lastExamMark; protected boolean Exam;
    public Student(String name, String surname, String patronymic, String course, int lastExamMark){
        this.name=name; this.surname=surname; this.patronymic=patronymic; this.course=course; this.lastExamMark=lastExamMark;}
    public abstract void writeExam();
}
