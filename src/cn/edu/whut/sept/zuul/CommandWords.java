package cn.edu.whut.sept.zuul;

/**
 * 定义命令单词类.
 */
public class CommandWords {
    /**
     * 定义一个数组储存合法命令.
     */
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    /**
     * 声明一个空参构造函数.
     */
    public CommandWords() {
        // nothing to do at the moment...
    }

    /**
     * @deprecated 查看输入的命令字符串是否合法
     * @param aString 传入方法的字符串
     * @return 输入字符串合法返回true，否则返回false
     */
    public boolean isCommand(final String aString) {
        for (int i = 0; i < validCommands.length; i++) {
            if (validCommands[i].equals(aString)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @deprecated 一次展示出所有合法命令字符串
     */
    public void showAll() {
        for (String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
