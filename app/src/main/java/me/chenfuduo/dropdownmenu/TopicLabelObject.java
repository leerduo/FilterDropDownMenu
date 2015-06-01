package me.chenfuduo.dropdownmenu;

/**
 * Created by Administrator on 2015/5/28.
 *
 * 标签实体类
 */
public class TopicLabelObject {

    public int id;
    public int count;
    public String name;

    public TopicLabelObject(int id, int count, String name) {
        this.id = id;
        this.count = count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
