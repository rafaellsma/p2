public class Point {
  int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    if (x < 0) {
      this.x = 0;
    } else if (x > 400) {
      this.x = 400;
    } else {
      this.x = x;
    }
  }

  public void setY(int y) {
    if (x < 0) {
      this.y = 0;
    } else if (y > 400) {
      this.y = 400;
    } else {
      this.y = y;
    }
  }

  public void moveBy(int dx, int dy) {
    setX(getX() + dx);
    setY(getY() + dy);
  }
}