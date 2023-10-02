package model;

import java.util.Date;

public class Reply {
    public String replyBody;
    public User author;
    public Date timeLodged;

    public Reply(String replyBody, User author) {
        this.replyBody = replyBody;
        this.author = author;
        this.timeLodged = new Date();
    }
}
