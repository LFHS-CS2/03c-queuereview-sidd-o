import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args)  {
        TestMain test = new TestMain();
        test.main(null);
    }

    /**
     * See Readme.md
     * IMPORTANT: You may use only a single Stack as auxiliary storage. 
     *            No size() method is available.
     */
    public static void reverseHalf(Queue<Integer> q) 
    {
			q.add(null);
			Stack stk = new Stack();
			boolean temp = false;
			while(!q.isEmpty()){
				if(q.peek() == null){
					q.remove();
					break;
				}
				if(temp){
					stk.push(q.remove());
				}else{
					q.offer(q.remove());
				}
				temp = !temp;
			}
			while(!stk.isEmpty()){
				q.add((int) q.remove());
				q.add((int) stk.pop());
			}
    }
    
    /**
     * See Readme.md
     * IMPORTANT: You may use only a single Stack as auxiliary storage. 
     *            No size() method is available.
     */
    public static boolean isPalindrome(Queue<Integer> q) 
    {
			boolean ans = true;
			q.add(null);
			Stack stk = new Stack();
			while(!q.isEmpty()){

				if(q.peek() == null){
					q.remove();
					break;
				}else{
					int temp23 = q.remove();
					stk.push(temp23);
					q.offer(temp23);
				}
			}
				q.add(null);
				while(!stk.isEmpty()){
					int temp1 = q.remove();
					int temp2 = (int) stk.pop();
					q.add(temp1);
				if(temp1 != temp2){
					ans = false;
				}
			}
			q.remove();


        return ans;
    }

}
