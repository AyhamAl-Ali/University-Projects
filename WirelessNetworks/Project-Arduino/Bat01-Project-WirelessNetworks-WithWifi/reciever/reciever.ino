/* This simple project describes how to make an ultrasonic alarm system using 
LED, Ultasonic Sensor(HC-SR04) and a buzzer.*/ 

//Firstly the connections of ultrasonic Sensor.Connect +5v and GND normally and trigger pin to 12 & echo pin to 13. 

#define trigPin 12
#define echoPin 13
int Buzzer = 8; // Connect buzzer pin to 8
int ledPin= 6;  //Connect LEd pin to 6
int duration, distance; //to measure the distance and time taken 

int randomBuzzerSound[8] = {800};
int randomBuzzerSoundArrayLength = 1;

void setup() {
        Serial.begin (9600); 
        //Define the output and input objects(devices)
        pinMode(trigPin, OUTPUT); 
        pinMode(echoPin, INPUT);
        pinMode(Buzzer, OUTPUT);
        pinMode(ledPin, OUTPUT);
}

void loop() {

    digitalWrite(trigPin, HIGH);
    delayMicroseconds(10);
    digitalWrite(trigPin, LOW);
    duration = pulseIn(echoPin, HIGH);
    distance = (duration/2) / 29.1;
    //when distance is greater than or equal to 200 OR less than or equal to 0,the buzzer and LED are off
  if (distance >= 100 || distance <= 0) // OFF
        {
        Serial.println("No object detected");
        digitalWrite(Buzzer,LOW);
        digitalWrite(ledPin,LOW);
        noTone(Buzzer);
        }
  else {
        // Serial.println("object detected");
        Serial.print("distance = ");              
        Serial.print(distance);              
        Serial.print("\n");
        // Serial.print(distance);        //prints the distance if it is between the range 0 to 200
        tone(Buzzer, randomBuzzerSound[random(0,randomBuzzerSoundArrayLength-1)]);
        // tone(Buzzer, randomBuzzerSound[0]);
        digitalWrite(ledPin,HIGH);
  }
}

