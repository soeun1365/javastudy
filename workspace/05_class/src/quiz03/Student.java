package quiz03;

public class Student {
	String name;
	int kor, eng, mat;
	double average;
	
	void set(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
		//System.out.println(name + "의 국어점수: " + kor + ", 영어점수: " + eng + ", 수학점수: "+ mat);
	}

	double getAverage() {
		return ( kor + eng + mat ) / 3.0;
	}
	String getPass() {
		return (getAverage() >= 60 ? "합격" : "불합격");
	}

	
}
