package com.codebay.goldeneye;
import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import  javax.validation.constraints.Size;


public class EmailNew  {

  @NotNull(message="The name is required")
  @Size(min = 3, message="The name must be at least 3 characters long")
  private String name;

  @NotNull(message="The name is required")
  @Size(min = 3, message="The surname must be at least 3 characters long")
  private String surnames;

  private List<String> listOfficeLocation = Arrays.asList("Spain","Milan","New York");
  private String officeLocation;
  private String departament;

  public String getName(){
      return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getSurnames(){
    return surnames;
  }

  public void setSurnames(String surnames){
    this.surnames = surnames;
  }

  public List<String> getListOfficeLocation(){
    return listOfficeLocation;
  }

  public void setListOfficeLocation(List<String> listOfficeLocation){
    this.listOfficeLocation = listOfficeLocation;
  }

  public String getOfficeLocation(){
    return officeLocation;
  }

  public void setOfficeLocation(String officeLocation){
    this.officeLocation = officeLocation;
  }

  public String getDepartament(){
    return departament;
  }

  public void setDepartament(String departament){
    this.departament = departament;
  }


}