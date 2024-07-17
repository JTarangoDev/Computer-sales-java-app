# Java Computer Sales System

## Description

This project is a Java-based computer sales system that allows for the creation and management of computer orders. It's designed as a practice project to demonstrate advanced object-oriented programming concepts in Java. The system creates and manages orders containing multiple computers, each composed of various components.

## Features

- Create computer orders
- Add computers to orders
- Display order details
- Complex object relationships modeling a real-world computer sales scenario

## Technologies Used

- Java

## Project Structure

The project consists of several classes representing different entities:

1. `Orden` (Order): Contains an ID and a list of `Computadora` objects
2. `Computadora` (Computer): Represents a computer with attributes like brand name, and composed of `Monitor`, `Keyboard`, and `Mouse` objects
3. `Monitor` (Screen): Represents a computer screen
4. `Teclado` and `Raton` (Keyboard and Mouse): Both inherit from an `DispositivoEntrada` class
5. `DispositivoEntrada` (InputDevice): An abstract class that defines common attributes for input devices (brand and input type)

## How to Run

1. Ensure you have Java installed on your system.
2. Clone this repository to your local machine.
3. Navigate to the project directory in your terminal.
4. Compile the Java files.
5. Run the compiled program.

## Usage

This application doesn't have a user interface. Instead, it demonstrates the creation and manipulation of objects directly in the `Main` class:

1. Objects (computers, components, orders) are created manually with their respective arguments.
2. Methods are called to add computers to orders and display order details.
3. The output will show the created orders and their details.

## Project Status

This project is completed but may be updated with additional features in the future.

## Learning Objectives

This project demonstrates advanced Java and OOP concepts including:
- Object-Oriented Programming (OOP) principles
- Class design and creation
- Inheritance
- Relationships between classes (composition, aggregation)
- Method overriding
- Working with lists and complex object structures

## Implementation Details

- The `Orden` class manages a list of `Computadora` objects.
- Each `Computadora` is composed of `Monitor`, `Teclado`, and `Raton` objects.
- `Teclado` and `Raton` classes inherit from the `DispositivoEntrada` class.
- The `Main` class demonstrates the creation and usage of these objects.

## Note

The code comments and variable names in this project are written in Spanish as it was developed for personal learning purposes. The logic and structure of the code remain universal.

---

Feel free to contribute to this project or use it as a learning resource for advanced Java OOP concepts!