## TIL

#### 구현
***
* [우유축제](https://github.com/MingGi-Jung/Algorithm/edit/main/%EB%B0%B1%EC%A4%80/%EA%B5%AC%ED%98%84/14720-%EC%9A%B0%EC%9C%A0%EC%B6%95%EC%A0%9C.java)
  - 데이터 크기가 작아(1000개) 시간복잡도 O(N^2)까지 사용 가능
* [OX퀴즈](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EA%B5%AC%ED%98%84/8958-OX%ED%80%B4%EC%A6%88.java)

* [분수찾기](https://github.com/MingGi-Jung/Algorithm/blob/main/%EB%B0%B1%EC%A4%80/%EA%B5%AC%ED%98%84/1193-%EB%B6%84%EC%88%98%EC%B0%BE%EA%B8%B0.java)
  - 데이터 크기 10^7이여서 시간복잡도O(N^2)이상인 코드는 시간제한에 걸림
* [알파벳찾기](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EA%B5%AC%ED%98%84/10809-%EC%95%8C%ED%8C%8C%EB%B2%B3%20%EC%B0%BE%EA%B8%B0.java)
  * 시간복잡도 O(N^2)도 가능 시간복잡도 O(n)으로 풀음
* [그룹단어체커](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EA%B5%AC%ED%98%84/1316-%EA%B7%B8%EB%A3%B9%EB%8B%A8%EC%96%B4%EC%B2%B4%EC%BB%A4.java)
* [영수증](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EA%B5%AC%ED%98%84/25304-%EC%98%81%EC%88%98%EC%A6%9D.java)
#### 그리디
***
* [폴리오미노](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EA%B7%B8%EB%A6%AC%EB%94%94/1343-%ED%8F%B4%EB%A6%AC%EC%98%A4%EB%AF%B8%EB%85%B8.java)

* [거스름돈](https://github.com/MingGi-Jung/Algorithm/blob/main/%EB%B0%B1%EC%A4%80/%EA%B7%B8%EB%A6%AC%EB%94%94/5585-%EA%B1%B0%EC%8A%A4%EB%A6%84%EB%8F%88.java)
  - 수행시간이 거슬러 줄 수 있는 돈의 개수에 비례하므로 시간복잡도가 O(N)인 코드 
#### 정렬
***
* [숫자카드](https://github.com/MingGi-Jung/Algorithm/blob/main/%EB%B0%B1%EC%A4%80/%EC%A0%95%EB%A0%AC/10815-%EC%88%AB%EC%9E%90%20%EC%B9%B4%EB%93%9C.java)
  - 데이터크기가 500000임
  - 완전탐색으로 풀면 시간초과발생
  - Array.sort --배열정렬할때 사용,듀얼피봇사용
  - Collections.sort -- 리스트 정렬할때사용,timsort사용
  - 이진탐색 **정렬된 배열**에서 특정값 탐색, 시간복잡도 O(logN)을 가짐
* [단어정렬](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EC%A0%95%EB%A0%AC/1181-%EB%8B%A8%EC%96%B4%20%EC%A0%95%EB%A0%AC.java)
  * 내가 원하는 정렬조건을 구현할려면 
Comparator인터페이스를 이용해서 내가 원하는 정렬조건을 만들 수 있다
* [베스트셀러](https://github.com/Jung-MinGi/TIL/blob/main/%EB%B0%B1%EC%A4%80/%EC%A0%95%EB%A0%AC/1302-%EB%B2%A0%EC%8A%A4%ED%8A%B8%EC%85%80%EB%9F%AC.java)
  * map 메서드중getOrDefault 
찾는 키가 맵에 있으면 요소값을 반환 없으면 기본값 반환

  
