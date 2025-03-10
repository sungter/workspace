package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExamController {

    @PostMapping("/mountData")
    public List<Board> startPostData(@RequestBody Board[] boards){
        List<Board> boardList = new ArrayList<>();

        for (int i = 0 ; i < boards.length ; i++){
            boards[i].setNum(boards.length - i);
            boards[i].setBoardInfo("안녕하세요~");
            boardList.add(boards[i]);
        }
        return boardList;
    }

    @PostMapping("/viewsCnt")
    public Board[] viewsCnt (Board[] boards){
        int cnt;
        for (Board board : boards){
            cnt = board.getViews();
            board.setViews(cnt);
        }
        return boards;
    }


    //시작시 데이터 전송
    @GetMapping("/orderData")
    public Order[] orderData(){
        Order order1 = new Order(0, "데님 청바지", 15000, 2, "aaa");
        Order order2 = new Order(0, "맨투맨 반팔 티셔츠", 10000, 3, "bbb");
        Order order3 = new Order(0, "오버핏 니트", 25000, 2, "ccc");
        Order order4 = new Order(0, "롱 패딩", 55000, 1, "ddd");
        Order order5 = new Order(0, "맨투맨 긴팔 티셔츠", 12000, 3, "eee");

        Order[] orderArr = new Order[5];
        orderArr[0] = order1;
        orderArr[1] = order2;
        orderArr[2] = order3;
        orderArr[3] = order4;
        orderArr[4] = order5;

        for (int i = 0 ; i < orderArr.length ; i++){
            orderArr[i].setProductNum(orderArr.length - i);
        }

        return orderArr;
    }

  
}
