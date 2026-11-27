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
                String courseName = IO.readln("Enter course name: ").trim();

                // Ensures that the user enters something for the course name, so that blank names don't appear in the weekly total.
                while(courseName.isBlank()) {
                    IO.println("The course name cannot be blank.");
                    courseName = IO.readln("Enter course name: ").trim();
                }

                // Automatically grabs today's date to avoid formatting errors from manually doing it.
                LocalDate currentDate = LocalDate.now();

                // Makes sure that invalid times don't crash the program or affect any totals.
                int minutesStudied = 0;
                while(minutesStudied <= 0) {
                    try{
                        minutesStudied = Integer.parseInt(IO.readln("Enter minutes studied: "));
                        if(minutesStudied <= 0){
                            IO.println("Please enter a positive whole number.\n");
                        }
                    } catch(NumberFormatException e) {
                        IO.println("Please enter a positive whole number.\n");
                    }
                }

                StudySession session = new StudySession(courseName, currentDate, minutesStudied);
                studySessionsList.add(session);

                IO.println("\nYou successfully added a new study session!\n");

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