import java.util.Arrays;
import java.util.Stack;

public class project5 {
    void bubbleSort(int [] array){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int size = array.length;
        int i,j,tmp;

        for (int single : array){
            stack1.push(single);
        }

        for (i = 0; i < size - 1; i++) {
            stack2.push(stack1.pop());

            for (j = 0; j < (size - i - 1); j++) {
                while (!stack1.isEmpty()) {
                    if (stack1.peek() > stack2.peek()) {
                        stack2.push(stack1.pop());
                    } else {
                        int temp = stack2.pop();
                        stack2.push(stack1.pop());
                        stack2.push(temp);
                    }
                }
            }
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        int n = 0;
        while(!stack1.isEmpty()){
            array[n] = stack1.pop();
            n = n + 1;
        }
    }

    public static void main(String[] args) {
        int [] array = {7, 2, 12, 8, 5};
        project5 sort = new project5();
        sort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
