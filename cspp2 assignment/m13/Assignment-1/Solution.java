import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    //your code goes here...
    private int[] set;
    //Good luck :-)
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    /**
     * Constructs the object.
     */
    private Solution() {
    	set = new int[25];
    	size = 0;
    }
    /**
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
    	return size;
    }

    /**
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(int item) {
    	if(size==set.length){
            resize();
        }
        set[size++] = item;
    }
        
    
    private void resize() {
    	set = Arrays.copyOf(set, 2 * size);
    }
    /**
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int contains(int item) {
    	for (int i=0;i<size;i++) {
    		if (set[i].equals(item)) {
    			return true;
    		}
    		return false;
    	}
    }

    public String toString() {
    	if (size == 0) {
    		return "{}";
    	}
    	String str = "{";
    	int i = 0;
    	for (i = 0; i < size - 1; i++) {
    		set[i] = item;
    		str += set[i] + ",";
    	}
    	str += set[size - 1] + "}";
    	return str;
    }

    public int get(int index) {
		if (index >= 0 || index < size) {
			return set[index];
		} else {
			System.out.println("Invalid Position Exception");
			return 0;
		}
	}

    /**
     * { function_description }
     *
     * @param      items  The items
     */
    public void add(int[] newArray) {
    	Set tempset = new Set();
    	for (int i = 0; i < size; i++) {
    		for (int j = 0;j< i.size;j++) {
    			add(set[i]);
    		}
    	}
    }

    /**
     * { function_description }
     *
     * @return     { returns_set_of_contained_elements_value }
     */
    public  Set intersection(int[]) {
    	for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < set.length; j++) {
                if (items[i].equals(get(j))) {
                    add(j);
                }
            }
        }
        return j;
    }

    /**
     * { function_retains elements }
     *
     * @param      items  The items
     *
     * @return     { return_elements }
     */
    public Set retainAll(int[] items) {
    	for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < set.length; j++) {
                if (items[i].equals(get(j))) {
                    add(j);
                }
            }
        }
        return j;
    }

    public Set cartesianProduct(int[][] items) {
    	return null;
    }

    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
