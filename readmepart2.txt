Elizabeth Koshelev
COSI 12B, Spring 2015 
Programming Assignment #4, 3/14/16
For the second part of the assignment, I created four different classes. Two were meant to create
objects, and the others were meant to put the objects into arraylists and sort them. The Item
class, constructed an item based on the inputed information such as price, quantity, bulk price,
and bulk quantity. The next class is the ItemOrder class, which represents an item by its quantity 
and item and returns the information, also setting up a compareTo method that allows the class
shoppingCart to sort the items based on quantity. The shopping cart put the item orders into an array
list and sorted them using collections. The last class was the Catalog class, which took items
and put them into an arraylist, returning information as needed. My program runs smoothly. The only
issue is that when the program is started, SortedList = [] prints many times. I tried to fix this
by altering the toString method in shoppingCart to only print when the list was greater than length
0, but I got an error so I left it as it was. As well as this, the sorted list prints twice for 
some unknown reason. Other than that, my code runs as it should.
.