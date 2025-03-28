import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int prv = asteroids[0];

        for (int a : asteroids) {
            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (stack.peek() < -a) {
                    stack.pop(); 
                } else if (stack.peek() == -a) {
                    stack.pop();
                    a = 0; 
                } else {
                    a = 0; 
                }
            }

            if (a != 0) {
                stack.push(a);
                prv = a;
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
