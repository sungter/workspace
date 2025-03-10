package practice;

import java.util.Arrays;

//기본자료형을 제외한 모든 자료형은 기본 초기값 : null
public class Song {
  String songTitle;
  String artist;
  String album;
  int year;
  String[] composer;

  public void setAllInfo(String songTitle, String artist , String album, int year, String[] composer){
    this.songTitle = songTitle;
    this.artist = artist;
    this.album = album;
    this.year = year;
    this.composer = composer;
  }

  public void printAllInfo(){
    System.out.println("노래 제목 : " + songTitle);
    System.out.println("가수 : " + artist);
    System.out.println("앨범 : " + album);
    System.out.println("발매 연도 : " + year);
    System.out.println("작곡가 : " + Arrays.toString(composer));
  }

}
