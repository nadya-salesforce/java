class SmartRobot extends Robot {
    // Ваш код
  private int countSteps = 0;

  @Override
  public void moveRight() {
    super.moveRight();
    countSteps++;
}

  @Override
  public void moveLeft() {
    super.moveLeft();
    countSteps++;
}

  @Override
  public void moveUp() {
    super.moveUp();
    countSteps++;
}

  @Override
  public void moveDown() {
    super.moveDown();
    countSteps++;
}
  
    public int getStepsCount() {
        return countSteps; // ваш код
      
    }
}
