# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	1 ArrayList
	3 Dogs
	1 Comparator

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
	The constructor call is the second argument in Collectsions.sort(): "new Comparator<Animal>()". 
	The class definition for comparator immediately follows the constructor call. The class definition consists of a single method: compare().
