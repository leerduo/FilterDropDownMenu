package me.chenfuduo.dropdownmenu;



/**
 * Created by Administrator on 2015/5/28.
 */
public class TopicObject {

    private int id;

    private int icon;

    private String desc;

    private String name;

    private String time;

    private int commentCount;

    public TopicLabelObject labels;


    public TopicObject(int icon, String desc, String name, String time, int commentCount, TopicLabelObject labels) {
        this.icon = icon;
        this.desc = desc;
        this.name = name;
        this.time = time;
        this.commentCount = commentCount;
        this.labels = labels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public TopicLabelObject getLabels() {
        return labels;
    }

    public void setLabels(TopicLabelObject labels) {
        this.labels = labels;
    }
}
