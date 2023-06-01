import controller.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //싱글톤
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(sc);
        while (true) controller.selectMode();
    }
}