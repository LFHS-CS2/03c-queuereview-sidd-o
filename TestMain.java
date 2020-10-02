import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestMain.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.test_reverseHalf();
        test.test_isPalindrome();
    }

    @Test
    public void test_reverseHalf() {
        Queue<Integer> q = new LinkedList<Integer>();
        int[] nums = {1, 8, 7, 2, 9, 18, 12, 0};
        int[] answer = {1, 0, 7, 18, 9, 2, 12, 8};
        for (int i = 0; i < nums.length; i++)
            q.add(nums[i]);

        Main.reverseHalf(q);
        for (int i = 0; i < answer.length; i++) {
            assertEquals(answer[i], (int)q.remove());
        }
        assertTrue(q.isEmpty());
    }

    @Test
    public void test_isPalindrome() {
        Queue<Integer> q1 = new LinkedList<Integer>();
        int[] nums1 = {3, 8, 17, 9, 17, 8, 3};
        for (int i = 0; i < nums1.length; i++)
            q1.add(nums1[i]);

        assertTrue(Main.isPalindrome(q1));
        for (int i = 0; i < nums1.length; i++) {
            assertEquals(nums1[i], (int)q1.remove());
        }
        assertTrue(q1.isEmpty());

        Queue<Integer> q2 = new LinkedList<Integer>();
        int[] nums2 = {3, 8, 17, 9, 4, 17, 8, 3};
        for (int i = 0; i < nums1.length; i++)
            q2.add(nums2[i]);
        assertFalse(Main.isPalindrome(q2));

        for (int i = 0; i < nums2.length; i++) {
            assertEquals(nums2[i], (int)q2.remove());
        }
        assertTrue(q2.isEmpty());

        Queue<Integer> q3 = new LinkedList<Integer>();
        assertTrue(Main.isPalindrome(q3));
        int[] nums3 = {3, 8, 17, 17, 8, 3};
        for (int i = 0; i < nums3.length; i++)
            q3.add(nums3[i]);
        assertTrue(Main.isPalindrome(q3));
        for (int i = 0; i < nums3.length; i++) {
            assertEquals(nums3[i], (int)q3.remove());
        }
        assertTrue(q3.isEmpty());
    }

}
