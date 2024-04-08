package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super(4);  // 네 개의 변을 가진 사각형임
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
   public void resize(double s) {
       width *= s;
       height *= s;
	}
    

}