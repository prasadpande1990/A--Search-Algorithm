															
##Tools and Platform Used
1. java version "1.8.0_101"
2. IntelliJ IDEA CE

##Execution Instructions
1. Go to ~/A*\Search/src directory
2. Compile the code using following
	javac astar/*.java
3. If step 3 is successful, run the code using
	java -cp . astar.AStartImpl

##Sample Output

Initiating the input graph for A-star search
Applying A-star search algorithm to find shortest path with w = 0

Final Cost = 493.0

Number of nodes expanded = 8

Path -
Zerind --> Arad --> Sibiu --> Rimnicu Vilcea --> Pitesti --> Bucharest --> 
----------------------------------------------------------------------

Applying A-star search algorithm to find shortest path with w = 0.25

Final Cost = 369.75

Number of nodes expanded = 12

Path -
Zerind --> Arad --> Sibiu --> Rimnicu Vilcea --> Pitesti --> Bucharest --> 
----------------------------------------------------------------------
Applying A-star search algorithm to find shortest path with w = 0.75

Final Cost = 131.25

Number of nodes expanded = 4

Path -
Zerind --> Arad --> Sibiu --> Fagaras --> Bucharest -->
