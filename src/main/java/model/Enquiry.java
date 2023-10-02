package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Enquiry {
    public static List<Enquiry> listOfQueries = new ArrayList<>();

    public String subject;
    public String enquiryBody;
    public User author;
    public Date timeLodged;
    public boolean closed;
    public List<Reply> replies;


    public Enquiry(String subject, String enquiryBody, User author) {
        this.subject = subject;
        this.enquiryBody = enquiryBody;
        this.author = author;
        this.timeLodged = new Date();
        this.closed = false;
        this.replies = new ArrayList<>();
    }

    public void respond(Reply reply, boolean toClose) {
        replies.add(reply);

        if (toClose) {
            this.closed = true;
        }
    }
}
