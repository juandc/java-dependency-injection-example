public interface MoveControlDevices {
  public int positionX;
  public int positionY;

  public void moveUp();
  public void moveDown();
  public void moveLeft();
  public void moveRight();
}

public class Computer implements MoveControlDevices {
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


public class PlayStation implements MoveControlDevices {
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

public class InfinityBrayan4AllDevices {
  // los controles pueden ser de tipo Computer, PlayStation o cualquier
  // otra clase que siga las reglas de MoveControlDevices...
  private MoveControlDevices controls;

  public void InfinityBrayan4AllDevices(MoveControlDevices device) {
    this.controls = device;
  }
  
  public void run(char direction) {
    switch(direction) {
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

MoveControlDevices computer = new Computer();
InfinityBrayan4AllDevices infinityBrayan4PC = InfinityBrayan4AllDevices(computer);

MoveControlDevices playStation = new PlayStation();
InfinityBrayan4AllDevices infinityBrayan4PS = InfinityBrayan4AllDevices(playStation);
