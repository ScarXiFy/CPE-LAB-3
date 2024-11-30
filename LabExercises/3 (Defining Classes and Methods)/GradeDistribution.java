package laboratoryExercises;
   
    public class GradeDistribution {

        // Private fields to store grades
        private int A;
        private int B;
        private int C;
        private int D;
        private int F;

    /**
     * 
     * @param gradeA The number of Grade A's.
     * @param gradeB The number of Grade B's.
     * @param gradeC The number of Grade C's.
     * @param gradeD The number of Grade D's.
     * @param gradeF The number of Grade F's.
     * 
     * Precondition: gradeA, gradeB, gradeC, gradeD, and gradeF are non-negative integers.
     * Postcondition: The number of grades for each letter grade is set.
     */    

    public void setGrades(int gradeA, int gradeB, int gradeC, int gradeD, int gradeF) {
        A = gradeA;
        B = gradeB;
        C = gradeC;
        D = gradeD;
        F = gradeF;
    }

    /**
     * Gets the number of grades for each letter grade.
     *
     * @return An array containing the number of grades for each letter grade (A, B, C, D, F).
     */

    public int[] getGrades() {
        return new int[]{A, B, C, D, F};
    }

     /**
     * Calculates the total number of grades.
     *
     * @return The total number of grades.
     */

    public int getTotalGrades() {
        return A + B + C + D + F;
    }

    /**
     * Calculates the percentage of a given letter grade.
     *
     * @param grade The letter grade (A, B, C, D, or F).
     * @return The percentage of the given letter grade.
     *
     * Precondition: grade is a valid letter grade (A, B, C, D, or F).
     * Postcondition: The percentage of the given letter grade is calculated.
     */

    public double getPercentage(char grade) {
        // Precondition check
        if (grade < 'A' || grade > 'F') {
            System.out.println("Invalid Grade!\n");
        }
        switch (grade) {
            case 'A':
                return ((double) A / getTotalGrades() * 100);
            case 'B':
                return ((double) B / getTotalGrades() * 100);
            case 'C':
                return ((double) C / getTotalGrades() * 100);
            case 'D':
                return ((double) D / getTotalGrades() * 100);
            case 'F':
                return ((double) F / getTotalGrades() * 100);
            default:
                return 0;
        }
    }

    /**
     * Displays a graphical representation of the grade distribution.
     */

    public void displayGraph() {
        int barWidth = 50;

        System.out.println("0  10  20  30  40  50  60  70  80  90  100%");
        System.out.println("|  |  |  |  |  |  |  |  |  |  |");
        System.out.println("****************************************************");

        for (char grade = 'A'; grade <= 'F'; grade++) {
            double percentage = getPercentage(grade);
            int numAsterisks = Math.round((float) percentage / 2);

            if (grade == 'E') {
                continue;
            }

            // for loop implementation for the number of asterisks
            for (int i = 0; i < barWidth; i++) {
                if (i < numAsterisks) {
                    System.out.print("*");
                }
            }

            // Displays the Grade and Percentage
            System.out.print(" " + grade + " - " + percentage + "%");
            System.out.println();

        }
    }
}