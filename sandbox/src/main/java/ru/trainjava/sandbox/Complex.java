package ru.trainjava.sandbox;

public class Complex {

  private long balance;
  private String ownerName;
  private boolean locked;

  private String title;
  private int yearOfPublishing;
  private String[] authors;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYearOfPublishing() {
    return yearOfPublishing;
  }

  public void setYearOfPublishing(int yearOfPublishing) {
    this.yearOfPublishing = yearOfPublishing;
  }

  public String[] getAuthors() {
    return authors;
  }

  public void setAuthors(String[] authors) {
    this.authors = authors;
  }
}
