package observer.observerInterface;

/**
 * 主题
 *
 */
public interface Observer {

    void update(Object o) throws RuntimeException;
}
