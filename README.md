# CMSC 389T (Team 3)
Group Members: Ishaan Bhasin, Sreyas Chacko, Darren Kam, Selena Xiao

## How to run the code from the command line
To compile and run Pacman, go to the P3 directory and run the following commands:
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## Functions:
### PacMan:
Sreyas: get_valid_moves(Generates the valid locations to where the PacMan can move from its current location, storing them in an ArrayList.)

Selena: is_ghost_in_range(Checks the map if there are ghosts at any location one away from pacman)

### Ghost:
Sreyas: get_valid_moves(Generates the valid locations to where the Ghost can move from its current location, storing them in an ArrayList.)

Selena: move(Moves the ghost to the first valid move, returns false if no possible valid moves)

### Map:
Sreyas: getLoc(Obtains the icon presently located in the given location.)

Selena: move(Updates locations, components, field with new location of a component)
