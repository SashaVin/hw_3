package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook{

    public List<Record> list = new ArrayList<>();

    public List<Record> getAllRecords(){
        return this.list;
    }

    public void createRecord(Record record) throws PhoneNumberAlreadyExists{
        for (Record i: list){
            if (record.getPhoneNum() == i.getPhoneNum()) throw new PhoneNumberAlreadyExists("Запись с таким номером уже существует");
        }
        this.list.add(record);
    }

    public void updateRecord(Record record) throws RecordNotFound, RecordNotValid{
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (Record i: list){
            if (record.getId() == i.getId()){
                count++;
                System.out.println("Введите новое имя: ");
                String name = sc.nextLine();
                if (name == "") {
                    throw new RecordNotValid("Вы не ввели имя...");
                }
                record.setName(name);
                System.out.println("Введите новый номер телефона: ");
                String num = sc.nextLine();
                if (num == "") {
                    throw new RecordNotValid("Вы не ввели номер телефона...");
                }
                record.setPhoneNum(num);
            }
            if (count == 0) {
                throw new RecordNotFound("Такого идентификатора не существует");
            }
        }
    }

    public void deleteRecord(long id) throws RecordNotFound{
        int count = 0;
        for (Record i: list) {
            if (id == i.getId()) {
                count++;
                list.remove(i);
            }
        }if (count == 0) {
            System.out.println("sdfewf");
            throw new RecordNotFound("Подходящая запись в справочнике не найдена");
        }

    }

}
//ghk
