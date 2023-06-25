package com.ll.dsr.entity;


public class Notice {

  private long notificationNumber;
  private long administratorNumber;
  private java.sql.Timestamp notificationTime;
  private String notificationContent;


  public long getNotificationNumber() {
    return notificationNumber;
  }

  public void setNotificationNumber(long notificationNumber) {
    this.notificationNumber = notificationNumber;
  }


  public long getAdministratorNumber() {
    return administratorNumber;
  }

  public void setAdministratorNumber(long administratorNumber) {
    this.administratorNumber = administratorNumber;
  }


  public java.sql.Timestamp getNotificationTime() {
    return notificationTime;
  }

  public void setNotificationTime(java.sql.Timestamp notificationTime) {
    this.notificationTime = notificationTime;
  }


  public String getNotificationContent() {
    return notificationContent;
  }

  public void setNotificationContent(String notificationContent) {
    this.notificationContent = notificationContent;
  }

}
