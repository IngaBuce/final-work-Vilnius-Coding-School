## Automation test for www.ltglink.lt

### Link to the page - [www.ltglink.lt](https://ltglink.lt/)
## Test cases
### **Test 1 - Logging to existing account**
    - Enter correct username: *saltukas@gmail.com*;
    - Enter correct password: *baltukas*;
    - Click "Confirm" button;
* Expected result: should be able to see user tickets "Bilietai".

### **Test 2 - Logging with incorrect data**
    - Enter correct username: *saltukas@gmail.com*;
    - Enter incorrect password: *baltukas*;
    - Click "Confirm" button;
* Expected result: should be given error message for 
incorrect login data "Neteisingi prisijungimo duomenys".

### **Test 3 - Search for route timetable**
     - Enter correct travel origin name: *Vilnius*;
     - Enter correct travel destination name: *Kaunas*;
     - Pick correct travel date: *2022-11-24*;
     - Click "Search" button;
* Expected result: should be given error message for
incorrect login data "Neteisingi prisijungimo duomenys".

### **Test 4 - Search for travel tickets**
     - Enter correct travel origin name: *Vilnius*;
     - Enter correct travel destination name: *Kaunas*;
     - Click "Search" button;
* Expected result: should be able to see "Paieskos rezultatai" that contains
tickets data.

### **Test 5 - Search for travel tickets with incorrect stop name**
      -Enter correct travel origin name: *Vilnius*;
     - Enter correct travel destination name: *Saltupiskes*;
     - Click "Search" button;
* Expected result: should be given error message for incorrect provided information:
"Patikrinkite ar teisingai įvedėte stotelės pavadinimą".


 