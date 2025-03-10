package list_practice;

public class Student {
  private String name;
  private int korscore;
  private int engscore;
  private int sum;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKorscore() {
    return korscore;
  }

  public void setKorscore(int korscore) {
    this.korscore = korscore;
  }

  public int getEngscore() {
    return engscore;
  }

  public void setEngscore(int engscore) {
    this.engscore = engscore;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public Student(String name, int korscore, int engscore) {
    this.name = name;
    this.korscore = korscore;
    this.engscore = engscore;
    this.sum = korscore + engscore;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", korscore=" + korscore +
            ", engscore=" + engscore +
            ", sum=" + sum +
            '}';
  }
}
