# Mouse Control Using Arduino and Processing

## Overview
This project enables mouse control using an ultrasonic sensor connected to an Arduino. The system simulates mouse clicks and scrolling actions based on the detected distance of an object.

## Features
- Uses an ultrasonic sensor to detect hand movements.
- Sends signals to a Processing script to control mouse actions.
- Supports mouse clicking and scrolling up/down.

## Components Required
- **Arduino Board** (e.g., Arduino Uno)
- **Ultrasonic Sensor** (HC-SR04)
- **USB Cable** (to connect Arduino to PC)
- **Computer with Java and Processing installed**

## How It Works
1. The ultrasonic sensor measures the distance of an object.
2. The Arduino sends distance-based commands (CLICK, SCROLL_UP, SCROLL_DOWN) via serial communication.
3. A Processing script reads these commands and uses Java's `Robot` class to simulate mouse actions.

## Code Breakdown
### Arduino Code (`ArduinoCode.cpp`)
- Initializes the ultrasonic sensor and serial communication.
- Measures distance and sends appropriate commands based on object proximity.

### Processing Code (`PocessIDE.java`)
- Reads serial data from Arduino.
- Uses Java's `Robot` class to simulate mouse clicks and scrolling.

## Setup Instructions
### 1. Arduino Setup
- Connect the **HC-SR04** ultrasonic sensor to the Arduino:
  - `VCC` → `5V`
  - `GND` → `GND`
  - `Trig` → `Pin 9`
  - `Echo` → `Pin 10`
- Upload the Arduino sketch (`ArduinoCode.cpp`) to the board.

### 2. Processing Setup
- Install **Processing IDE**.
- Install the **Processing Serial Library**.
- Run `PocessIDE.java` in Processing.

### 3. Running the Project
1. Upload the Arduino sketch.
2. Run the Processing script.
3. Move your hand near the sensor to control mouse actions:
   - **< 10 cm** → Mouse Click
   - **10-20 cm** → Scroll Up
   - **> 20 cm** → Scroll Down

## Troubleshooting
- Ensure the correct **COM port** is selected in `PocessIDE.java`.
- If Processing cannot access the serial port, close other programs using it.
- If no response, check wiring and ensure Arduino is sending serial data.

## Future Improvements
- Add gesture-based controls for more actions.
- Implement smoother scrolling.
- Integrate machine learning for better accuracy.

## License
This project is open-source under the MIT License.

## Author
 **JIVANI KESHA**
