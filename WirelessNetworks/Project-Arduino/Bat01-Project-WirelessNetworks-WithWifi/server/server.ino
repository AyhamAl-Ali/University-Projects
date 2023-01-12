/* This simple project describes how to make an ultrasonic alarm system using 
LED, Ultasonic Sensor(HC-SR04) and a buzzer.*/ 

//Firstly the connections of ultrasonic Sensor.Connect +5v and GND normally and trigger pin to 12 & echo pin to 13. 

#include <SoftwareSerial.h>
#include <ESP8266IoTAdapter.h>

/*
 * Replace the SSID and password by yourself.
 */
const String WIFI_SSID = "Ayham";
const String WIFI_PASSWORD = "123456787";

/*
 * Wire the temperature sensor LM35 to analog input Pin1.
 */
// const int LM35_PIN = 1;

bool wifiConnected = false;
String ip;
String url;

// Create ESP8266 adapter with a SoftwareSeiral
SoftwareSerial softSerial(2, 3);
ESP8266IoTAdapter esp(softSerial);

void setupWifiStationMode()
{
    Serial.print("Connecting to WiFi AP...");

    /*
     * You need to replace the SSID and password by yourself.
     */
    esp.connectToAP(WIFI_SSID, WIFI_PASSWORD);
    while (true)
    {
        int status = esp.getWifiStatus();
        if (status == 2)
        {
            Serial.println("ERROR:");
            Serial.println("Wrong password.");
            break;
        }
        else if (status == 3)
        {
            Serial.println("ERROR:");
            Serial.println("SSID \"" + WIFI_SSID + "\" has not been found.");
            break;
        }
        else if (status == 4)
        {
            Serial.println("ERROR:");
            Serial.println("Fail to connect with \"" + WIFI_SSID + "\".");
            break;
        }
        else if (status == 5)
        {
            wifiConnected = true;
            Serial.println();
            ip = esp.getIP();
            url = "http://" + ip + "/data";
            Serial.println("IP Address: " + ip);
            break;
        }
        else
        {
            delay(1000);
            Serial.print(".");
        }
    }

    if (wifiConnected)
    {
        Serial.print("Restarting server...");
        esp.restartServer();
        Serial.println("done");

        Serial.println();
        Serial.println("Please open your browser and visit");
        Serial.println(url);
        Serial.println();
    }
}

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

    // Serial.begin(9600);
    setupWifiStationMode();
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
        // tone(Buzzer, randomBuzzerSound[random(0,randomBuzzerSoundArrayLength-1)]);
        // tone(Buzzer, randomBuzzerSound[0]);
        digitalWrite(ledPin,HIGH);
  }

  if (wifiConnected)
  {
      // Read temperature value from Analog PIN 0
      // double temperature = analogRead(LM35_PIN) * (5/10.24);
      // Update values on ESP8266 server every 60 seconds
      // esp.setValue("temperature", temperature);
      // Serial.print("Temperature: ");
      // Serial.println(temperature);
      // delay(10000);
  }
}
