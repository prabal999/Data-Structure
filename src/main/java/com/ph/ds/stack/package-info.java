/**
 * @author Prabal Srivastava
 *
 */
package com.ph.ds.stack;

/**
 * Implementing a Stack
	The stack data structure is precisely what it sounds like: a stack of data. In certain types of problems, it can
be favorable to store data in a stack rather than in an array.
A stack uses LIFO (last-in first-out) ordering. That is, as in a stack of dinner plates, the most recent item
added to the stack is the first item to be removed.

It uses the following operations:
• pop ( ) : Remove the top item from the stack.
• push (X item): Add an item to the top of the stack.
• peek ( ) : Return the top of the stack.
• is Empty ( ) : Return true if and only if the stack is empty.

	Unlike an array, a stack does not offer constant-time access to the ith item. However, it does allow constanttime
adds and removes, as it doesn't require shifting elements around.
We have provided simple sample code to implement a stack. Note that a stack can also be implemented
using a linked list, if items were added and removed from the same side.


Data Structure
					Average cases 		| 		Worst cases
--------------------------------------------------------------------
				  | Insert |Delete| Search| Insert |Delete| Search
--------------------------------------------------------------------
Array/stack/queue |   O(1) | O(1) |  O(n) |  O(1)  | O(1) | O(n)
--------------------------------------------------------------------
 
	One case where stacks are often useful is in certain recursive algorithms. Sometimes you need to push
temporary data onto a stack as you recurse, but then remove them as you backtrack (for example, because
the recursive check failed). A stack offers an intuitive way to do this.
A stack can also be used to implement a recursive algorithm iteratively. (This is a good exercise! Take a
simple recursive algorithm and implement it iteratively.)
 */
