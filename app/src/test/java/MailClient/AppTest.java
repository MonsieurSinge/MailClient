/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MailClient;

import MailClient.Model.Mail;
import MailClient.Model.POP;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    /*@Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }*/

    @Test
    public void testReceiveMail() {
        POP pop = new POP();
        ArrayList<Mail> mails = (ArrayList<Mail>) pop.receive("pop.gmail.com", "pop3", "mailclienttestjava@gmail.com", "azertyui1.");
        if (!mails.isEmpty()) {
            for (Mail mail :
                    mails) {
                System.out.println(">" + mail.toString() + "\n");
            }
        }
        assertFalse(mails.isEmpty());
    }
}
