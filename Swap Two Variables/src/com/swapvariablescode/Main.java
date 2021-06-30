package com.swapvariablescode;

import java.util.concurrent.Flow;

public class Main {

    public static void main(String[] args) {
        // First we need to define two variables. I am going wih these two
        String Animal = "Tiger";
        String Flower = "Rose";

        // We can easily print Animal=Tiger and Flower=Rose using Print command as shown:
        System.out.println(Animal); // This will print Tiger, or
        System.out.println(Flower); // This will print the content inside the variable "Flower", which is Rose here.

        /* Now lets swap these two variables:
        Such that: Animal will print "Flower", and Flower will print "Animal"
         */
        Animal = Flower;
        Flower = Animal;
        System.out.println("Animal= "+Animal);
        System.out.println("Flower= "+Flower);
        /* The output we are getting:
        Animal= Rose
        Flower= Rose
        As you see there's a mistake. We wanted Flower = Tiger.
        We can fix this by introducing a new variable, lets name it "Temp".


        Lets try with another example:    */
        String Car = "BMW";
        String Device = "Laptop";
        String temp="";

        // Now it's time to swap them

        temp = Car;
        Car = Device;
        Device = temp;
        /* What I did?
         1. Initially variable "Car" was already filled with "BMW", in order to put somethine else
         there I need to first empty the variable "Car".
         2. So I made another variable and called it "temp". Temp is empty because I used:
         String temp = "";
         3. First I took away "BMW" from variable Car, and put it inside our 'temp' variable.
         4. Now, the variable car is empty, so I took "Laptop" from variable device and placed it
            inside the empty variable 'Car'.
         5. Now variable Device is empty, so let's take away "BMW" from our variable named 'temp'
            and put it inside variable 'Device'.
            We've successfully swapped the contents of these two variable. */

        System.out.println("The result look like this:"); // Run the code to see
        System.out.println("Car: "+Car);
        System.out.println("Device: "+Device);




    }
}
