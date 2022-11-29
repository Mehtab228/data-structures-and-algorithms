# Insertion Sort

- Insertion sort is a sorting algorithm for sorting elements in an array. The algorithm iterates through the array beginning at the second element. On each iteration the current element is saved. Then the previous elements are compared and the current element is shifted earlier in the array until it is at the beginning of the array or the value before it is equal or larger in value.

![](../../../../../../../../../../../../../../var/folders/7l/nskflgmn76jcj5kdnldnd0q80000gn/T/TemporaryItems/NSIRD_screencaptureui_PigKGQ/Screen Shot 2022-11-28 at 6.14.20 PM.png)
- i = 1
  Initially i begins at 1 so we save 4 as temp. Next we compare 4 at index 1 with 8 at index 0. 8 is larger than 4 so we overwrite the 4 with 8, leaving index 0 and index 1 with the value of 8. We decrease j and then exit the while loop because j decrements to -1. Last we place temp at index 0.

![](../../../../../../../../../../../../../../var/folders/7l/nskflgmn76jcj5kdnldnd0q80000gn/T/TemporaryItems/NSIRD_screencaptureui_yF7zPj/Screen Shot 2022-11-28 at 6.20.06 PM.png)


- i = 2
  Next we save our temp variable of 25. Then we compare 25 and 8. Since 25 is larger than 8, it's already sorted and we can continue. We save our temp variable back where we took it from (index 2).
![](../../../../../../../../../../../../../../var/folders/7l/nskflgmn76jcj5kdnldnd0q80000gn/T/TemporaryItems/NSIRD_screencaptureui_ZL4BXm/Screen Shot 2022-11-28 at 6.22.51 PM.png)

- i = 3
  Next we save our temp variable of 13. Then we compare 13 and 25. Since 13 is smaller than 25, so we overwrite the 13 with 25, leaving index 2 and index 3 with the value of 25. We then check it against previous indexes. Last we place temp at index 4.
![](../../../../../../../../../../../../../../var/folders/7l/nskflgmn76jcj5kdnldnd0q80000gn/T/TemporaryItems/NSIRD_screencaptureui_n7xact/Screen Shot 2022-11-28 at 6.29.45 PM.png)

- i = 4
  This is our last increment of i. We save 4 in our temp variable and compare 4 and 25. 25 is larger so we overwrite index 4 (4) with 25. Next we compare 4 with 13, 13 is larger so we overwrite index 3 (25) with 13. Now we compare 4 with 8, 8 is larger so we overwrite index 3 (13) with 8. And last we compare 4 with 4, which is the same breaking us out of the loop.
![](../../../../../../../../../../../../../../var/folders/7l/nskflgmn76jcj5kdnldnd0q80000gn/T/TemporaryItems/NSIRD_screencaptureui_oSFMOV/Screen Shot 2022-11-28 at 6.35.51 PM.png)


## Big O

- Time: O(N^2)
  In the best case that the array is already sorted we would only visit each element once for a time efficacy of O(N), but in the worst case -- the case that counts for Big O, we need to compare each element (N * N-1) or N^2.


## Code:
![](../../../../../../../../../../../../../../var/folders/7l/nskflgmn76jcj5kdnldnd0q80000gn/T/TemporaryItems/NSIRD_screencaptureui_Fl2G26/Screen Shot 2022-11-28 at 6.37.29 PM.png)
