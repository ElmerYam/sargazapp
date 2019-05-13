package app.elmeryam.com.sargazapp.model;

public class Report {
    private String picture;
    private String name;
    private String description;
    private String status;
    private String date;
    private String time;

    public Report(String picture, String name, String description, String status, String date, String time) {
        this.picture = picture;
        this.name = name;
        this.description = description;
        this.status = status;
        this.date = date;
        this.time = time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
