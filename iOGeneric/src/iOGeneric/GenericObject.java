package iOGeneric;

import java.util.ArrayList;

public class GenericObject {
	public static void main(String[] args) {
		MyGeneric <String> a = new MyGeneric<>();
		MyGeneric <Integer> b = new MyGeneric<>();
		
		a.set("정지현");
		System.out.println("A value : " + a.get());
		System.out.println(a.get().getClass().getName());
		
		b.set(100);
		System.out.println("B value : " + b.get());
		System.out.println(b.get().getClass().getName());
		
		DoubleGeneric <String, Integer> da = new DoubleGeneric();
		DoubleGeneric <Integer, String> db = new DoubleGeneric();
		
		da.set("10", 10);
		db.set(20, "20");
		
		System.out.println("DA data : " + da.getFirst());
		System.out.println("DB data : " + db.getFirst());
		
		
		////////
		
		System.out.println(); // 구분용
		
		AnimalList<String> al = new AnimalList<>();
		al.add("토끼");
		al.add("얼룩말");
		al.add("까마귀");
		al.add("사자");
		al.add("기니피그");
		al.add("돼지");
		
		// for-each
		for (String s : al.toArray()) {
			System.out.println(s);
		}
		//요소 반환
		System.out.println();
		System.out.println(al.get(2));
		
		//요소 제거
		al.remove("돼지");
		System.out.println();
		
		for (String s : al.toArray()) {
			System.out.println(s);
			//돼지가 제거 됨.
		}
		
		//배열 크기 반환
		System.out.println();
		System.out.println(al.size());
		
	}
	
	
}

class MyGeneric <T> {
	T val;
	
	void set (T a) {
		this.val = a;
	}
	
	T get() {
		return this.val;
	}
}

class DoubleGeneric <K, V> {
	private K first;
	private V second;
	
	void set (K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	
	V getSecond() {
		return second;
	}
}


// 응용해보기
//이름 : AnimalList<>
//기반 : ArrayList<>
//
//메소드
//add() : 요소를 추가
//get(int index) : 요소를 반환
//toArray() : ArrayList를 반환
//remove(T animal) : 요소를 제거
//size() : 크기를 반환

class AnimalList<T> {
	ArrayList<T> al = new ArrayList<>();
	
	//요소를 추가
	void add(T animal) {
		al.add(animal);
	}
	
	//요소를 반환
	T get(int index) {
		return al.get(index);
	}
	
	//배열로 변환
	ArrayList<T> toArray() {
		return al;
	}
	
	//요소를 제거
	boolean remove(T animal) {
		// .remove(데이터) ArrayList에서 데이터를 삭제
		// 삭제가 성공하면 true, 실패시 false를 반환 
		boolean result = al.remove(animal);
		return result;
	}
	
	//크기를 반환
	int size() {
		return al.size();
	}
}


//map 구조 흉내 클래스
//add() :  요소추가
//get() : 요소 반환
//remove() : 요소 삭제
//print() : 요소 출력
class MyMap<K, V> {
	ArrayList<K> keyArr = new ArrayList<>();
	ArrayList<V> valArr = new ArrayList<>();
	
	//요소 추가
	void add(K key, V value) {
		keyArr.add(key);
		valArr.add(value);
		
	}
	
	//요소 반환
	V get(K key) {
		int index = keyArr.indexOf(key); //내가 입력한 key값의 위치를 반환
		return valArr.get(index);
	}
	
	//요소 삭제
	boolean remove(K key) {
		int index = keyArr.indexOf(key);
		boolean a = keyArr.remove(key);
		V b = valArr.remove(index);
		
		return a;
	}
	
	//요소 출력
	void print() {
		for (K k : keyArr) {
			System.out.println(k);
		}
		System.out.println();
		for (V v : valArr) {
			System.out.println(v);
		}
	}
	
}


