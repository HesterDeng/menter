package dto;

/**
 * Created by Esther on 2016/9/2.
 */
public class TeacherCV {
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }

    private Teacher teacher;
    private Cv cv;
}
