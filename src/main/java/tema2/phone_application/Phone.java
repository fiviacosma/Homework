package tema2.phone_application;

import java.util.ArrayList;
import java.util.List;

public class Phone implements PhoneBehavior {

    Contacts contactList = new Contacts();
    SentMessage messageArchive = new SentMessage();
    List<String> callList = new ArrayList<>();


    public void addContact(int nrCrt, String phoneNumber, String firstName, String lastName) {

        contactList.addNrCrtToList(nrCrt);
        contactList.addPhoneNumberToList(phoneNumber);
        contactList.addFirstNameToList(firstName);
        contactList.addLastNameToList(lastName);

    }

    public void listContacts() {

        for (int i = 0; i <= contactList.nrCrtList.size() - 1; i++) {
            System.out.print(contactList.nrCrtList.get(i).toString() + " ");
            System.out.print(contactList.phoneNumberList.get(i).toString() + " ");
            System.out.print(contactList.firstNameList.get(i).toString() + " ");
            System.out.println(contactList.lastNameList.get(i).toString());
        }


    }

    public void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() > 500) {
            System.out.println("Message is too long, please use max 500 charcters".toString());

        } else {

            messageArchive.addPhoneNumberToList(phoneNumber);
            messageArchive.addMessageToList(messageContent);

        }

    }

    public void listMessages(String phoneNumber) {

        System.out.println("Messages sent to " + phoneNumber + " dssare:");
        for (int i = 0; i <= messageArchive.phoneNumberList.size() - 1; i++) {

            if (messageArchive.phoneNumberList.get(i) == phoneNumber) {
                System.out.println(messageArchive.sentMessagesList.get(i).toString());
            }
        }
    }

    public void makeACall(String phoneNumber) {

        callList.add(phoneNumber);

    }


    public void seeAllCallsHistory() {

        for (int i = 0; i <= callList.size() - 1; i++) {
            System.out.println(callList.get(i));
        }


    }

    public String getContactPhoneNumber(int position) {

        return contactList.phoneNumberList.get(position - 1);

    }
}
