package com.company;

public class JobLeadsList {

    private Node head;
    private Node tail;

    public JobLeadsList(Node head , Node tail){
        head = null;
        tail = null;
    }

    public JobLeadsList() {

    }


    public void add_to_front(String company_name, String contact_name, String contact_phone, String job_title, String job_description)
    {
        JobLead jl = new JobLead(company_name, contact_name, contact_phone, job_title, job_description);

        // Node object
        Node n1 = new Node();

        // update the node object
        n1.lead = jl;
        n1.next = null;
        n1.prev = null;

        // update tail if it is null
        if (tail == null) {
            tail = n1;
        }

        // update head
        if (head == null) {
            head = n1;
        } else {
            n1.next = head;
            head.prev = n1;
            head = n1;
        }
        System.out.println("Node added at Head");
    }
    void add_to_tail(String company_name, String contact_name, String contact_phone, String job_title, String job_description) {
        JobLead jl = new JobLead(company_name, contact_name, contact_phone, job_title, job_description);


        Node n1 = new Node();


        n1.lead = jl;
        n1.next = null;
        n1.prev = null;


        if (head == null) {
            head = n1;
        }


        if (tail == null) {
            tail = n1;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            n1.prev = temp;
            temp.next = n1;
            tail = n1;
        }


        System.out.println("Node Added Successfully at Tail");
    }

    public void remove_lead(String company_name, String job_title) {
        if (head == null) {
            System.out.println("List is Empty");
        } else {

            Node current = head;

            while (current != null) {
                if (current.lead.getCompany_name().matches(company_name) && current.lead.getJob_title().matches(job_title)) {
                    break;
                } else {
                    current = current.next;
                }
            }

            if (current != null) {

                if (current != head) {

                    Node previousNode = current.prev;
                    previousNode.next = current.next;
                } else {
                    head = current.next;
                }

                if (current != tail) {

                    Node nextNode = current.next;
                    nextNode.prev = current.prev;

                } else {
                    tail = current.prev;
                }

                current.next = null;
                current.prev = null;
            } else {
                System.out.println("Required data does not found..");
            }
        }
    }
    public void print_head_to_tail() {


        if (head == null) {
            System.out.println("List is Empty");
        } else {


            Node current = head;

            while (current != null) {

                System.out.println(current.lead);
                current = current.next;
            }
        }
    }


    public void print_tail_to_head() {

        // if list is empty
        if (head == null) {
            System.out.println("List is Empty");
        } else {

            // traverse through list
            Node current = tail;

            while (current != null) {
                // print JobLead object
                System.out.println(current.lead);
                current = current.prev;
            }
        }
    }
}

