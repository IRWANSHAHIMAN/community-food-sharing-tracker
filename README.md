
# 🍱 Community Food Sharing Tracker

A Java console-based application developed for the **DFK30053 Object-Oriented Programming Mini Project**.

The system is designed to help manage community food donations by allowing users to add, view, and search for donated food while providing suitable storage instructions.

---

## 📸 Project Preview

### Main Menu
![Main Menu](images/main-menu.png)

### Add Food
![Add Food](images/add-food.png)

### View All Food
![View All Food](images/view-food.png)

### Search Food
![Search Food](images/search-food.png)

---

## ✨ Features

- ➕ Add new food donations
- 📋 View all donated food
- 🔍 Search food by ID or name
- 🥬 Fresh Food category
- 🥫 Canned Food category
- 📦 Display storage instructions
- ⚠️ Handle invalid user input
- 🚪 Exit the system

---

## 💻 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- Exception Handling
- Custom Packages

---

## 🧩 OOP Concepts

### 1. Abstraction

The `Food` class is an abstract class that contains common food information and an abstract method.

```java
public abstract String getStorageInstructions();
```

### 2. Encapsulation

The attributes are declared as `private` and accessed using getter and setter methods.

```java
private String foodId;
private String name;
private int quantity;
```

### 3. Inheritance

`FreshFood` and `CannedFood` inherit from the `Food` class.

```java
public class FreshFood extends Food
public class CannedFood extends Food
```

### 4. Polymorphism

Both subclasses override the `getStorageInstructions()` method.

```java
@Override
public String getStorageInstructions()
```

---

## 📂 Project Structure

```text
src/
└── food/
    └── bank/
        ├── model/
        │   ├── Food.java
        │   ├── FreshFood.java
        │   └── CannedFood.java
        │
        └── main/
            └── FoodBankSystem.java
```

---

## 🖥️ System Menu

```text
=================================
 COMMUNITY FOOD SHARING TRACKER
=================================
1. Add Food
2. View All Food
3. Search Food
4. Exit
=================================
```

---

## 🥬 Food Storage Instructions

| Food Type | Storage Instruction |
|-----------|---------------------|
| Fresh Food | Keep Refrigerated at 4°C |
| Canned Food | Store in a cool, dry place |

---

## ⚠️ Exception Handling

The system uses `try-catch` to handle invalid numeric input and prevent the program from crashing.

Example:

```text
Enter choice: q
Error: Please enter a number.
```

---

## 📊 UML Class Diagram

![UML Class Diagram](images/uml-diagram.png)

---

## 🎯 Project Purpose

The purpose of this project is to apply fundamental **Object-Oriented Programming concepts** in Java while developing a simple food donation management system.

---

## 📚 Concepts Applied

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism
- ArrayList
- Control Structures
- String Manipulation
- Packages
- Exception Handling

---

## 👥 Project Information

**Course:** DFK30053 Object-Oriented Programming  
**Project:** Community Food Sharing Tracker  
**Project Type:** Mini Project  
**Language:** Java  
**Tool:**BlueJ

---

## 📄 License

This project was developed for educational purposes.
