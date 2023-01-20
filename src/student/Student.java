/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author sverdejo
 */
public class Student {
    private String studentId;
    private String studentName;
    
    Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public String toString() {
        return "ID: " + studentId + ", Name: " + studentName;
    }
} //end of class