package Chap17.EX08;

import java.util.TreeSet;

//TreeSet의 장점 : 1. 중복저장x, 2. 정렬되어 저장,출력 , 3. 검색기능 사용
		//4. 특정 범위의 값 추출가능ㄴ

//TreeSet에 일반 객체를 저장 할 경우, 특정 필드를 크기비교하는 기준 필드가 존재해야함
	//1.Comparable<E> interface 의 compareTo() 메소드
	//2.Comparable<E> 인터페이스 compare() 메소드
	//3. 익명 내부 객체를 사용해서 처리

class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public int compareTo(MyComparableClass o) { //객체의 크기비교 기준을 설정 (음수,0,양수)
		if(this.data1 < o.data1) { //this.data1 기준 값이 작으면 -1
			return -1;
		}
		else if(this.data1 == o.data1) {
			return 0;
		}
		else
			return 1;
	}
	@Override
	public String toString() {
		return data1 + "  " + data2;
	}
}
public class TreeSetMethod_2 {

	public static void main(String[] args) {
		//wrapper 클래스는 comparable<E> 인터페이스의 compareTo()메소드를 재정의하고있음
			//wrapper클래스의 값을 TreeSet에 넣으면 정렬되어 저장.
		
		//1. Integer wrapper 클래스의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1); //작은값 먼저 출력
		
		//2. String wrapper 클래스의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나");
		String str2 = "다라";
		
		treeSet2.add(str2); // add를통해 객체 저장할경우 크기비교하는 필드가 정의되어있어야함
		treeSet2.add(str1); //Comparable<E> 인터페이스의 compareTo()
		
		System.out.println(treeSet2); // 오름차순, str1부터 출력
		
		//3. MyClass에 TreeSet 이 저장이 될까? 
		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		
		//treeSet3.add(myClass1);//comparable<E> 구현안되서 실행오류
		//treeSet3.add(myClass2);
		
		//System.out.println(treeSet3); 
		
		//4. MyComparableClass
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		
		MyComparableClass m1 = new MyComparableClass(2, 5);
		MyComparableClass m2 = new MyComparableClass(3, 3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		
		System.out.println(treeSet4);
		
	}

}
