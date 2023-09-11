package th.mfu;

import java.util.Date;

public class Concert {

    //TODO: add attributes
    private String title;
    private String description;
    private Date date;
    private int id;
    private String performer;
    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.description = description;
    }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTitle() {
        //TODO: return title
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        //TODO: return description
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void put(int id2, Concert concert) {
    }
    public String getPerformer(){
        return performer;
    }
    public void setPerformer(String performer){
        this.performer = performer;
    }



    //TODO: add getters and setters

}
