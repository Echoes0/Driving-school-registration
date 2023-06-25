package com.ll.dsr.entity;


import com.baomidou.mybatisplus.annotation.TableId;

public class DrivingSchool {

  @TableId
  private long drivingSchoolNumber;
  private String drivingSchoolName;
  private String drivingSchoolAddress;
  private String drivingSchoolContactInformation;
  private String userCode;


  public long getDrivingSchoolNumber() {
    return drivingSchoolNumber;
  }

  public void setDrivingSchoolNumber(long drivingSchoolNumber) {
    this.drivingSchoolNumber = drivingSchoolNumber;
  }


  public String getDrivingSchoolName() {
    return drivingSchoolName;
  }

  public void setDrivingSchoolName(String drivingSchoolName) {
    this.drivingSchoolName = drivingSchoolName;
  }


  public String getDrivingSchoolAddress() {
    return drivingSchoolAddress;
  }

  public void setDrivingSchoolAddress(String drivingSchoolAddress) {
    this.drivingSchoolAddress = drivingSchoolAddress;
  }


  public String getDrivingSchoolContactInformation() {
    return drivingSchoolContactInformation;
  }

  public void setDrivingSchoolContactInformation(String drivingSchoolContactInformation) {
    this.drivingSchoolContactInformation = drivingSchoolContactInformation;
  }


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

}
