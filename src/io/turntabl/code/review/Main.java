package io.turntabl.code.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> oldUsers = Arrays.asList(
                "Alex",
                "David",
                "Yaa"
        );

        List<String> users = new ArrayList<>();
        for(String oldUser : oldUsers){
            users.add(oldUser);
        }

        addUser("Yaa", users);

        System.out.println("\n");
        removeLastUser(users);

    }

    public static String addUser(String newUser, List<String> users){
        users.add(newUser);

        if(users.size() <= 0){
            System.out.println("There are no Users in the Database");
        }else {
            for(String user : users){
                System.out.println(user);
            }
        }
        return null;
    }

    public static String removeLastUser(List<String> users){
        users.remove(users.size() - 1);

        if(users.size() <= 0){
            System.out.println("There are no Users in the Database");
        }else {
            for(String user : users){
                System.out.println(user);
            }
        }
        return null;
    }

}


