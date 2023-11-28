package BuggyMachine;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author zaheeruddin
 */

public class BuggyControl {
    private BuggyState currentState;

    public BuggyControl() {
        this.currentState = new RestState();
        this.currentState.setContext(this); 
    }
    
    public String getCurrentState() {
        return currentState.toString();
    }

    public void setCurrentState(BuggyState state) {
        this.currentState = state;
        this.currentState.setContext(this); 
    }

    public void leftPedalPressed() {
        currentState.leftPedalPressed(this);
    }

    public void leftPedalHeld() {
        currentState.leftPedalHeld(this);
    }

    public void rightPedalPressed() {
        currentState.rightPedalPressed(this);
    }

    public void rightPedalHeld() {
        currentState.rightPedalHeld(this);
    }

    public void printState() {
        System.out.println(currentState);
    }

    public static void main(String[] args) {
        
        BuggyControl buggy = new BuggyControl();
        buggy.printState();  // Expected: REST
        buggy.leftPedalPressed();
        buggy.printState();  // Expected: ACCELERATING_FORWARD
        buggy.rightPedalHeld();
        buggy.printState();  // Expected: CONSTANT_FORWARD_SPEED
    }
        }
    

