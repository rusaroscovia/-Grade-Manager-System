public class Main {

    public static void main(String[] args) {

        GradeManager manager;

        try {

            manager = new GradeManager(5);

            manager.addGrade(80);
            manager.addGrade(95);
            manager.addGrade(60);


            manager.addGrade(150);

        } catch (InvalidGradeException e) {

            System.out.println("Custom Exception: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Illegal Argument: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Error: " + e.getMessage());

        } finally {

            System.out.println("Grade input process completed.");
        }


        GradeManager manager2 = new GradeManager(5);

        try {

            manager2.addGrade(88);
            manager2.addGrade(72);
            manager2.addGrade(91);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        manager2.displayGrades();

        manager2.sortGrades();
        manager2.displayGrades();

        System.out.println("Average grade: " + manager2.calculateAverage());
        System.out.println("Highest grade: " + manager2.getHighest());
        System.out.println("Lowest grade: " + manager2.getLowest());

        System.out.println("Search 72: " + manager2.searchGrade(72));
        System.out.println("Search 50: " + manager2.searchGrade(50));
    }
}