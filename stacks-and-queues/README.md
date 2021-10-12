# stack-and-queue
# Challenge Summary
Implement a Queue using two Stacks.
## Whiteboard Process
![](https://i.ibb.co/8xyzhCY/Whiteboard-5.png)
## Approach & Efficiency

Create a new class called pseudo queue.

- Do not use an existing Queue.
- Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),
- Internally, utilize 2 Stack instances to create and manage the queue
    
- Methods:
     - enqueue
            - Arguments: value
            - Inserts value into the PseudoQueue, using a first-in, first-out approach.
      
     - dequeue
            - Arguments: none
            - Extracts a value from the PseudoQueue, using a first-in, first-out approach.h
# stack-and-queue
# Challenge Summary
First-in, First out Animal Shelter.
## Whiteboard Process
![](https://i.ibb.co/FJ5HXpx/Whiteboard-6.png)
## Approach & Efficiency

Create a class called AnimalShelter which holds only dogs and cats.
    The shelter operates using a first-in, first-out approach.
    Implement the following methods:
        enqueue
            Arguments: animal
                animal can be either a dog or a cat object.
        dequeue
            Arguments: pref
                pref can be either "dog" or "cat"
            Return: either a dog or a cat, based on preference.
                If pref is not "dog" or "cat" then return null.


# stack-and-queue
# Challenge Summary
Multi-bracket Validation.

## Whiteboard Process
![](https://i.ibb.co/fHX4BJV/Whiteboard-7.png)
## Approach & Efficiency


    Write a function called validate brackets
    Arguments: string
    Return: boolean
        representing whether or not the brackets in the string are balanced

There are 3 types of brackets:

    Round Brackets : ()
    Square Brackets : []
    Curly Brackets : {}

time ==>O(n)
space ==> O(n)




