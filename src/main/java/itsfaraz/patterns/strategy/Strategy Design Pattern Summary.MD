# Problem Statement



Vehicle -- Parent Class

OffRoad Vechicle, Sport Vehicle & Passenger Vehicle is a child of Vehicle

Issue :-

* OffRoad Vehicle & Sport Vechicle has different logic other than Passenger Vehicle
* But Passenger vehicles logic is inherting from pasrent i.e, Vehicle class
* OffRoad Vehicle & Sport Vehicle classes are writing duplicate logic
* Insuch cases when 2 or more child need to use different logic from parent but same with each other, Then here we can apply strategy to remove redundancy between childrens code

Fix :- 

* In strategy design pattern, We need to extract out the redundant code.
* In our case Sport and Offroad vehicle wanted similar functionality but don't had a way to reuse.
* With strategy we extracted the logic from Vehicle and passed as dependency of Vehicle from Strategy Interface. 

###### Package Structure
* Problem Version
* Fixed Version



<br><br>
<span style="background-image: linear-gradient(to right, #3399ff, #ffff00, #bf40bf); -webkit-background-clip: text; color: transparent; font-size: 16px;">Don't Forget To Star My Work</span>
