Hostel Management System
define number of room - 2(A, B), 2 per room (4 students capacity)
maintain a counter for each room (which will contain number of occupants occupied or allotted)
class hostel
	declare variables for accepting details of student
	Constructor
	priority for admission
		1. F and dist >500 - 1
		2. F and dist <= 500 and >100 - 2
		3. M and dist >500 - 3
		4. M and dist <=500 and >100 - 4
		5. dist<= 100 - 5
class student
	accept int roll_no, age, dob, phn_no, f_phn_no, hometown_distance;
	char name[100], city[20], email_id[100], f_name[100], hostel[100], gender;
	Constructor using super
	note: 

note: consider for the 25 students to be allocated rooms
approach 1: enter or accept each and every student details allot the room and display the result (implementing the project using this approach)
approach 2: consider we have 50 students. From those 50 students, 25 must be allocated admission into the hostel.
question: 


students will be deletd based on the given name. The counter for that room will be decremented. 
Given student name is there - deleted 
not there - print error message

Enter:
'1' to add a student
'2' to delete a student
'3' to display the allocation list
'4' to exit	