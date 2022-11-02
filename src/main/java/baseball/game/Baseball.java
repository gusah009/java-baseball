package baseball.game;

import static camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange;

import java.util.List;

public class Baseball implements Game {

  private static final int GOAL_DIGIT = 3;
  private static final int START_POSSIBLE_NUMBER = 1;
  private static final int END_POSSIBLE_NUMBER = 9;

  private final int[] computerNumbers = new int[GOAL_DIGIT];
  private final int[] playerNumbers = new int[GOAL_DIGIT];

  private int strike;
  private int ball;

  public Baseball() {
    this.strike = 0;
    this.ball = 0;
    setComputerNumbers();
  }

  private void setComputerNumbers() {
    List<Integer> uniqueNumbers = pickUniqueNumbersInRange(START_POSSIBLE_NUMBER,
        END_POSSIBLE_NUMBER, GOAL_DIGIT);
    for (int i = 0; i < GOAL_DIGIT; i++) {
      computerNumbers[i] = uniqueNumbers.get(i);
    }
  }

  @Override
  public void play() {

  }
}
