import java.util.Arrays;

public class GradeManager {

    private int[] grades;
    private int count;

    public GradeManager(int size) {

        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }

        grades = new int[size];
        count = 0;
    }


    public void addGrade(int grade) throws InvalidGradeException {

        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100.");
        }

        if (count >= grades.length) {
            throw new ArrayIndexOutOfBoundsException("Grade list is full.");
        }

        grades[count++] = grade;
        System.out.println("Grade added: " + grade);
    }


    public void sortGrades() {
        Arrays.sort(grades, 0, count);
        System.out.println("Grades sorted.");
    }


    public boolean searchGrade(int value) {

        for (int i = 0; i < count; i++) {
            if (grades[i] == value) {
                return true;
            }
        }
        return false;
    }

    public double calculateAverage() {

        if (count == 0) return 0;

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }

        return (double) sum / count;
    }


    public int getHighest() {

        if (count == 0) return -1;

        int max = grades[0];

        for (int i = 1; i < count; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        return max;
    }


    public int getLowest() {

        if (count == 0) return -1;

        int min = grades[0];

        for (int i = 1; i < count; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        return min;
    }


    public void displayGrades() {

        if (count == 0) {
            System.out.println("No grades recorded.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }

        System.out.println();
    }
}