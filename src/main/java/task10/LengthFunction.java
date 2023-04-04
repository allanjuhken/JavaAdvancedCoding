package task10;
@FunctionalInterface
public interface LengthFunction<T> {
    int getLength(T element);
}
