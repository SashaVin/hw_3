package com.company;

public class Main {

    public static void main(String[] args) throws PhoneNumberAlreadyExists {
        Record p1 = new Record(23,"88005553535", "Prosto");
        Record p2 = new Record(24,"88005553536", "Sredne");
        Record p3 = new Record(25,"88005553537", "Slogno");
        Record p4 = new Record(26,"88005553538", "AAAAAA");

        PhoneBook phoneBook = new PhoneBook();
        try{
            phoneBook.createRecord(p1);
            phoneBook.createRecord(p2);
            phoneBook.createRecord(p3);
            phoneBook.createRecord(p4);
        } catch (PhoneNumberAlreadyExists err) {
            System.out.println("ERROR");
            throw err;
        }
        System.out.println(phoneBook.getAllRecords());
        phoneBook.updateRecord(p1);
        System.out.println(phoneBook.getAllRecords());
        phoneBook.deleteRecord(25);
        System.out.println(phoneBook.getAllRecords());
        //chek
    }
}