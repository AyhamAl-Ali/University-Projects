int myDelay = 200;

void setup() {
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);

}

void loop() {
  digitalWrite(13, HIGH);
  delay(myDelay);
  digitalWrite(13, LOW);
  delay(myDelay);
  
  digitalWrite(12, HIGH);
  delay(myDelay);
  digitalWrite(12, LOW);
  delay(myDelay);
  
  digitalWrite(11, HIGH);
  delay(myDelay);
  digitalWrite(11, LOW);
  delay(myDelay);
  

}
