package euler;

import euler.problem1.Problem1;
import euler.problem10.Problem10;
import euler.problem11.Problem11;
import euler.problem2.Problem2;
import euler.problem3.Problem3;
import euler.problem4.Problem4;
import euler.problem5.Problem5;
import euler.problem6.Problem6;
import euler.problem7.Problem7;
import euler.problem8.Problem8;
import euler.problem9.Problem9;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static final String LINE_SEPERATOR = "********************";

    public static void main(String[] args) {
        List<IEulerProblem> problems = new ArrayList<>();
        problems.add(new Problem1());
        problems.add(new Problem2());
        problems.add(new Problem3());
        problems.add(new Problem4());
        problems.add(new Problem5());
        problems.add(new Problem6());
        problems.add(new Problem7());
        problems.add(new Problem8());
        problems.add(new Problem9());
        problems.add(new Problem10());
        problems.add(new Problem11());

        problems.parallelStream().forEach(IEulerProblem::run);
        problems.forEach(problem -> {
            System.out.println();
            System.out.println(LINE_SEPERATOR);
            System.out.println("SOLUTION TO " + (problem.getClass().getSimpleName().toUpperCase()) + ":");
            problem.printResult();
            System.out.println(LINE_SEPERATOR);
        });
    }


}
