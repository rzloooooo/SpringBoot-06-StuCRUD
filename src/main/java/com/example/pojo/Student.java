package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int sid;
    private String sname;
    private int age;
    private String gender;
    private String province;
    private int tuition;
}
