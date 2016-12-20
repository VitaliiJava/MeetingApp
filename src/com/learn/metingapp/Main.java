package com.learn.metingapp;

import java.io.IOException;
import java.util.Scanner;


/**
 * The class creates a menu for handling information about meting application.
 *
 * @author Vitalii Prykhid
 */

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Meeting meeting = new Meeting();
        while (true) {
            meeting.menu();
            String key = scanner.next();
            switch (key) {
                case "1": {
                    meeting.registration();
                    break;
                }
                case "2": {
                    meeting.showListRegistrationPerson();
                    break;
                }
                case "3": {
                    meeting.showPerson();
                    break;
                }
                case "4": {
                    meeting.searchPersonForFullData();
                    break;
                }
                case "5": {
                    meeting.searchPersonByAge();
                    break;
                }
                case "6":
                    return;
                default:
                    return;
            }
        }
    }
}
