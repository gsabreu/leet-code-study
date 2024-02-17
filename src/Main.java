import problems.leetcode.array.MaxProfit;
import problems.leetcode.array.StrictlyIncrease;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static StrictlyIncrease strictlyIncrease;

    public static void main(String[] args) {
        strictlyIncrease = new StrictlyIncrease();
        int[] case1 = new int[] {2,3,1,2};
        strictlyIncrease.canBeIncreasing(case1);
    }


}