# Pong
A simple implementation of the Pong game for students of CIS220

## Step 1
Design some objects that may be necessary for the Game.

Example, the Ball object.

### Ball
#### Attributes
 - x: double
 - y: double
 - width: double // we may want to use shapes other than round
 - height: double
 - speed/distance: double // the number of pixels to move in 1/60 seconds
 - direction: double // the angle of the movement
 - colour: java.awt.Color

### Methods
  - move
  - detectBoundaries
