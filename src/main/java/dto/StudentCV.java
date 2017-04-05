package dto;

/**
 * Created by Esther on 2016/9/2.
 */
public class StudentCV {
    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Cv cv;
    private Student student;
}
