import java.time.LocalDate;

public class StudySession {
    private String course;
    private LocalDate date;
    private int minutes;

    public StudySession(String course, LocalDate date, int minutes) {
        this.course = course;
        this.date = date;
        this.minutes = minutes;
    }

    public String getCourse() {
        return course;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getMinutes() {
        return minutes;
    }
}