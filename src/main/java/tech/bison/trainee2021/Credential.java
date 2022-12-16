package tech.bison.trainee2021;

public class Credential {
    private String title;
    private String username;
    private String password;
    private String notes;
    private String url;

    public Credential(String title) {
        this.title = title;
    }

    public Credential(String title, String password) {
        this.title = title;
        this.password = password;
    }

    public Credential(String title, String username, String password) {
        this.title = title;
        this.username = username;
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNotes() {
        return notes;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
