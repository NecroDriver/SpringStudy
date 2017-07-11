package com.mafh.model;

/**
 * @author mafh
 * @create 2017-07-11 13:55
 * Created With Intellij IDEA
 */
public class Chapter {
    private Integer id;
    private Integer courseId;
    private Integer order;
    private String title;
    private String descr;

//    private List<Section> sectionList;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
