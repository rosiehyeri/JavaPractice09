package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape>(); 
        
        // 밑변이 5, 높이가 6인 Rectangle 인스턴스를 하나 생성합니다.
		Shape r = new Rectangle(5, 6);
        // 밑변이 6, 높이가 2인 RectTriangle 인스턴스를 하나 생성합니다.
        Shape t= new RectTriangle( 6, 2 );
        // 위의 2가지 인스턴스를 ArrayList에 추가합니다.
        sList.add(r);
        sList.add(t);
        
        // 반복문을 사용해서 ArrayList에 들어 있는 각 Shape들의
        //  i. area와 perimeter를 출력합니다.
        // ii. 만일 해당 Shpae가 Resizable 하다면, 0.5 만큼 resize한 후 new area와 new perimeter를 출력합니다.
        for( int i=0; i<sList.size(); i++ ) {
            
            System.out.println( "area: " + sList.get(i).getArea() );
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            if( sList.get(i) instanceof Resizeable ) {
                ((Resizeable)sList.get(i)).resize( 0.5 );
                
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            }
        }
        
    }
}



