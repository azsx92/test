package org.example.controller;

public class Parant
{

     static int member_id ;
     static String name ;

     static {
        member_id = 1;
        name = "정평화";
     }

     public Parant() {
         System.out.println("기본 생성자");
     }

     static void read( ) {
        System.out.println("아이디 :" + member_id + " " +"이름 : "+name);
    }

    static String save( ) {
        System.out.println("아이디 :" + member_id + " " +"이름 : "+name);
        return "저장 완료";
    }
    static String put(int member_id , String name) {
        if (member_id == member_id) {
            System.out.println("아이디 :" + member_id + " " + "이름 : " + name);
        } else {
            System.out.println("아이디 :" + member_id + " " + "이름 : " + name);
        }
        return "수정 완료";
    }

    static String delete(int member_id ) {
        if (member_id == member_id) {
            String name = null;
            System.out.println("아이디 :" + member_id + " " + "이름 : " + name);
        } else {
            System.out.println("아이디기 틀려서 삭제할 수 없습니다." );
        }
        return "삭제 완료";
    }
}
