Gym Chain

We have an existing gym chain in a given city that is completely offline and wants to start an online portal for managing bookings. The portal will have an admin view and customer view.

Write a driver class to demonstrate the mentioned basic functionalities.Choose the appropriate argument and return types for the functions. Consider how to make the code thread safe and be able to handle concurrency:

Admin Flows:

1. add_gym(name, location, max_accomodation)

Admin will have permissions to create a gym. Max_accomodation will comply with max number of people for that gym at any given point in time. Every gym can have multiple classes running between 6am to 8pm

2. remove_gym(gym_id)

Admin can remove the entire gym which will also cancel all the classes and the bookings hosted here

3. addClass(gym_id, class_type, max_limit, start_time, end_time)

Admin will have permissions to create a class. Every class accounts to max_limit number of people that will stay in the gym class. Class_type refers to certain type of workouts e.g: weights, cardio, etc. max_accomodation will be checked during class creation

4. removeClass(gym_id, class_id)

Admin will have permissions to remove a class from a gym

Customer Flows:

1. bookClass(customer_id, gym_id, class_id)

Customers can book the class if the class is available(max_limit not crossed). One customer can book a given class only once.

2. getAllBookings(customer_id)

Customer can view all of his/her bookings

3. cancelBooking(booking_id)

Customer can cancel a booking

Few Examples:

addGym(“Gym1”, “Indira Nagar”, 100) Success -> returns gym1_id

addClass(“gym1_id”, “cardio”, 20, “6:00”, “7:00”) Success -> returns class1_id

bookClass(“customer1”, “gym1_id”, “class1_id”) Success -> returns booking1_id

Note:

Use in-memory data structures. Do not use Databases for this interview round

Handle exceptions gracefully

Do not implement authentication for the purpose of this interview

Handle concurrency and race conditions

Use plain Java code with a driver class to demonstrate(Do not use any framework like Spring)

Handle all corner cases and validations(Discuss with interviewer about what validations need to done in a real-world scenario)

No need to create UI

Work on expected output first then good to have features

You can choose and state the rational assumptions of your own

Evaluation criteria:

Code should be demonstrable

Thread safe / concurrency / race conditions

Approach to solution

Choice of DataStructures used

Optimization

Readability

Extensibility

Modularity

Exception Handling

Input validation