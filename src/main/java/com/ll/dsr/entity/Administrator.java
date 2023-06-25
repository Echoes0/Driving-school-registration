package com.ll.dsr.entity;


import com.baomidou.mybatisplus.annotation.TableId;

public class Administrator {

  @TableId
  private long administratorNumber;
  private long notificationNumber;
  private long drivingSchoolNumber;
  private String administratorName;
  private String administratorAddress;
  private String administratorContactInformation;
  private String theDrivingSchoolToWhichTheAdministratorBelongs;
  private String password;


  public Administrator(long administratorNumber, String password) {
    this.administratorNumber = administratorNumber;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getAdministratorNumber() {
    return administratorNumber;
  }

  public void setAdministratorNumber(long administratorNumber) {
    this.administratorNumber = administratorNumber;
  }


  public long getNotificationNumber() {
    return notificationNumber;
  }

  public void setNotificationNumber(long notificationNumber) {
    this.notificationNumber = notificationNumber;
  }


  public long getDrivingSchoolNumber() {
    return drivingSchoolNumber;
  }

  public void setDrivingSchoolNumber(long drivingSchoolNumber) {
    this.drivingSchoolNumber = drivingSchoolNumber;
  }


  public String getAdministratorName() {
    return administratorName;
  }

  public void setAdministratorName(String administratorName) {
    this.administratorName = administratorName;
  }


  public String getAdministratorAddress() {
    return administratorAddress;
  }

  public void setAdministratorAddress(String administratorAddress) {
    this.administratorAddress = administratorAddress;
  }


  public String getAdministratorContactInformation() {
    return administratorContactInformation;
  }

  public void setAdministratorContactInformation(String administratorContactInformation) {
    this.administratorContactInformation = administratorContactInformation;
  }


  public String getTheDrivingSchoolToWhichTheAdministratorBelongs() {
    return theDrivingSchoolToWhichTheAdministratorBelongs;
  }

  public void setTheDrivingSchoolToWhichTheAdministratorBelongs(String theDrivingSchoolToWhichTheAdministratorBelongs) {
    this.theDrivingSchoolToWhichTheAdministratorBelongs = theDrivingSchoolToWhichTheAdministratorBelongs;
  }

}
