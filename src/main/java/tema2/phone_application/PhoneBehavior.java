package tema2.phone_application;

public interface PhoneBehavior {

    void addContact(int nrCrt, String phoneNumber, String firstName, String lastName);

    void listContacts();

    void sendMessage(String phoneNumber, String messageContent);

    void listMessages(String phoneNumber);

    void makeACall(String phoneNumber);

    void seeAllCallsHistory();

    String getContactPhoneNumber(int position);

}
