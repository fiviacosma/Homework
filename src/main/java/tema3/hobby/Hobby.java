package tema3.hobby;

import tema3.hobby.Address.Address;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String hobbyName;
    List<Address> hobbyAdressList = new ArrayList<>();
    private int hobbyFrequency;

    public Hobby(String hobbyName, int hobbyFrequency) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;


    }

    public void setHobbyAdressList(Address address){
        hobbyAdressList.add(address);
    }
}
