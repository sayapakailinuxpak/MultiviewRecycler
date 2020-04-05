package com.eldisprojectcodelabs.multiviewrecycler.model;

public class GroupModel {
    private String groupTitle;
    private String groupButtonTitle;

    public GroupModel() {
    }

    public GroupModel(String groupTitle, String groupButtonTitle) {
        this.groupTitle = groupTitle;
        this.groupButtonTitle = groupButtonTitle;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public String getGroupButtonTitle() {
        return groupButtonTitle;
    }

    public void setGroupButtonTitle(String groupButtonTitle) {
        this.groupButtonTitle = groupButtonTitle;
    }
}
