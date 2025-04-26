package com.example.thiKTNC;

import java.util.ArrayList;
import java.util.List;

public class service {
    private List<student> list = new ArrayList<>();

    public student add(student student) throws Exception {
        String name = student.getName();
        if (name.matches(".*\\d.*")){
            throw new Exception("ten khong chua so");
        }else if (!name.matches("[a-zA-Z\\s]+")){
            throw new Exception("ten khong chua ki tu dac biet");
        }
        else{
            list.add(student);
        }
        return student;
    }
    public List<student> timTen(String ten){
        List<student> kq = new ArrayList<>();

        for (student student: list
             ) {
            if (student.getName().equalsIgnoreCase(ten)){
                kq.add(student);
            }
        }
        return kq;
    }
}
