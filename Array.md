## 배열

#### 1. 참조변수 선언

데이터타입

``` java
//int형 배열
int myarry; //기본 int형인 myarry라는 변수를 선언함.
int [] myarry; //int형인 myarry라는 배열을 선언함. Declaration.

//String형 배열
String myarry; //기본형 문자열인 myarry라는 변수를 선언함
String [] myarry;// 문자열 myarry라는 배열을 선언함.
```

​	조건: 타입이 같은 것 끼리만 하나의 배열에 묶일 수 있다.

#### 2. 배열 생성문

``` java
int[] myarry; 			//int형 배열인 myarry를 선언
myarry = new int[5]; 	// 배열 인스턴스 생성. 5개 요소로 이뤄짐

//int[] myarry는 참조변수를 선언한 것 이고, new int[5]는 5개 요소를 가진 배열을 생성. 하지만 값은 비어있다. 
```

#### 3. 참조변수 생성과 배열 생성문 동시

참조 변수 4선언과 동시에 인스턴스 생성하기

``` java
int[] myarry = new in[5]; //참조변수 int[]myarry 선언
```

#### 4. 배열 초기화 작업 (값을 넣는 작업)

``` java
		int[] myarry = new int[5];
		myarry[0] = 50;
		myarry[1] = 60;
		myarry[2] = 70;
		myarry[3] = 80;
		myarry[4] = 90;
	// 같은 의미
		int[] myarry = new int {50,60,70,80,90};
```

​	for문으로 배열의 모든 요소를 출력한다.

``` JAVA
for(int i=0; i < myarry.length; i++) {
			System.out.printf("%d.myarry: %d%n", i, myarry[i]);
		}
```

# _____________________________________________________________________________________________________________기본포멧

``` JAVA
데이터타입[] 배열명 = new 데이터타입[배열요소 갯수]; 
//참조변수 생성 = 인스턴스 생성

        배열[0] = 값; // 배열 초기화
            .
            .
            .
        배열[n]
        OR
        int[] myarry = new int {50,60,70,80,90};

배열 출력화: for문 이용하기
    for(i=0; i<배열명.length, i++){
        printf("하고싶은 말"+ 배열명[i]);
    }
        
```

# _____________________________________________________________________________________________________________

​		예문

``` java
package chap05array;
//모든 홀수번째 인덱스의 합을 구하기
public class ArrayExam03 {

	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		int oddSum=0;
		
		for (int i=0; i<arr.length; i++)
		{
			if (i%2==1 ) //arr[i]%2==1 아니고
			{	
				System.out.println(i+"."+"홀수 배열: "+arr[i]);
				oddSum += arr[i]; 
			}
						 
		}System.out.println("배열의 홀수 번째 정수의 합은: "+oddSum);
	}

}
```

