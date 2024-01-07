package ru.geekbrains;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Bob", "Stark", 20);
        Person person1 = new Person("Bob", "Stark", 21);

        System.out.println(person);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());

        Gson gson = new Gson();
        String gsonString = gson.toJson(person);
        System.out.println(gsonString);
        Person gsonPerson = gson.fromJson(gsonString, Person.class);
        System.out.println(gsonPerson);

    }
}