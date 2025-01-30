constinttrigPin = 9;
constintechoPin = 10;
long duration;
int distance;
void setup() {
  // Initialize serial communication
Serial.begin(9600);
  // Set ultrasonic sensor pins
pinMode(trigPin, OUTPUT);
pinMode(echoPin, INPUT);
}
void loop() {
  // Clear the trigPin by setting it LOW
digitalWrite(trigPin, LOW);
delayMicroseconds(2);
// Send a 10-microsecond pulse to trigger the measurement
digitalWrite(trigPin, HIGH);
delayMicroseconds(10);
digitalWrite(trigPin, LOW);
  // Measure the time it takes for the pulse to return
duration = pulseIn(echoPin, HIGH);
  // Calculate the distance in centimeters
distance = duration * 0.034 / 2;
  // Send the distance value to the serial monitor
Serial.println(distance);
  // Trigger mouse click or scroll activity based on distance
if (distance < 10) {
Serial.println("CLICK"); // Hand too close, simulate a click
  }
else if (distance >= 10 && distance < 20) 
{
Serial.println("SCROLL_UP"); // Scroll up if the distance is between 10 and 20 cm
  }
else if (distance >= 20) 
{
Serial.println("SCROLL_DOWN"); // Scroll down if the distance is greater than or equal to 20 cm
  }
delay(100); // Delay for stability
}

