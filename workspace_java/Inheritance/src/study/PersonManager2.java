package study;

public class PersonManager2 {
  public static void main(String[] args) {
    //친구 객체가 10개 저장할 수 있는 배열 생성
    Friend[] fs = new Friend[10];
    int cnt = 0;

    fs[cnt++] = new UnivFriend("김자바", "010-1111", "생물학");
    fs[cnt++] = new CompFriend("김사원", "010-2222", "회계부");
    fs[cnt++] = new UnivFriend("이자바", "010-3333", "물리학");
    fs[cnt++] = new CompFriend("박대리님", "010-4444", "인사부");

    //System.out.println(fs.length);

    for (int i = 0 ; i < cnt ; i++){
      //System.out.println(1);
      fs[i].showInfo();
    }

  }
}
