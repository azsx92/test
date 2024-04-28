package org.example.controller;


public class Child extends Parant {


    public Child( int i, String name) {
        this.member_id = i;
        this.name = name;
    }

    public static void main(String[] args) {
          Child ch = new Child(2, "22");
          read();
          put(1, "23");
          delete(2);
    }
}
