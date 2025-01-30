importprocessing.serial.*;
importjava.awt.Robot;
importjava.awt.event.InputEvent;
Serial myPort;  // Serial object to communicate with Arduino
Robot robot;    // Robot object to simulate mouse actions
void setup() {
  // Open the serial port that Arduino is connected to
  String portName = "COM3";  // Adjust if necessary
myPort = new Serial(this, "COM3", 9600);

  // Create a Robot object to simulate mouse events
try {
robot = new Robot();
  } catch (Exception e) {
println("Error: " + e.getMessage());
exit();
  }


}
void draw() {
background(255);
  // Check if data is available from Arduino
if (myPort.available() > 0) {
    String val = myPort.readStringUntil('\n');  // Read data from serial
if (val != null) {
val = trim(val);  // Remove extra spaces or newline characters
if (val.equals("CLICK")) {
        // Simulate a mouse click
robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);  // Press the left mouse button
robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);  // Release the left mouse button
println("Mouse Clicked!");
      }
else if (val.equals("SCROLL_UP")) {
        // Simulate a scroll up (negative value scrolls up)
robot.mouseWheel(-1);
println("Scrolled Up!");
      } else if (val.equals("SCROLL_DOWN")) {
        // Simulate a scroll down (positive value scrolls down)
robot.mouseWheel(1);
println("Scrolled Down!");
      }
    }
  }
}
