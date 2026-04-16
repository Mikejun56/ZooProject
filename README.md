\# ZooProject



\## Overview

ZooProject is a Java console application that simulates a zoo environment using object-oriented programming principles. The program allows users to interact with different animals (Tiger, Dolphin, and Penguin) through a menu-driven system.



Each animal is modeled using inheritance and interfaces to demonstrate real-world behaviors such as eating, walking, and swimming.



\---



\## Features

\- Menu-driven console interface

\- Multiple animal types:

&#x20; - Tiger (land animal)

&#x20; - Dolphin (water animal)

&#x20; - Penguin (hybrid animal: land \& water)

\- Encapsulation using getters and setters

\- Use of interfaces to define behaviors

\- Demonstrates inheritance and polymorphism



\---



\## Technologies Used

\- Java

\- Object-Oriented Programming (OOP)



\---



\## Project Structure



\### Core Classes

\- `Animal.java` (Abstract Class)

&#x20; - Base class for all animals

&#x20; - Contains shared properties:

&#x20;   - name

&#x20;   - age

&#x20;   - weight

&#x20;   - height

&#x20; - Implements basic eating behavior



\### Interfaces

\- `Eat.java`

&#x20; - Defines:

&#x20;   - eatingFood()

&#x20;   - eatingCompleted()



\- `Walk.java`

&#x20; - Defines:

&#x20;   - walking()



\- `Swim.java`

&#x20; - Defines:

&#x20;   - swimming()



\---



\## Animal Implementations



\### Tiger.java

\- Extends `Animal`

\- Implements `Walk`

\- Properties:

&#x20; - number of stripes

&#x20; - speed

&#x20; - sound level of roar

\- Behavior:

&#x20; - Walking



\---



\### Dolphin.java

\- Extends `Animal`

\- Implements `Swim`

\- Properties:

&#x20; - color

&#x20; - swimming speed

\- Behavior:

&#x20; - Swimming

&#x20; - Eating (overridden)



\---



\### Penguin.java

\- Extends `Animal`

\- Implements both `Walk` and `Swim`

\- Properties:

&#x20; - swim speed

&#x20; - walk speed

&#x20; - swimming state (true/false)

\- Behavior:

&#x20; - Can either walk or swim depending on state



\---



\## Main Program



\- `Main.java` provides a menu system that allows the user to:

&#x20; 1. Select an animal

&#x20; 2. Set animal properties

&#x20; 3. Display animal details

&#x20; 4. Trigger behaviors (walking, swimming, eating)



Example menu:

1\. Tiger

2\. Dolphin

3\. Penguin





\---



\## How to Run



1\. Clone the repository:

&#x20;  ```bash

&#x20;  git clone https://github.com/Mikejun56/ZooProject.git



2\. Open the project in an IDE (IntelliJ, Eclipse, or VS Code)



3.Compile and run: 	

&#x09;Main.java

