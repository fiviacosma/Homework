package tema2.user;

import tema2.models.Iphone12;
import tema2.models.IphoneX;
import tema2.phone_application.Phone;

public class Main {
    public static void main(String... args){

        Phone fiviaPhone = new Iphone12("Fivia's Phone");
        Phone catalinPhone = new IphoneX("Catalin's Phone");

        fiviaPhone.addContact(1,"0746929385","Fivia","Cosma");
        fiviaPhone.addContact(2,"0740167813","Catalin", "Suciu");
        catalinPhone.addContact(1,"0744661966","Maria", "Cosma");

        fiviaPhone.makeACall(fiviaPhone.getContactPhoneNumber(2));
        catalinPhone.sendMessage(catalinPhone.getContactPhoneNumber(1),"Hai acasa");

        catalinPhone.listMessages("0744661966");
        fiviaPhone.listContacts();
        fiviaPhone.seeAllCallsHistory();


    }

}
