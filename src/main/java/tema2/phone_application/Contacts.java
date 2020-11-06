package tema2.phone_application;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

    List<Integer> nrCrtList = new ArrayList<>();
    List<String> phoneNumberList = new ArrayList<>();
    List<String> firstNameList = new ArrayList<>();
    List<String> lastNameList = new ArrayList<>();

    public void addNrCrtToList(int nrCrt){
        nrCrtList.add(nrCrt);
    }

    public void addPhoneNumberToList(String phoneNumber) {
        phoneNumberList.add(phoneNumber);
    }

    public void addFirstNameToList(String firstName) {
        firstNameList.add(firstName);
    }

    public void addLastNameToList(String lastName) {
        lastNameList.add(lastName);
    }

}
