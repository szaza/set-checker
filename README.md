# Set checker
This program generates a grid of set cards and cheks if a SET is present.
A SET consists of three cards stisfying all of these conditions:
- they all have the same number or have three different numbers;
- they all have the same symbol or have three different symbols;
- they all have the same shading or have three different shadings;
- they all have the same color or have three diferent colors;

Given any two cards, there is exaclty one card that forms a set with those two cards. Therefore, the probablity of producing a SET from 3 randomly drawn cards from a complete deck is 1/79.

### Output ###
The output looks like:

```
THE GRID
-----------------------------------------------------------------------------------------
Card{1-red-striped-diamond} | Card{3-red-blank-diamond} | Card{3-red-filled-oval} | 
-----------------------------------------------------------------------------------------
Card{1-green-blank-diamond} | Card{1-purple-filled-croissant} | Card{3-green-filled-diamond} | 
-----------------------------------------------------------------------------------------
Card{1-purple-blank-oval} | Card{1-green-filled-diamond} | Card{3-purple-striped-croissant} | 
-----------------------------------------------------------------------------------------
Card{1-red-blank-diamond} | Card{1-green-filled-croissant} | Card{3-red-blank-oval} | 
-----------------------------------------------------------------------------------------

THE FOLLOWING SET WAS/WERE FOUND: 
SetOfCards{Card{3-red-blank-oval}, Card{3-green-filled-diamond}, Card{3-purple-striped-croissant}, }
SetOfCards{Card{1-red-striped-diamond}, Card{1-green-filled-croissant}, Card{1-purple-blank-oval}, }
```

### Build and run ###
- Clone this repository
- Compile it with Gradle: `./gradlew clean build`
- Run it with Gradle: `./gradlew run`

### Info ###
You can find more about the set game here: https://en.wikipedia.org/wiki/Set_(game)
