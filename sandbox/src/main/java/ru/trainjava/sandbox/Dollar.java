package ru.trainjava.sandbox;

class Dollar{
  // your code goes here(variable count)
  int count=0;

  public Dollar(){
//    this.count=count;

   Dollar.getMoney();
    System.out.println(count);

    }
    public static void getMoney(){
    for(int i = 0; i < 1000; i++){
      new Dollar();
    }
  }

  public static void main(String[] args) {
    Dollar d = new Dollar();

  }
}