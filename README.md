# G1B5_FOP_Graded-Coding-Assignment-1
## Problem Statement
* → The assignment will contain 4 departments as four different object classes
  * i) Super Department
  * ii) Admin Department
  * iii) Hr Department
  * iv) Tech Department
* → Super Department class will be the superclass and all other departments must extend it.
* → Super department will contain 4 methods of return type String and will not accept any
parameter
  * i) departmentName
  *  ii) getTodaysWork
  *   iii) getWorkDeadline
  *   iv) isTodayAHoliday
    * departmentName will return “ Super Department “
    * getTodaysWork will return “ No Work as of now”
    * getWorkDeadline will return “ Nil “
    * isTodayAHoliday will return “ Today is not a holiday”
* → Admin department will contain 3 methods of return type String and will not accept any
parameter
 * i) departmentName
 * ii) getTodaysWork
 * iii) getWorkDeadline
  * departmentName will return “ Admin Department “
  * getTodaysWork will return “Complete your documents Submission”
  * getWorkDeadline will return “ Complete by EOD “
* → Hr department will contain 4 methods of return type String and will not accept any
parameter
 * i) departmentName
 * ii) getTodaysWork
 * iii) getWorkDeadline
 * iv) doActivity
 *  * departmentName will return “ Hr Department “
    * getTodaysWork will return “ Fill today’s timesheet and mark your attendance”
    * getWorkDeadline will return “ Complete by EOD “
    * doActivity “team Lunch”
* → Tech department will contain 4 methods of return type String and will not accept any
parameter
  * i) departmentName
  * ii) getTodaysWork
  * iii) getWorkDeadline
  * iv) getTechStackInformation
    * departmentName will return “ Tech Department “
    * getTodaysWork will return “ Complete coding of module 1”
    * getWorkDeadline will return “ Complete by EOD “
    * getTechStackInformation will return “core Java”
* → Driver class Main will be used to create objects of HrDepartment, TechDepartment,
AdminDepartment
* → Each department will display all its functionalities.
* → Each department will display whether today is a holiday or not with the help of the Super
Department. (SuperDepartment will act as a super class for all the departments

## Project Details
* It has 2 packages: com.greatlearning.main and com.greatlearning.problem
* com.greatlearning.main is the package containing the driver class Main.java
* com.greatlearning.problem is the package containing the 4 classes : SuperDepartment.java, AdminDepartment.java, HrDepartment.java and TechDepartment.java
* SuperDepartment is the SUPER class here while all the other classes are direct CHILD/DERIVED classes of SuperDepartment class.

## Concepts
* <b>OOPs</b> -Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance
* <b>Class</b> -Collection of objects is called class. It is a logical entity. A class can also be defined as a blueprint from which you can create an individual object.
* <b>Polymorphism</b> - If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc. In Java, we use method overloading(compile-time) and method overriding to achieve polymorphism(runtime).
* <b>Inheritance</b> - When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
* <b>Abstraction</b> - Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing. In Java, we use abstract class and interface to achieve abstraction.
* <b>Encapsulation</b> - Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.

![image](https://github.com/Anirudh-lone-wolf/G1B5_FOP_Graded-Coding-Assignment-1/assets/66291656/7fc9a0d8-4356-4cf8-a202-99c02974a128)

