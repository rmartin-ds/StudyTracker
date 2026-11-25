import java.time.LocalDate;
import java.util.ArrayList;

public class StudyTracker {
    public static void main(String[] args) {
        IO.println("Welcome to Study Tracker!\n");
        IO.println("This is a place where you can:");
        ArrayList<StudySession> studySessionsList = new ArrayList<>();

        while(true) {
            IO.println("1) Add a study session\n2) View study totals over the past 7 days\n3) Exit the program");
            String choice = IO.readln("\nEnter your choice: ");
            if(choice.equals("1")) {
                String courseName = IO.readln("Enter course name: ");
                LocalDate currentDate = LocalDate.now();
                int minutesStudied = Integer.parseInt(IO.readln("Enter minutes studied: "));
                StudySession session = new StudySession(courseName, currentDate, minutesStudied);
                studySessionsList.add(session);

                IO.println("You successfully added a new study session!");

            } else if(choice.equals("2")) {
                IO.println("You picked number 2\n");
            } else if(choice.equals("3")) {
                IO.println("Exiting the program...");
                break;
            } else {
                IO.println("Please pick 1, 2, or 3\n");
            }
        }
    }
}