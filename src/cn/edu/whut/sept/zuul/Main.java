package cn.edu.whut.sept.zuul;

/**
 *定义主函数.
 * @author xiaoxiaochengzi
 * @version v 1.0
 */
public final class Main {
    /**
     *该类的空参数构造函数.
     */
    private  Main() {

    }

    /**
     *
     * @param args 传递给main函数的一个数组参数
     */
    public static void main(final String[] args) {
        Game game = new Game();
        game.play();
    }
}
