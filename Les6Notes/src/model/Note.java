package model;

public class Note {
    private Integer id;
    private String data;
    private String title;
    private String text;

    public Note(Integer id, String data, String title, String text) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nDate: %s\nTitle: %s\nText: %s\n", getId(), getData().toString(), getTitle(), getText());
    }
}
