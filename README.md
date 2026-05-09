# Gadget Shop Inventory Management System
**Module:** CS4001 - Introduction to Object-Oriented Programming  
**University:** London Metropolitan University

## Student Information
- **Name:** MD ANTOR KHAN
- **Student ID:** LM2590019

## Project Overview
This Java application is designed to manage an inventory system for a Gadget Shop. The project demonstrates core Object-Oriented Programming (OOP) concepts such as **Inheritance**, **Encapsulation**, and **Polymorphism**. It features a graphical user interface (GUI) built with Java Swing to interact with gadget records.

## Features
- **Add Mobile:** Allows adding mobile phone details including model, price, weight, size, and calling credit.
- **Add MP3:** Enables adding MP3 player details with specific memory capacity.
- **Inventory Display:** Lists all added gadgets with their specific attributes.
- **Validation:** Includes logic to handle credit updates for mobiles and memory management for MP3 players.

## Project Structure
- `Gadget.java`: The superclass containing common attributes for all gadgets.
- `Mobile.java`: A subclass specifically for mobile phone features.
- `MP3.java`: A subclass specifically for MP3 player features.
- `GadgetShop.java`: The main class that handles the GUI and application logic.

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed.
2. Clone this repository.
3. Compile the files:
   ```bash
   javac GadgetShop.java
