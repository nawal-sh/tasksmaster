package com.dandelion.tasksmaster;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserTasks {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "title")
    public String title;

    @ColumnInfo(name = "body")
    public String body;

    @ColumnInfo(name = "state")
    public String state;

    @ColumnInfo(name = "image")
    public String image;


    @ColumnInfo(name = "Longitude")
    public String Longitude;


    @ColumnInfo(name = "Latitude")
    public String Latitude;

    public UserTasks(){

    }
    public UserTasks(String title, String body, String state, String image) {
        this.title = title;
        this.body = body;
        this.state = state;
        this.image=image;
    }
}
