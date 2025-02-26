package hkmu.wadd;

import java.io.Serializable;
import java.util.Date;

public class GuestBookEntry implements Serializable {
    private Integer id;
    private String name;
    private String message;
    private Date date;

    public GuestBookEntry() {
    }

    public GuestBookEntry(Integer id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
        date = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}