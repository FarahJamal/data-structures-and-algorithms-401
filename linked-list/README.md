# Singly Linked List
 * Todays code challenge invoved creating linked lists with nodes. A linked list is a collection of ordered values that are stored in node objects. Nodes are an object used to hold a single value and a pointerto the next node.Collaborated with Edward Hou, Cristian Robles, and James Mansour on this code challenge.

### Challenge
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
* Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
* Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
* Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
* Define a method called toString (or str in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"

### Approach & Efficiency
- I first made the node head, and then I pointed it to the next node, and then used a loop to connect the other nodes until it reached a null node. I then added the test for the head node and the other nodes.
API
+ Method - insert - takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance
+ Method - includes - takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value som+ewhere within the list
+ Method - toString - takes in no arguments and returns a string representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"


# class 06
Challenge Summary
This code challenge is about linked list insertions with three different methods. The three different mthods are .append(value), .insertBefore(value, newVal), and .insertAfter(value, newVal)

Challenge Description
Wrote three insertion methods for the linked list class that was set up om code challenge 5. The three methods being used are:

.append(value) which adds a new node with the given value to the end of the list
.insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node
Approach & Efficiency
Collaborated with Edward Hou and James Mansour for the white board and code challenge. First we drew out the white board how we were going to use these methods, and wrote out what each one was going to do and how it will work. The Big O space/time for this challenge was O(1) for the append method, space: O(1) and time: O(n) for insertBefore method, and space: O(1) and time: O(n) for for insertAfter method.

# insert before whiteboard:-
![](https://i.ibb.co/DGsnhTM/Whiteboard-6.png)

# append whiteboard:-
![](https://i.ibb.co/frhpxTZ/Whiteboard-4.png)

# insert after whiteboard:-
![](https://i.ibb.co/xC0x5LC/Whiteboard-5.png)


- [X] Top-level README “Table of Contents” is updated
- [X] README for this challenge is complete
  - [X] Summary, Description, Approach & Efficiency, Solution
  - [X] Picture of whiteboard
  - [X] Link to code
- [X] Feature tasks for this challenge are completed
- [X] Unit tests written and passing
  - [X] “Happy Path” - Expected outcome
  - [X] Expected failure
  - [X] Edge Case (if applicable/obvious)