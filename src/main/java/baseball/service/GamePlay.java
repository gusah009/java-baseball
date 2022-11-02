package baseball.service;

import baseball.game.Game;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;

public class GamePlay {

  public static void start(Class<? extends Game> gameClazz) {
    do {
      Game game = getGameInstance(gameClazz);
      game.play();
    } while (getPlayerWant() == GameStatus.RESTART);
  }

  private static Game getGameInstance(Class<? extends Game> gameClazz) {
    try {
      return gameClazz.getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      throw new IllegalArgumentException("잘못된 게임 클래스입니다.");
    }
  }

  private static GameStatus getPlayerWant() {
    printGameRestartGuideMessage();
    String input = Console.readLine();
    return Arrays.stream(GameStatus.values())
        .filter(status -> status.getCode().equals(input))
        .findFirst()
        .orElseThrow(IllegalArgumentException::new);
  }

  private static void printGameRestartGuideMessage() {
    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
  }

  /**
   * @code 변수는 사용자가 입력한 값을 의미합니다. 따라서 GameStatus 내에서 각 code 값은 unique 해야 합니다.
   */
  private enum GameStatus {
    RESTART("1"), END("2");

    final String code;

    GameStatus(String s) {
      code = s;
    }

    public String getCode() {
      return code;
    }
  }
}
