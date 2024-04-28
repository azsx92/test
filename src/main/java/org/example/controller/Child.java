package org.example.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Child {
    // db
    static Map<Integer, String> db = new HashMap<>();

    public static void main(String[] args) {
            while(true){
                int i = 0;
                String name = null;
                Scanner sc = new Scanner(System.in);
                System.out.println("r, c, u, d를 선택하세요.");
                String flag =  sc.next();
                System.out.println("선택하신 건 :" + flag + "입니다.");
                if (flag.equals("c")) {
                    System.out.println("pk를 설정 하시요 :" );
                    i = Integer.parseInt(String.valueOf(sc.next()));
                    System.out.println("pk를 설정:" + i + "입니다.");
                    System.out.println("이름를 설정 하시요 :" );
                    name = sc.next();
                    System.out.println("이름를 설정:" + name + "입니다.");
                    db.put(i, name);
                } else if (flag.equals("r")) {
                    System.out.println("조회할 id ? :");
                    i = Integer.parseInt(String.valueOf(sc.next()));
                    System.out.println("조화할 id:" + i +" 이름은 :" + db.get(i)+ "입니다.");
                } else if (flag.equals("u")) {
                    System.out.println("수정할 id ? :");
                    i = Integer.parseInt(String.valueOf(sc.next()));
                    System.out.println("수정할 이름을 설정 하시요 :" );
                    name = sc.next();
                    System.out.println("이름를 설정:" + name + "입니다.");
                    db.put(i, name);
                } else if (flag.equals("d")) {
                    System.out.println("삭제할 id ? :");
                    i = Integer.parseInt(String.valueOf(sc.next()));
                    System.out.println("삭제 되었습니다.");
                    db.remove(i);
                }
        }
    }


}
