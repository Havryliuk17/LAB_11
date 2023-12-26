package task2;

import com.mailjet.client.errors.MailjetException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailSenderTest {

    @Test
    void sendMail() throws MailjetException {
        GiftMail giftMail = new GiftMail();
        Client client = new Client("Olha", 19, Gender.MALE, "Olha.havryliuk@ucu.edu.ua");
        MailInfo mailInfo = new MailInfo(client, giftMail);
        assertEquals(389, MailSender.sendMail(mailInfo));
    }
}