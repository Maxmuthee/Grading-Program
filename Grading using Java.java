import java.util.Scanner;

public class GradeProgram {
    public static String getGrade(int score) {
        if (score >= 90 && score <= 100) return "A";
        else if (score >= 87 && score <= 89) return "A-";
        else if (score >= 84 && score <= 86) return "B+";
        else if (score >= 80 && score <= 83) return "B";
        else if (score >= 77 && score <= 79) return "B-";
        else if (score >= 74 && score <= 76) return "C+";
        else if (score >= 70 && score <= 73) return "C";
        else if (score >= 67 && score <= 69) return "C-";
        else if (score >= 64 && score <= 66) return "D+";
        else if (score >= 62 && score <= 63) return "D";
        else if (score >= 60 && score <= 61) return "D-";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        System.out.println("Your grade is: " + getGrade(score));
    }
}
s