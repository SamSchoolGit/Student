/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author sverdejo
 */
public class StudentList {
    public static void main(String[] args) {
        Student[] studentList = new Student[3];
        
        studentList[0] = new Student("s1", "tim");
        studentList[1] = new Student("s2", "jim");
        studentList[2] = new Student("s3", "sim");
        
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
    } //end of main
} //end of class
