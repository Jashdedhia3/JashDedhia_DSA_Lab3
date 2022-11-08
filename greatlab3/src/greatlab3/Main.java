package greatlab3;

import greatlab3q1.Q1;
import greatlab3q2.Q2;

public class Main {
	
	 public static void main(String[] args) {
	        String test1 = "( [ [ { } ] ] )";
	        String test2 = "( [ [ { } ] ] ) )";
	        new Q1(test1);
	        new Q1(test2);

	        //first element is root
	        int[] data = {40, 20, 30, 10, 60, 50, 70};
	        int targetSum = 130;
	        new Q2(data, targetSum);


	    }

}
