package teamwork_01122022;

import java.util.Arrays;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        // int[] numbers = {4, 9, 1, 3, 2, 8, 7, 0, 6, 5}; listeyi sıralayarak ekrana yazdırınız.
        // double [] num= {3.52 , 4.89, 7.52, 7.55, 9.10}; listeyi sıralayarak ekrana yazdırınız.
        // String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"}; alfabetik sıraya göre sıralayark ekrana yazdırınız.
        // String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"}; tersten alfabetik olarak sıralayınız.

        // Bir employee sınıfı oluşturunuz. private name, age ve salary alanları olacaktır.
        // Constructor ve gettersetter kurunuz.
        // main app içerisine 4 elemanlı bir EmployeeList oluşturunuz ve içine
        // değerleri atama yapınız.
        // 1- çalışanları maaşlarına göre
        // 2- isimlerine göre sıralayınız.
        // Employee sınıfından liste dışında 5.bir nesne oluşturunuz ve bu nesneyi kopyalayanız.

//        int[] numbers = {4, 9, 1, 3, 2, 8, 7, 0, 6, 5};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        double [] num= {3.52 , 3.89, 7.52, 4.55, 5.10};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
//        String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//        Arrays.sort(fruits, Collections.reverseOrder());
//        System.out.println(Arrays.toString(fruits));

        Employee[] employeeList = new Employee[4];

        employeeList[0]= new Employee("Engin", 36, 20000);
        employeeList[1]= new Employee("Ahmet", 50, 30000);
        employeeList[2]= new Employee("Osman", 45, 75000);
        employeeList[3]= new Employee("Hakkı", 28, 15000);

        Arrays.sort(employeeList);
        System.out.println(Arrays.toString(employeeList));

        Employee employee5 = new Employee("Ali", 33, 45000);
        Employee employee6= employee5.clone();
        System.out.println(employee6);
    }
}
