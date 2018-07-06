/**
 * @author Prabal Srivastava
 *
 */
package com.ph.ds.queue;
/**
 * Implementing a Queue
	A queue implements FIFO (first-in first-out) ordering. As in a line or queue at a ticket stand, items are
removed from the data structure in the same order that they are added.

It uses the operations:
• add(item): Add an item to the end of the list.
• remove ( ): Remove the first item in the list.
• peek ( ) : Return the top of the queue.
• is Empty ( ) : Return true if and only ifthe queue is empty.
A queue can also be implemented with a linked list. In fact, they are essentially the same thing, as long as
items are added and removed from opposite sides.


Data Structure
					Average cases 		| 		Worst cases
--------------------------------------------------------------------
				  | Insert |Delete| Search| Insert |Delete| Search
--------------------------------------------------------------------
Array/stack/queue |   O(1) | O(1) |  O(n) |  O(1)  | O(1) | O(n)
--------------------------------------------------------------------


	It is especially easy to mess up the updating of the first and last nodes in a queue. Be sure to double check
this.
	One place where queues are often used is in breadth-first search or in implementing a cache.
In breadth-first search, for example, we used a queue to store a list of the nodes that we need to process.
Each time we process a node, we add its adjacent nodes to the back of the queue. This allows us to process
nodes in the order in which they are viewed.
 
 */
