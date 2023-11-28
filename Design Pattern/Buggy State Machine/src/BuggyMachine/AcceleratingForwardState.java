/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zaheeruddin
 */
package BuggyMachine;
class AcceleratingForwardState implements BuggyState {
    private BuggyControl context;

    @Override
    public void setContext(BuggyControl context) {
        this.context = context;
    }
    @Override
    public void leftPedalPressed(BuggyControl context) {
        
    }

    @Override
    public void leftPedalHeld(BuggyControl context) {
        context.setCurrentState(new ConstantForwardSpeedState());
    }

    @Override
    public void rightPedalPressed(BuggyControl context) {
        context.setCurrentState(new DeacceleratingForwardState());
    }

    @Override
    public void rightPedalHeld(BuggyControl context) {
        context.setCurrentState(new ConstantForwardSpeedState());
    }

    @Override
    public String toString() {
        return "ACCELERATING_FORWARD";
    }
}
