package Chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : ��½� ����
	//��½� �˻��� �޼ҵ尡 ����.
	//������ ���� ������ Set�� ���µǾ� ����, ��½� ��������
	//Set<== SortedSet(���ĸ޼ҵ�) <= NavigableSet(�˻� �޼ҵ�)<= TreeSet
	//TreeSet<String> treeSet = new TreeSet<String>(); Ÿ���� Treeset���� �����ؾ� ����/�˻� ��밡��
	//Set �������̽��� ��� �޼ҵ� ���

public class TreeSetMethod {

	public static void main(String[] args) {
		// TreeSet�� ���� �־��� ��� ������������ ����, ���� Set�� ����
		TreeSet<Integer> treeSet = new TreeSet();
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		//�˾Ƹ� �α�
		System.out.println(treeSet);
		System.out.println("===========������ �˻� (��������)============");
		//TreeSet������ ��� ������ �޼ҵ�
		//1. first
		System.out.println(treeSet.first()); //2 
		
		//2. last
		System.out.println(treeSet.last()); //50
		
		//3. lower(E element) : ���� ������ ��� (�ٷ� ������ 1����)
		System.out.println(treeSet.lower(26)); //24
		
		//4. higher(E element) : ū�����
		System.out.println(treeSet.higher(26)); //28
		
		//5. floor(E element) : element�� �����ؼ� ���� ���� ��
		System.out.println(treeSet.floor(26)); //26
		System.out.println(treeSet.floor(25)); //24
		
		//6. ceiling (E element) : element ���� ū�����
		System.out.println(treeSet.ceiling(26)); //26
		System.out.println(treeSet.ceiling(27)); //28
		System.out.println("===========������ �˻� (������)============");
		
		//7. pollFirst() : ���� ���� ���� ������
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize); 
		for(int i=0;i<treeSetSize;i++) {
			System.out.print(treeSet.pollFirst() + " "); //ù���� ���� ���
		}
		System.out.println();
		System.out.println(treeSet.size()); // ���±� ������ 0��
		
		//8. pollLast() : ���� ���� ���� ������
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); 
		System.out.println(treeSet);
		for(int i=0;i<treeSetSize;i++) {
			System.out.print(treeSet.pollLast() + " "); //������ ���� ���
		}
		System.out.println();
		System.out.println(treeSet.size()); // ���±� ������ 0��
		System.out.println("===========������ ����============");

		//9. SortedSet<E> headSet(E element)
			//SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set
			//headSet(E element) : element�� head�������� �� : element�� ������
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20); 
			//20�� �������� ������ ��(head) ������ (tail)
		System.out.println(sSet);
		
		
		//10. NavigableSet<E> headSet(E element, boolean inclusive) 
			//boolean�� �������� element�� ���Կ��� ����
		NavigableSet<Integer> nSet = treeSet.headSet(20,true); 
		System.out.println(nSet);
		
		//11. SortedSet<E> tailSet(E element)
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); 
			// ���۰��� ������ �⺻, ������ �������� �⺻(������)
			//20�� �������� ������ �� (tail)
		System.out.println(sSet2);

		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive)
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20,false); 
		System.out.println(nSet2);
		
		//13. SortedSet<E> subSet(E element,E element) : ������ ��
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3); //10~20 : ���۰� ����, ���� ������
		
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
			//����,���� true,false�� ���� ������ ����
		NavigableSet<Integer> nSet3 = treeSet.subSet(10,false,20,true);
		System.out.println(nSet3);
		
		System.out.println("===========�ݴ�� ����============");
		//15. NavigableSet<E> descendingSet() : ���� ������ �������� �ݴ�� ����
			//descending : set���� �ص���
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
	}

}
