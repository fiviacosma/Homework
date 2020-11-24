package tema3.person;

import tema3.hobby.Hobby;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<Hobby> hobbyList = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setHobbyList(Hobby hobby) {
        hobbyList.add(hobby);
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

//    @Override
//    public boolean equals(Object o){
//
//    }

}
