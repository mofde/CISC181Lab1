package cisc181.lab_1;
//  Melissa Gatti Lab Section 040L
public class Lab1 {
    public static double areaScalene(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static boolean okCourses(int NumCredits, int NumCoreCourses) {
        if (NumCredits >= 12) {
            if (NumCredits > 19) {
                return false;
            } else if (NumCoreCourses == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static boolean shareDigit(int a, int b) {
        if (a/10 == b%10) {
            return true;
        }
        else if (b/10 == a%10) {
            return true;
        }
        else if (a/10 == b/10) {
            return true;
        }
        else if (a%10 == b%10) {
            return true;
        }
        else {
            return false;
        }
    }
    public static double cubicRoot(int a, int b, int c, int d, double A) {
        double B = 0.0;
        int i = 0;
        while (Math.abs(A - B) >= 0.0001) {
            if (i != 0) {
                A = B;
            }
            double f = a * A * A * A + b * A * A + c * A + d;
            double f_prime = 3 * a * A * A + 2 * b * A + c;
            B = A - f / f_prime;
            i = i + 1;
        }
        return B;
    }
    public static int score(int d1, int d2, int d3) {
        int scoreDice;
        if (d1 == d2 && d2 == d3) {
            scoreDice = 25;
        }
        else if (d1 == d2 || d2 == d3 || d1 == d3) {
            scoreDice = d1 + d2 + d3;
        }
        else {
            scoreDice = Math.max(Math.max(d1, d2), d3);
        }
        return scoreDice;
    }
    public static int scoreTurn() {
        int d1 = (int)(Math.random()*6)+1;
        int d2 = (int)(Math.random()*6)+1;
        int d3 = (int)(Math.random()*6)+1;
        int scoreDice = score(d1, d2, d3);
        int score = d1 + d2 + d3;
        return score;
    }
    public static double simulate(int NumRolls) {
        int score = 0;
        int total = 0;
        for (int i = 0; i < NumRolls; i++) {
            score = scoreTurn();
            total = total + score;
        }
        return total / NumRolls;
    }
    public static void main(String[] args) {
        System.out.println("Testing");
        System.out.println(areaScalene(5.5, 3.4, 8.7));
        System.out.println(simulate(100000));
    }
}