
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Zach
 */

public class TestScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> studentIDs = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();
        int grade = 0;
        studentIDs.add(12345678);
        studentIDs.add(87654321);
        studentIDs.add(11122233);
        studentIDs.add(33322211);
        studentIDs.add(55555555);

        for (int i = 0; i < studentIDs.size(); i++) {
            try {
                grade = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter a score (0-100) for \nStudent ID: " + studentIDs.get(i)));
                if (grade > 100 || grade < 0) {
                    grade = 0;
                    throw new ScoreException();
                }
                studentGrades.add(grade);
            } catch (ScoreException error) {
                studentGrades.add(grade);
                JOptionPane.showMessageDialog(null, "Score can't be greater than 100.\nScore was set to 0.");
            }
        }
        for (int i = 0; i < studentIDs.size(); i++) {
            JOptionPane.showMessageDialog(null,
                    "Student ID: " + studentIDs.get(i) + "\nGrade: " + studentGrades.get(i));
        }

    }

}
