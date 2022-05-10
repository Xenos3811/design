/**
 * @author xujiacong@ejiayou.com
 * @description 单例模式实现
 * @create 2022-05-10 16:50
 **/
public class Single {

    private int num = 0;

    public static void main(final String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Single.getInstance().number_();
            }).start();
        }

    }

    private Single() {

    }

    private static volatile Single single = null;

    public static synchronized Single getInstance() {
        if (null == single) {
            single = new Single();
        }
        return single;
    }

    @Override
    public String toString() {
        return this.num + "";
    }

    public int getNum() {
        return num;
    }

    public void number_() {
        System.out.println("num = " + num++);
    }
}
