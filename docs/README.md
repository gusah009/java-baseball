## 기능 구현 목록

- 게임들을 포괄하는 게임 인터페이스를 만든다
    - [x] 게임 인터페이스는 `void` 반환값을 가지는 `play()` 메서드만 가진다.
- 야구 게임을 관리할 야구 클래스를 만든다
    - [ ] 야구 클래스는 게임 인터페이스를 `implement` 한다.
- [ ] 야구 게임이 끝났을 때 재시작하거나 종료하는 것을 담당하는 게임 플레이 클래스를 만든다

### 야구 클래스

- [ ] 야구 클래스는 생성자를 제공한다.
    - 생성자에서는 새로운 야구 게임을 반환해주면서, 동시에 아래와 같은 내용들을 초기화 한다.
    - [ ] 상대방(컴퓨터)의 유니크한 숫자 3개 생성
    - [ ] 가지고 있는 스트라이크, 볼 변수 초기화
- [ ] `play()`라는 게임을 진행하는 메서드를 제공한다.
    - [ ] 사용자가 컴퓨터의 숫자를 모두 맞출 때 까지 돌아간다.
    - [ ] 사용자의 입력을 받는 `input()` 메서드를 가진다.
        - 이 때, 사용자가 올바른 입력을 했는 지 확인해야 한다
        - [ ] 사용자의 입력값이 길이가 3인지 확인한다.
        - [ ] 사용자 입력값의 각 자리가 숫자인지 확인한다.
        - [ ] 사용자 입력값의 각 숫자들이 1 ~ 9 사이인지 확인한다.
        - [ ] 사용자 입력값의 각 숫자들이 겹치지 않는 지 확인한다.
    - [ ] 사용자의 입력과 컴퓨터의 숫자를 비교하여 볼, 스트라이크를 결정할 `execute()` 메서드를 가진다.
    - [ ] 이번 예측의 결과를 출력할 `print()` 메서드를 가진다.

### 게임 플레이 클래스

- 게임을 어떤 방식으로 플레이 시킬지를 관리하는 게임 플레이 클래스를 만든다.
- 게임 플레이 클래스는 `start(Class<Game> gameClazz)` 라는 정적 메서드만 제공하며, 구체적인 게임의 클래스를 받아온다.
    - [ ] 받아온 게임의 클래스로 해당 게임을 생성해 실행해준다.
    - [ ] 내부적으로 재시작을 할 지, 종료를 할 지에 대해 사용자에게 묻는 로직을 작성한다.