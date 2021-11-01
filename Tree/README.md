#Trees

- [X] Top-level README “Table of Contents” is updated
- [X] README for this challenge is complete
    - [X] Summary, Description, Approach & Efficiency, Solution
    - [ ] Picture of whiteboard
    - [X] Link to code
- [X] Feature tasks for this challenge are completed
- [X] Unit tests written and passing
    - [X] “Happy Path” - Expected outcome
    - [X] Expected failure
    - [X] Edge Case (if applicable/obvious)



# lab -16
# Challenge Summary

Find the Maximum Value in a Binary search Tree and Binary tree
## Whiteboard Process
![](https://i.ibb.co/7NRpc9F/Whiteboard-8.png)

**BT**
![](https://i.ibb.co/zZmXqYY/Whiteboard-12.png)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Big O
- Space: O(1)
- Time: O(n)
## Solution
see white board ^^


# lab -17
# Challenge Summary

Breadth first tree

# Whiteboard Process
![](https://i.ibb.co/6mtvRWc/Whiteboard-9.png)

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### Big O
**Time Complexity**: O(n^2) in worst case. For a skewed tree, printGivenLevel() takes O(n) time where n is the number of nodes in the skewed tree. So time complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2).
**Space Complexity**: O(n) in worst case. For a skewed tree, printGivenLevel() uses O(n) space for call stack. For a Balanced tree, the call stack uses O(log n) space, (i.e., the height of the balanced tree). 
![](https://i.ibb.co/k5Mp1PM/0-MGSfu-Newe-U-YKi-FH.gif)