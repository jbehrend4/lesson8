
package lab1;

public class Driver {
    public static void main(String[] args) {
        course aJava = new AdvancedJavaCourse("Advanced Java Programming", "201-500");
        course iJava = new IntroJavaCourse("Introduction to Java", "101-300");
        course iProgramming = new IntroToProgrammingCourse("Introduction to Programming", "001-100");
        
        aJava.setCredits(3.0);
        iJava.setPrerequisites(iProgramming.getCourseName());
        iProgramming.setCredits(3.0);
        
        System.out.println(aJava.getCredits());
        System.out.println(iJava.getPrerequisites());
        System.out.println(iProgramming.getCredits());
        
        /**
                * Using the Liskov Substitution Principle is useful when the classes you are inheriting need similar information in their constructors.
                * It's not useful when the number and type of properties in the classes are different because it is harder to keep track of what type
                * of information you need for each class.
                */
    }
}
