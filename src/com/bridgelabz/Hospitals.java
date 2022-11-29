package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospitals {

    private ArrayList<Patients> PatentsList;

    public Hospitals() {
        ArrayList<Patients> Patients = new ArrayList<Patients>();
    }

    public void addPatients(Patients createPerson) {
        System.out.println("Adding a new contact for " + createPerson);
        PatentsList.add(createPerson);
        System.out.println((createPerson));
    }

    public Patients getPatientsInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter State: ");
        String State = sc.nextLine();
        System.out.println("Enter Department: ");
        String Department = sc.nextLine();
        System.out.println("Enter phoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        Patients patients = new Patients(Name, State, Department, phoneNumber, age);
        return patients;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Hospital Program");
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        Hospitals hs = new Hospitals();

        while (true) {
            System.out.println("1.Adding Patients Details \n2.Exit");
            System.out.println("Enter your Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                Patients patients = hs.getPatientsInput();
                hs.addPatients(patients);
                    System.out.println("Patients Details Added Successfully ");
                    break;

                case 2:
                    System.out.println("Thank you for view Patients Details ");
                    return;

                default:
                    System.out.println("Sorry you are type the wrong choice");
            }
        }
    }
}
