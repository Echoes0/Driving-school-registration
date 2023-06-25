package com.ll.dsr.entity;


import com.baomidou.mybatisplus.annotation.TableId;

public class Course {

  @TableId
  private long courseNumber;
  private long orderNumber;
  private long coachNumber;
  private String courseName;
  private String courseDescription;
  private String courseRequirements;
  private int theoreticalHours;
  private int practicalHours;
  private int totalHours;


  public long getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(long courseNumber) {
    this.courseNumber = courseNumber;
  }


  public long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public long getCoachNumber() {
    return coachNumber;
  }

  public void setCoachNumber(long coachNumber) {
    this.coachNumber = coachNumber;
  }


  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }


  public String getCourseDescription() {
    return courseDescription;
  }

  public void setCourseDescription(String courseDescription) {
    this.courseDescription = courseDescription;
  }


  public String getCourseRequirements() {
    return courseRequirements;
  }

  public void setCourseRequirements(String courseRequirements) {
    this.courseRequirements = courseRequirements;
  }


  public int getTheoreticalHours() {
    return theoreticalHours;
  }

  public void setTheoreticalHours(int theoreticalHours) {
    this.theoreticalHours = theoreticalHours;
  }


  public int getPracticalHours() {
    return practicalHours;
  }

  public void setPracticalHours(int practicalHours) {
    this.practicalHours = practicalHours;
  }


  public int getTotalHours() {
    return totalHours;
  }

  public void setTotalHours(int totalHours) {
    this.totalHours = totalHours;
  }

}
