![image](./AnimalShelter.png)

-To represent the animal shelter with two stacks. I designated one stack as the front, that will always be empty except for processing the dequeue(). 
-The back stack is where new elements get pushed as they enter the queue. 
-To dequeue all the animals in the back stack get popped off into the front stack (reversing their order).
-Then while the front stack is not empty we peek() at each animal and if the species doesn't match the preference then it gets moved to the back stack. If it does it gets saved while the rest of the front stack gets moved to the back. 
-Then the saved animal gets returned.

Enqueue elements can be directly pushed onto the back stack and since the underlying stack has a time complexity of O(1) for pushing, the animal shelter has a O(1) time complexity for enqueue.

To dequeue the best case is O(N) and the worst case we need to touch each value twice creating O(N) time complexity.

Both methods do not use any other data structures and do not use more disk space as N increases: O(1).
