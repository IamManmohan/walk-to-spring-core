package org.spring.core;

import org.spring.core.collection.Employee;
import org.spring.core.constructor.injection.Person;
import org.spring.core.reference.DetailedAddress;
import org.spring.core.reference.PinCode;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "config.xml"
        );

        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);

        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1);

        Student student2 = (Student) applicationContext.getBean("student2");
        System.out.println(student2);

        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeePhoneNumber());
        System.out.println(employee.getEmployeeAddress());
        System.out.println(employee.getCourse());
        System.out.println(employee);

        DetailedAddress detailedAddress = (DetailedAddress) applicationContext.getBean("detailedAddress");
        PinCode pinCode = (PinCode) applicationContext.getBean("pinCode");
        System.out.println(detailedAddress.getPinCode().getPinCode());
        System.out.println(detailedAddress);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

    }
}
