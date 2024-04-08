package com.javaex.ex04;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		super(3);  // 세 개의 변을 가진 삼각형
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		double hypotenuse = Math.sqrt(width * width + height * height);
		return width + height + hypotenuse;
		// 루트 계산 메서드 Math.sqrt
	}

}