package com.knoldus;

public class ProxyStudent implements College{

    private College college = new OriginalStudent();


    public void attendance(String student)  {
        if(student=="Nikunj"){
            System.out.println("Banned Student");
        }
        else
            college.attendance(student);
    }
}