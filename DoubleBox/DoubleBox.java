class DoubleBox<T> {
  private RandomBox<T> first;
  private RandomBox<T> second;
 // private int boxSize;

  public boolean put(int key, T value) {
    // ваш код
    if (first == null) {
      first = new RandomBox<>(key, value);
      return true;
    }
    if (second == null) {
      second = new RandomBox<>(key, value);
      return true;
    } else {
      return false;
    }
    
  }

  public T get(int key) {
    // ваш код
    if ((first != null) && (first.tryUnlock(key) != null)) {
      return first.tryUnlock(key);
    }
    if (second != null && second.tryUnlock(key) != null) {
      return second.tryUnlock(key);
    }
    return null;
  }

  public int size() {
    // ваш код
    if (first == null) {
      return 0;
    }
    if (second == null) {
      return 1;
    }
    return 2;
    //return boxSize;
  }
}
