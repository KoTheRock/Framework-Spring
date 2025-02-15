package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Илья", "Катышов", 24 );
        System.out.println("!");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = new gson.toJson(person);
        System.out.println("Сериализованный JSON:\n" + json);

        Person desPerson = new gson.fromJson(json, Person.class);
        System.out.println("Десериализованный объект: " + deserializedPerson);
        }
    }
