package main.java.com.lab;

public class Main {
    public static void main(String[] args){
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        Application mainApp = new Application(inputDevice, outputDevice);
        mainApp.run();
    }
}
