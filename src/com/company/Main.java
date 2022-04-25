package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Node head = null;
        Node tail = null ;
        JobLeadsList jobs = new JobLeadsList();
        int a;
        Scanner sc = new Scanner(System.in);
        String company_name;
        String contact_name;
        String contact_phone;
        String job_title;
        String job_description;

        while (true){
            System.out.println("\n1 - Add lead to head of list");
            System.out.println("2 - Add lead to tail of list");
            System.out.println("3 - Delete a lead");
            System.out.println("4 - Print list from head to tail");
            System.out.println("5 - Print list from tail to head");
            System.out.println("6 - Exit");
            System.out.print("\nEnter Choice: ");

            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Enter company name: ");
                    company_name = sc.next();
                    System.out.print("Enter contact name: ");
                    contact_name = sc.next();
                    System.out.print("Enter contact phone: ");
                    contact_phone = sc.next();
                    System.out.print("Enter job title: ");
                    job_title = sc.next();
                    System.out.print("Enter job description: ");
                    job_description = sc.next();

                    jobs.add_to_front(company_name, contact_name, contact_phone, job_title, job_description);
                    break;
                case 2:
                    System.out.print("Enter company name: ");
                    company_name = sc.next();
                    System.out.print("Enter contact name: ");
                    contact_name = sc.next();
                    System.out.print("Enter contact phone: ");
                    contact_phone = sc.next();
                    System.out.print("Enter job title: ");
                    job_title = sc.next();
                    System.out.print("Enter job description: ");
                    job_description = sc.next();

                    jobs.add_to_tail(company_name, contact_name, contact_phone, job_title, job_description);
                    break;
                case 3:
                    System.out.print("Enter company name: ");
                    company_name = sc.next();
                    System.out.print("Enter job title: ");
                    job_title = sc.next();

                    jobs.remove_lead(company_name, job_title);
                    break;
                case 4:
                    System.out.println("List from head to tail: ");
                    jobs.print_head_to_tail();
                    break;
                case 5:
                    System.out.println("List from tail to head: ");
                    jobs.print_tail_to_head();
                    break;
                case 6:
                    break;

                    default:
                        System.out.print("Error: Please enter a valid choice (1 thru 6)");
            }
        }

    }
}


