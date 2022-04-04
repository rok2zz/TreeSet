package Chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet : 출력시 정렬
	//출력시 검색의 메소드가 지원.
	//임의의 값을 넣으면 Set에 정력되어 저장, 출력시 오름차순
	//Set<== SortedSet(정렬메소드) <= NavigableSet(검색 메소드)<= TreeSet
	//TreeSet<String> treeSet = new TreeSet<String>(); 타입을 Treeset으로 지정해야 정렬/검색 사용가능
	//Set 인터페이스의 모든 메소드 사용

public class TreeSetMethod {

	public static void main(String[] args) {
		// TreeSet에 값을 넣었을 경우 오름차순으로 정렬, 값이 Set에 저장
		TreeSet<Integer> treeSet = new TreeSet();
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		//알아만 두기
		System.out.println(treeSet);
		System.out.println("===========데이터 검색 (가져오기)============");
		//TreeSet에서만 사용 가능한 메소드
		//1. first
		System.out.println(treeSet.first()); //2 
		
		//2. last
		System.out.println(treeSet.last()); //50
		
		//3. lower(E element) : 보다 작은값 출력 (바로 다음수 1개만)
		System.out.println(treeSet.lower(26)); //24
		
		//4. higher(E element) : 큰값출력
		System.out.println(treeSet.higher(26)); //28
		
		//5. floor(E element) : element를 포함해서 가장 작은 값
		System.out.println(treeSet.floor(26)); //26
		System.out.println(treeSet.floor(25)); //24
		
		//6. ceiling (E element) : element 포함 큰값출력
		System.out.println(treeSet.ceiling(26)); //26
		System.out.println(treeSet.ceiling(27)); //28
		System.out.println("===========데이터 검색 (꺼내기)============");
		
		//7. pollFirst() : 제일 앞의 값을 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println(treeSetSize); 
		for(int i=0;i<treeSetSize;i++) {
			System.out.print(treeSet.pollFirst() + " "); //첫번재 값만 출력
		}
		System.out.println();
		System.out.println(treeSet.size()); // 꺼냈기 때문에 0됨
		
		//8. pollLast() : 제일 뒤의 값을 꺼내기
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); 
		System.out.println(treeSet);
		for(int i=0;i<treeSetSize;i++) {
			System.out.print(treeSet.pollLast() + " "); //마지막 값만 출력
		}
		System.out.println();
		System.out.println(treeSet.size()); // 꺼냈기 때문에 0됨
		System.out.println("===========데이터 정렬============");

		//9. SortedSet<E> headSet(E element)
			//SortedSet<E> : 정렬된 데이터를 저장하는 Set
			//headSet(E element) : element의 head쪽으로의 값 : element값 미포함
		for(int i=50;i>0;i-=2) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20); 
			//20을 기준으로 앞쪽의 값(head) 뒤쪽은 (tail)
		System.out.println(sSet);
		
		
		//10. NavigableSet<E> headSet(E element, boolean inclusive) 
			//boolean의 값에따라 element의 포함여부 결정
		NavigableSet<Integer> nSet = treeSet.headSet(20,true); 
		System.out.println(nSet);
		
		//11. SortedSet<E> tailSet(E element)
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); 
			// 시작값은 포함이 기본, 끝값은 미포함이 기본(모든언어에서)
			//20을 기준으로 뒤쪽의 값 (tail)
		System.out.println(sSet2);

		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive)
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20,false); 
		System.out.println(nSet2);
		
		//13. SortedSet<E> subSet(E element,E element) : 사이의 값
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3); //10~20 : 시작값 포함, 끝값 미포함
		
		//14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
			//시작,끝값 true,false로 포함 미포함 지정
		NavigableSet<Integer> nSet3 = treeSet.subSet(10,false,20,true);
		System.out.println(nSet3);
		
		System.out.println("===========반대로 정렬============");
		//15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬
			//descending : set으로 해도됨
		System.out.println(treeSet);
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
	}

}
