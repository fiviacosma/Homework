package tema2.phone_application;

import java.util.ArrayList;
import java.util.List;

public class SentMessage {

    List<String> sentMessagesList = new ArrayList<>();
    List<String> phoneNumberList = new ArrayList<>();

    public void addMessageToList(String message) {
        sentMessagesList.add(message);
    }
    public void addPhoneNumberToList(String phoneNumber) {
        phoneNumberList.add(phoneNumber);
    }




}
