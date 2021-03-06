## jUnit


#### 1. JUnit이란?
<pre>
JUnit은 단위 테스트 도구입니다. 
외부 테스트 프로그램(케이스)을 작성하여 System.out으로 번거롭게 디버깅하지 않아도 됩니다. 
프로그램 테스트 시 걸릴 시간도 관리할 수 있게 해주며 오픈 소스이며, 플러그인 형태로 Eclipse에 포함되어 있습니다. 
하나의 jar 파일이 전부이며 사용법도 간단합니다. 
어느 정도 개발이 진행되면 프로그램에 대한 단위 테스트는 반드시 수행해야 합니다. 
JUnit은 보이지 않고 숨겨진 단위 테스트를 끌어내어 정형화시켜 단위 테스트를 쉽게 해주는 테스트용 Framework 입니다. 
JDK 1.4에서 추가된 assertXXX를 사용하여 Test를 진행합니다. 
JUnit은 테스트 결과를 확인하는 것 이외 최적화된 코드를 유추해내는 기능도 제공합니다. 
또한, 테스트 결과를 단순한 텍스트로 남기는 것이 아니라 Test클래스로 남깁니다.
그래서 개발자에게 테스트 방법 및 클래스의 History를 넘겨줄 수도 있습니다.
</pre>

#### 2. 특징
<pre>
단위 테스트 Framework 중 하나
문자 혹은 GUI 기반으로 실행됨
단정문으로 테스트 케이스의 수행 결과를 판별함(assertEquals(예상 값, 실제 값))
어노테이션으로 간결하게 지원함
결과는 성공(녹색), 실패(붉은색) 중 하나로 표시
</pre>

[출처](http://www.nextree.co.kr/p11104/)http://www.nextree.co.kr/p11104/