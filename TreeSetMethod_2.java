package Chap17.EX08;

import java.util.TreeSet;

//TreeSet�� ���� : 1. �ߺ�����x, 2. ���ĵǾ� ����,��� , 3. �˻���� ���
		//4. Ư�� ������ �� ���Ⱑ�ɤ�

//TreeSet�� �Ϲ� ��ü�� ���� �� ���, Ư�� �ʵ带 ũ����ϴ� ���� �ʵ尡 �����ؾ���
	//1.Comparable<E> interface �� compareTo() �޼ҵ�
	//2.Comparable<E> �������̽� compare() �޼ҵ�
	//3. �͸� ���� ��ü�� ����ؼ� ó��

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
	public int compareTo(MyComparableClass o) { //��ü�� ũ��� ������ ���� (����,0,���)
		if(this.data1 < o.data1) { //this.data1 ���� ���� ������ -1
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
		//wrapper Ŭ������ comparable<E> �������̽��� compareTo()�޼ҵ带 �������ϰ�����
			//wrapperŬ������ ���� TreeSet�� ������ ���ĵǾ� ����.
		
		//1. Integer wrapper Ŭ������ ũ�� ��
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20);
		Integer intValue2 = new Integer(10);
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1); //������ ���� ���
		
		//2. String wrapper Ŭ������ ũ�� ��
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����");
		String str2 = "�ٶ�";
		
		treeSet2.add(str2); // add������ ��ü �����Ұ�� ũ����ϴ� �ʵ尡 ���ǵǾ��־����
		treeSet2.add(str1); //Comparable<E> �������̽��� compareTo()
		
		System.out.println(treeSet2); // ��������, str1���� ���
		
		//3. MyClass�� TreeSet �� ������ �ɱ�? 
		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		
		//treeSet3.add(myClass1);//comparable<E> �����ȵǼ� �������
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
