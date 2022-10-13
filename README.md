# SER515-Fall22-Team4
# ICA 7: Design Patterns

Github Link - https://github.com/ryancollinsnc/SER515-Fall22-Team4

How to run the program:

1) Run the main() function from the Main class.

2) Option 1 is the Course Instructor Menu where he is able to Create a new syllabus from scratch using existing templates, publish a created syllabus for review or modify an existing syllabus.

3) Option 2 is a Timer function to demo the timer that will periodically check if policies have been updated. For demo purposes, keep running option 2 till it generates a true condition, simulating that the policies have been changed.



Design Patterns:

Builder Pattern was implemented to create various templates of the syllabus - in this case CS and SE Syllabus.

Decorator Pattern was used to modify the createSyllabus() function to fetch old syllabus details.

Adaptor Pattern was used to translate the publishSyllabusService() function to the equivalent Canvas service, publishSyllabusCavnas().

Facade Pattern was used to act as a controller class and wrap all class functions in a single class for easy access by the Main Class to hide complexity of the code.

Singleton Pattern was used to implement a University Policies class that uses a timer that will fetch policies from an external source. For demo purposes, we have used a random function to determine if policies have been changed or not.



SER 515 - Fall 2022 - Group 4

Akshat Nambiar
Ryan Collans
Arnav Raviraj
Janki Padiya
Dhwanil Vashi
