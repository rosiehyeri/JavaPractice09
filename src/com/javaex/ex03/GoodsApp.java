package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 상품 정보를 저장할 ArrayList 생성
		ArrayList<Goods> goodsList = new ArrayList<>();

		int countOfGoods = 0; // 입력 개수 변수
		System.out.println("상품을 입력해주세요.(종료 q)");

		// 상품 입력 받기
		while (true) {

			String line = scanner.nextLine(); // 스캐너로 한 줄 입력받기

			// 종료 조건 확인
			if (line.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("===========");
				break;
			}

			// 상품 정보 분리
			// 콤마 기준으로 분할하여 goods 객체 생성
			String[] data = line.split(",");

			// 상품 객체 생성하여 ArrayList에 추가
			String name = data[0].trim();
			int price = Integer.parseInt(data[1].trim());
			int count = Integer.parseInt(data[2].trim());

			// goods 객체 생성
			Goods goods = new Goods(name, price, count);
			// 리스트에 추가
			goodsList.add(goods);
//    	   goodsList.add(new Goods(name,price,count)); 로 써도 됨

		}

		// 입력이 종료되면 등록된 상품 리스트 출력, 상품의 개수를 집게하여 출력
		// 상품 리스트
		Iterator<Goods> it = goodsList.iterator();
		while (it.hasNext()) {
			Goods item = it.next();
			countOfGoods += item.getCount(); // 상품 개수 합산
			item.showInfo();
		}

//       int countOfGoods = 0;
//       for (Goods goods : goodsList) {
//           System.out.println(goods.getName() + "(가격: " + goods.getPrice() + "원)이 " + goods.getCount() + "개 입고 되었습니다.");
//           countOfGoods += goods.getCount();
//       }

		System.out.println("모든 상품의 개수는 " + countOfGoods + "개 입니다.");

		// Scanner 객체 닫기
		scanner.close();
	}

}
