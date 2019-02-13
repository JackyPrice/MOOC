import java.util.ArrayList;

public class GradeDistribution {
    private int[] grades = new int[6];
    private int accepted;
    private int numOfScores;

    public GradeDistribution(ArrayList<Integer> scores) {
        this.numOfScores = scores.size();
        for (int score : scores) {
            if (score >= 50 && score <= 60) {
                this.grades[0]++;
                accepted++;
            } else if (score >= 45) {
                this.grades[1]++;
                accepted++;

            } else if (score >= 40) {
                this.grades[2]++;
                accepted++;

            } else if (score >= 35) {
                this.grades[3]++;
                accepted++;

            } else if (score >= 30) {
                this.grades[4]++;
                accepted++;
            } else {
                this.grades[5]++;
            }
        }
    }

    public double acceptancePercentage() {
                return 100 * (double) this.accepted / this.numOfScores;
    }

    public void toStar(int numOfStars) {

        for (int i = 0; i < numOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printGradeDistribution() {
        System.out.println("Grade Distribution:");

        System.out.print("5: ");
        toStar(this.grades[0]);

        System.out.print("4: ");
        toStar(this.grades[1]);

        System.out.print("3: ");
        toStar(this.grades[2]);

        System.out.print("2: ");
        toStar(this.grades[3]);

        System.out.print("1: ");
        toStar(this.grades[4]);

        System.out.print("0: ");
        toStar(this.grades[5]);
    }

    public void printAll(){
        printGradeDistribution();
        System.out.println("Acceptance Percentage:" + acceptancePercentage());
    }
}
