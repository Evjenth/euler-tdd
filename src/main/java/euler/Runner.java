package euler;

import euler.problem1.Problem1;
import euler.problem2.Problem2;
import euler.problem3.Problem3;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static final String LINE_SEPERATOR = "********************";

    public static void main(String[] args) {
        List<IEulerProblem> problems = new ArrayList<>();
        problems.add(new Problem1());
        problems.add(new Problem2());
        problems.add(new Problem3());

        problems.forEach((problem) -> {
            System.out.println("");
            System.out.println(LINE_SEPERATOR);
            System.out.println("Starting " + problem.getClass().getSimpleName());
            System.out.println("Result:");
            long start = System.currentTimeMillis();
            problem.run();
            long end = System.currentTimeMillis();
            System.out.println("problem took " + (end - start) + "ms to calculate");
            System.out.println(LINE_SEPERATOR);
        });
    }


}