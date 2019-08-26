package com.tavisca.workshop;

public class Main {
    public static void main(String[] args) {
        MarsRoboRover rover=new MarsRoboRover("3 3 N");
        String command="MLRMMLRLWLM";
        rover.command(command);
    }
}
