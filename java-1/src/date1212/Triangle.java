package date1212;

class Triangle extends Shape{
	private int pointNum = 3;	
	
	public Triangle() {
		Point[] p = new Point[getPointNum()];
		for(int i =0;i<getPointNum();i++) {
			p[i] = new Point();
			if(i%2==0) {
				p[i].x +=i;
			}else {
				p[i].y +=i;
			}
		}
		this.draw();
	}
	
	public Triangle(Point[] p) {
		Point[] realP = new Point[getPointNum()];
		for(int i =0;i<getPointNum();i++) {
			realP[i] = p[i];
		}
		this.draw();
	}

	public int getPointNum() {
		return pointNum;
	}

}







class Shape{
	String color="gold"; //공통속성
	void draw() {
		System.out.println("그리다"); //공통기능
	}
}






class Point{
	int x;
	int y;

	Point(){
		//this.x = 1;
		//this.y = 2;
		this(1,2);
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}
