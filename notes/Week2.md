# Week 2 Notes — OOP & Strings

## Object-Oriented Programming (OOP)

### Class & Object
- A class is a blueprint for creating objects.
- An object is an instance of a class.

Example:
class Student {
    String name;
}

Student s = new Student();

### Encapsulation
- Encapsulation means hiding data and providing controlled access.
- Variables are made private and accessed using getters and setters.

Example:
private int age;

public int getAge(){
    return age;
}


### Inheritance
- Inheritance allows a class to inherit properties and methods from another class.
- Uses `extends` keyword.

Example:
class Dog extends Animal

### Polymorphism
- Polymorphism means one method having multiple behaviors.

Types:
1. Compile-time → Method Overloading
2. Runtime → Method Overriding

Example:
Animal a = new Dog();


### Abstraction
- Abstraction hides implementation details and shows only essential functionality.
- Achieved using abstract classes and interfaces.

Example:
abstract class Shape {
    abstract void draw();
}


### Interface
- An interface defines a contract that classes must implement.
- A class uses `implements` to inherit an interface.

Example:
interface Animal {
    void sound();
}

class Dog implements Animal


## String Problems

### Reverse String
- Use two-pointer approach.

Time Complexity: O(n)


### Palindrome Check
- Compare characters from start and end.

Example:
madam → palindrome

### Anagram
- Two strings are anagrams if they contain the same characters with the same frequency.

Example:
listen → silent


### Vowel Count
- Traverse string and count vowels.

Example:
education → 5 vowels


### Longest Word in String
- Split string into words.
- Compare word lengths.

Example:
"Java is powerful" → powerful



### Character Frequency
- Use HashMap to store character counts.

Example:
banana → {b=1, a=3, n=2}



## Java Collections (Intro)

### ArrayList
- Dynamic array implementation in Java.
- Allows resizing automatically.

Common methods:
add()
get()
remove()

Example:
ArrayList<String> list = new ArrayList<>();


### Linked List (Basic Concept)
- Data stored in nodes.
- Each node contains data and next pointer.

Example:
10 → 20 → 30 → null

Traversal uses a pointer to move through nodes.