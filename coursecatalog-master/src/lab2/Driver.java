/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author jbehrend4
 */
public class Driver {    public static void main(String[] args) {
        Course aJava = new AdvancedJavaCourse("Advanced Java Programming", "201-500");
        Course iJava = new IntroJavaCourse("Introduction to Java", "101-300");
        Course iProgramming = new IntroToProgrammingCourse("Introduction to Programming", "001-100");
        
        aJava.setCredits(3.0);
        iJava.setCourseNumber("101-300");
        iProgramming.setCredits(3.0);
        
        System.out.println(aJava.getCredits());
        System.out.println(iJava.getCourseNumber());
        System.out.println(iProgramming.getCredits());
    }
}