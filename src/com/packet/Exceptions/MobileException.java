package com.packet.Exceptions;

/**
 * Created by Mihai on 10/29/2014.
 * Exception class used for prompting a specific message
 * when an exception is thrown
 * The specific messages are declared in the "Constants" class
 * For this particularly project, MobileException is thrown in the following cases:
 * - 1. a mobile device is turned off and the user tries to call a method for that device;
 * - 2. a mobile device tries to execute a method but it does not have sufficient battery power to finish the execution;
 * - 3. a mobile device tries to reach a contact from the primary contact list and the specified contact is inexistent;
 */
public class MobileException extends Exception {

    /**
     * Prints a specific message when a MobileException is thrown.
     *
     * @param message the string message which gives information about
     *                the event which triggered the Exception;
     */
    public MobileException(String message) {
        super(message);
    }
}
