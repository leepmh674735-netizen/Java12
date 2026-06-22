package classex;

import classpart.Person;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceTest {
    public static void main(String[] args) 
            throws ClassNotFoundException,
                  InstantiationException, 
                     IllegalAccessException, 
                      IllegalArgumentException, 
                     InvocationTargetException, 
                   NoSuchMethodException, 
                   SecurityException {
        
        Person person1 = new Person();
        System.out.println(person1);
        
        Class<?> pClass = Class.forName("classpart.Person");
        Person person2 = (Person) pClass.getDeclaredConstructor().newInstance();
        System.out.println(person2);
    }
}