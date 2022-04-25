package com.company;

public class JobLead {
    private String company_name;
    private String contact_name;
    private String contact_phone;
    private String job_title;
    private String job_description;


    public JobLead(String company_name, String contact_name, String contact_phone, String job_title, String job_description) {
        this.company_name = company_name;
        this.contact_name = contact_name;
        this.contact_phone = contact_phone;
        this.job_title = job_title;
        this.job_description = job_description;
    }


    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }


    @Override
    public String toString() {
        return "company_name: " + company_name + ", contact_name: " + contact_name + ", contact_phone: " + contact_phone + ", job_title: " + job_title + ", job_description: " + job_description;
    }



}

