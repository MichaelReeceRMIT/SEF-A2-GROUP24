package model;

public class User {
    public void makeEnquiry(String subject, String body) {
        Enquiry.listOfQueries.add(new Enquiry(subject, body, this));
    }
}
