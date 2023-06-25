package com.ll.dsr.entity;


import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Timestamp;

public class Orders {

  @TableId
  private long orderNumber;
  private long courseNumber;
  private long studentNumber;
  private long administratorNumber;
  private java.sql.Timestamp orderTime;

  private int theoreticalHours;
  private int practicalHours;

  public Orders(long orderNumber, long courseNumber, long studentNumber, long administratorNumber,
                Timestamp orderTime, int theoreticalHours, int practicalHours) {
    this.orderNumber = orderNumber;
    this.courseNumber = courseNumber;
    this.studentNumber = studentNumber;
    this.administratorNumber = administratorNumber;
    this.orderTime = orderTime;
    this.theoreticalHours = theoreticalHours;
    this.practicalHours = practicalHours;
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

  public long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public long getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(long courseNumber) {
    this.courseNumber = courseNumber;
  }


  public long getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(long studentNumber) {
    this.studentNumber = studentNumber;
  }


  public long getAdministratorNumber() {
    return administratorNumber;
  }

  public void setAdministratorNumber(long administratorNumber) {
    this.administratorNumber = administratorNumber;
  }


  public java.sql.Timestamp getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Timestamp orderTime) {
    this.orderTime = orderTime;
  }

}
