package ru.ifmo.backend_2021.expressions;

import java.util.Map;

public abstract class Expression implements ExpressionInterface {
  protected int priority;

  public Expression(int priority){
    this.priority = priority;
  }

  public int evaluate(int x) {
    return 0;
  }

  public int evaluateWithVariables(Map<String, Integer> variables) { return -1;}

  public String toMiniString() {
    return "";
  }

  public String toString() {
    return "";
  }
}
