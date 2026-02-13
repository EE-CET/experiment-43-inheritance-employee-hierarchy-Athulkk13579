[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/CeMh_HGw)
# Experiment 43: Inheritance (Employee Hierarchy)

## Problem Statement

Create a class `Employee` with attributes `name`, `age`, `phoneNumber`, `address`, and `salary`. It should have a method `printSalary()` to print the salary.

Create two classes `Officer` and `Manager` that inherit from `Employee`:
* `Officer` has an additional attribute `specialization`.
* `Manager` has an additional attribute `department`.

Write a program to assign values to an **Officer** and a **Manager** and print their details.

## Input Format

* **Officer Details (Lines 1-6):**
  * Name
  * Age
  * Phone Number
  * Address
  * Salary
  * Specialization
* **Manager Details (Lines 7-12):**
  * Name
  * Age
  * Phone Number
  * Address
  * Salary
  * Department

## Output Format

* **Officer:**
  * Name
  * Age
  * Phone Number
  * Address
  * Salary
  * Specialization
* **Manager:**
  * Name
  * Age
  * Phone Number
  * Address
  * Salary
  * Department

### Example 1

**Input:**

```text
John
30
9876543210
Kerala
50000
IT
Jane
40
1234567890
India
80000
Sales
```

**Output:**

```text
Officer:
John
30
9876543210
Kerala
50000
IT
Manager:
Jane
40
1234567890
India
80000
Sales
```
