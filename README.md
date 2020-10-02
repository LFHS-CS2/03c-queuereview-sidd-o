1. Write a method ```reverseHalf``` that reverses the order of half of the elements of a Queue of integers. 

   Your method should reverse the order of all the elements in odd-numbered positions (position 1, 3, 5, etc.) assuming that the first value in the queue has position 0. 

   For example, if the queue originally stores this sequence of numbers when the method is called:

   index: 0  1  2  3  4  5   6   7

   front [1, 8, 7, 2, 9, 18, 12, 0] back

   - it should store the following values after the method finishes executing:

   index: 0  1  2  3   4  5  6   7

   front [1, 0, 7, 18, 9, 2, 12, 8] back

   Notice that numbers in even positions (positions 0, 2, 4, 6) have not moved. 

   That sub-sequence of numbers is still: (1, 7, 9, 12). 

   But notice that the numbers in odd positions (positions 1, 3, 5, 7) are now in reverse order relative to the original. 

   In other words, the original sub-sequence: (8, 2, 18, 0) - has become: (0, 18, 2, 8).

   IMPORTANT:  You may use one stack as auxiliary storage to solve this problem. 

   CHALLENGE:  Can you do it without any ```int``` variables?

   IMPORTANT:  Use only the following methods from Java's API:
            There is no size() method available.
   Queue: add (enqueue),  remove (dequeue), peek, isEmpty

   Stack:  pop, push, isEmpty, peek

2. Write a method ```isPalindrome``` that takes a queue of integers as a parameter and returns true if the numbers in the queue represent a palindrome (and false otherwise). 

   A sequence of numbers is considered a palindrome if it is the same in reverse order. For example, suppose a queue called q stores these values:

   front [3, 8, 17, 9, 17, 8, 3] back

   Then the call of isPalindrome(q); should return true because this sequence is the same in reverse order. If the queue had instead stored these values:

   front [3, 8, 17, 9, 4, 17, 8, 3] back

   The call on isPalindrome would instead return false because this sequence is not the same in reverse order (the 9 and 4 in the middle don't match). 
   The empty queue should be considered a palindrome. 
   You may not make any assumptions about how many elements are in the queue and your method must restore the queue so that it stores the same sequence of values after the call as it did before. 


   IMPORTANT:  You may use one stack as auxiliary storage to solve this problem. 

   IMPORTANT:  Use only the following methods from Java's API:
            There is no size() method available.
   Queue: add (enqueue),  remove (dequeue), peek, isEmpty

   Stack:  pop, push, isEmpty, peek
