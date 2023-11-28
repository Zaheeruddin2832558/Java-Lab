/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author zaheeruddin
 */
package BuggyMachine;
interface BuggyState {
    void leftPedalPressed(BuggyControl context);

    void leftPedalHeld(BuggyControl context);

    void rightPedalPressed(BuggyControl context);

    void rightPedalHeld(BuggyControl context);

    void setContext(BuggyControl context);
}
