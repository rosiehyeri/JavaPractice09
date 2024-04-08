package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 친구 정보를 저장할 ArrayList 생성
		ArrayList<Friend> friendList = new ArrayList<>();

		// 친구 정보 입력 받기
		for (int i = 0; i < 3; i++) {
			String line = scanner.nextLine(); // 한 줄 입력
			String[] data = line.split(",");
//   		System.out.println("친구를 3명 등록해 주세요");
//    		System.out.println("이름: ");
//    		String name = scanner.next();
//    		System.out.println("핸드폰: ");
//    		String hp = scanner.next();
//    		System.out.println("학교: ");
//    		String school = scanner.next();

			// 입력받은 정보로 Friend 객체 생성하여 ArrayList에 추가
			Friend friend = new Friend(data[0], data[1], data[2]);

			// 리스트에 추가
			friendList.add(friend);

		}

		// 입력받은 친구 정보 출력
//    	for (Friend friend : friendList) {
//    		System.out.println("이름: " + friend.getName() + " 핸드폰: " + friend.getHp() + " 학교: " + friend.getSchool());
//    	}

		Iterator<Friend> it = friendList.iterator();
		while (it.hasNext()) {
			Friend item = it.next();
			item.showInfo();
		}

		scanner.close();

	}

}
