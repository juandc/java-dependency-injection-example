public class InfinityBrayan {
  // OJO AQUÍ: los controles son de tipo Computer...
  private Computer controls;

  public void InfinityBrayan() {
    this.controls = new Computer();
  }

  public void run(char direction) {
    switch(direction) {
      // la clase Computer tiene (o debe tener) los
      // métodos moveWhatever...
      case ‘U’:
        this.controls.moveUp();
        break;
      case ‘D’:
        this.controls.moveDown();
        break;
      case ‘L’:
        this.controls.moveLeft();
        break;
      case ‘R’:
        this.controls.moveRight();
        break;
    }
  }

  public int getPositionX() {
    return this.controls.positionX;
  }

  public int getPositionY() {
    return this.controls.positionY;
  }
}

public class Computer {
  public int positionX = 0;
  public int positionY = 0;

  public void moveUp() {
    this.positionY++;
  }

  public void moveDown() {
    this.positionY--;
  }

  public void moveLeft() {
    this.positionX--;
  }

  public void moveRight() {
    this.positionX++;
  }
}
