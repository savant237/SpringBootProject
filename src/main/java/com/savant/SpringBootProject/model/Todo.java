package com.savant.SpringBootProject.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Todo {
  private int id;
  @NotNull
  private String user;
  @Size(min=9, message="Enter atleast 10 Characters")
  private String desc;
  private Date targetDate;
  private boolean isDone;
  public Todo(){
	  
  }
  
  public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {
    super();
    this.id = id;
    this.user = user;
    this.desc = desc;
    this.targetDate = targetDate;
    this.isDone = isDone;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }
  public Date getTargetDate() {
    return targetDate;
  }
  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }
  public boolean isDone() {
    return isDone;
  }
  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

}
