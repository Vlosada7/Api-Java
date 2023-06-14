package com.first_api.first_api.Model;

public class Product {
  // First step:
  
  //#region Atributes
  private Integer id;

  private String name;

  private Integer quantity;

  private Double price;

  private String obs;
  //#endregion

  // Rigth-click -> Source action -> Generate getters and setters -> Chose for those you want create 
  //#region Getters and Setters
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getObs() {
    return obs;
  }

  public void setObs(String obs) {
    this.obs = obs;
  }
  //#endregion

}
