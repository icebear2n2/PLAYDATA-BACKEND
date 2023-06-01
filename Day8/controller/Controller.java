package controller;

import service.Service;

import java.util.Scanner;

public class Controller {
    private final Scanner sc;
    // 여러 개를 안 만드니 자원적 이득
    private final Service service;

    public Controller(Scanner sc) {
        this.sc = sc;
        service = Service.getInstance();
    }

    /***
     * 기능 : 모드를 찾아 검색한다
     * @param i None
     * @return None
     */
    // 유저가 볼 곳
    public void selectMode() {
        int mode;
        try {
            mode = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            mode = 0;
        }
        if (mode == 1) {// TODO: insert 기능 만들 것
            service.insert(sc.nextInt());


        } else if (mode == 2) {
            // TODO : 전체 찾기 기능 만들 것
        } else if (mode == 3) {
            // TODO: 인덱스를 입력 받아 찾는 것
        } else {
//            TODO: selectMode 다시 실행
        }
    }
}
