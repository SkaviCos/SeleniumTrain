package ru.trainjava.sandbox;

class Pet {

  private String birthDate;
  protected String name;

  public String getBirthDate() {
    return birthDate;
  }

  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }
}

class Caty extends Pet {
  @Override
  public String getBirthDate() {
    return super.getBirthDate();
  }

  @Override
  public String getName() {
    return super.getName();
  }

}