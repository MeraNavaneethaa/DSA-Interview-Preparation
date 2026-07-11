Arrays in Java (For DSA Beginners)

An array is one of the most basic and important data structures in programming.
It is used to store multiple values of the same data type in a single variable.

Instead of creating many separate variables, we can store all values inside one array.

Example without array:
int a = 10;
int b = 20;
int c = 30;

Example with array:
int[] numbers = {10, 20, 30};

Here the array "numbers" stores multiple integers together.

------------------------------------------------------------

Why Arrays are Important in DSA

Arrays are the foundation for many other data structures and algorithms.
Many problems in coding interviews start with arrays.

Arrays are used in:
• Searching algorithms
• Sorting algorithms
• Dynamic Programming
• Sliding Window problems
• Two Pointer techniques

Understanding arrays well makes learning DSA much easier.

------------------------------------------------------------

How Arrays Work

Arrays store elements in continuous memory locations.

Each element in the array has an index (position).

Index always starts from 0.

Example:

int[] arr = {5, 10, 15, 20};

Index positions:
arr[0] = 5
arr[1] = 10
arr[2] = 15
arr[3] = 20

To access an element we use its index.

Example:
System.out.println(arr[1]);

Output:
10

------------------------------------------------------------

How to Create an Array in Java

Method 1: Declare and initialize together

int[] arr = {1, 2, 3, 4, 5};

Method 2: Declare first and then assign values

int[] arr = new int[5];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;

------------------------------------------------------------

Traversing an Array

Traversing means visiting each element of the array.

Example:

int[] arr = {10, 20, 30, 40};

for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

This loop prints all elements in the array.

------------------------------------------------------------

Time Complexity of Array Operations

Accessing an element using index:
O(1)  (Very fast)

Searching an element:
O(n)

Insertion or deletion in the middle:
O(n)

------------------------------------------------------------

Advantages of Arrays

• Easy to use
• Fast access using index
• Stores large amount of data
• Efficient memory usage

------------------------------------------------------------

Disadvantages of Arrays

• Fixed size (cannot change size easily)
• Insertion and deletion can be slow
• Can store only same type of data

-------------------------------------------------------------

Examples of Array Problems in DSA

Some common beginner problems are:

• Find the maximum element in an array
• Reverse an array
• Two Sum problem
• Find duplicate elements
• Rotate an array
• Move zeros to the end

These problems help in understanding how arrays work in real coding interviews.

----------------------------------------------------------------------------------------------------------------------------------------

Conclusion

Arrays are the first and most important step in learning Data Structures and Algorithms.
Almost every programmer starts learning DSA with arrays.

Once you understand arrays well, it becomes easier to learn advanced topics like:
Linked Lists, Stacks, Queues, Trees, and Graphs.
