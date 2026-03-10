Linked List in Data Structures

A Linked List is a linear data structure used to store a collection of elements.
Unlike arrays, elements are not stored in continuous memory locations.

Each element in a linked list is called a "node".

Each node contains two parts:
1. Data – the value stored in the node
2. Next – a reference (pointer) to the next node

Structure of a Node

[ Data | Next ]

Example:

10 → 20 → 30 → 40 → NULL

Here:
10 is the first node
20 is the second node
NULL means the end of the list

------------------------------------------------

Why Linked Lists are Used

Linked Lists solve some limitations of arrays.

Arrays:
• Fixed size
• Insertion and deletion are slow

Linked Lists:
• Dynamic size
• Easy insertion and deletion

------------------------------------------------

Types of Linked Lists

1. Singly Linked List
Each node points to the next node.

2. Doubly Linked List
Each node has two pointers:
Previous and Next.

3. Circular Linked List
The last node connects back to the first node.

------------------------------------------------

Common Operations

• Insertion
Add a node at the beginning, middle, or end.

• Deletion
Remove a node from the list.

• Traversal
Visit each node in the list.

• Searching
Find a value in the list.

------------------------------------------------

Time Complexity

Access element: O(n)
Insertion at beginning: O(1)
Insertion at end: O(n)
Deletion: O(n)

------------------------------------------------

Why Linked Lists are Important

Linked Lists are used to build other data structures such as:

• Stacks
• Queues
• Graph adjacency lists
