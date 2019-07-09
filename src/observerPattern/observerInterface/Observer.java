package observerPattern.observerInterface;

/**
 * 主题
 *
 */
public interface Observer {

    /**
     * 接受通知的方法
     * @param o
     * @throws RuntimeException
     */
    void update(Object o) throws RuntimeException;
}
