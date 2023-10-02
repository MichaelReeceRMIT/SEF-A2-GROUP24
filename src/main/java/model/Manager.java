package model;

import java.util.List;

public class Manager extends Administrator {
    public List<Enquiry> checkSystemQueries() {
        return Enquiry.listOfQueries;
    }

    public void addressQueries(Enquiry enquiry, String replyBody) {
        Reply reply = new Reply(replyBody, this);

        for (Enquiry e:Enquiry.listOfQueries) {
            if (e == enquiry) {
                e.replies.add(reply);
            }
        }
    }
}
