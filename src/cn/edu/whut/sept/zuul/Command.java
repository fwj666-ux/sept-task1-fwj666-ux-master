package cn.edu.whut.sept.zuul;
/**
 *定义command类.
 */
public class Command {
    /**
     * 定义命令单词.
     */
    private String commandWord;
    /**
     * 定义命令得第二单词.
     */
    private String secondWord;
    /**
     *
     * @param firstWord 获取输入字符串的第一个字符
     * @param secondWord1 获取输入字符串的第二个字符
     */
    public Command(final String firstWord, final String secondWord1) {
        commandWord = firstWord;
        this.secondWord = secondWord1;
    }

    /**
     * @deprecated 获取对象的commandWord的值
     * @return 返回对象的commandWord的值
     */
    public String getCommandWord() {
        return commandWord;
    }

    /**
     * @deprecated 获取对象的secondWord的值
     * @return 返回secondWord的值
     */
    public String getSecondWord() {
        return secondWord;
    }

    /**
     *
     * @return 确认输入命令是否为空
     */
    public boolean isUnknown() {
        return (commandWord == null);
    }

    /**
     *
     * @return  确认输入的命令是否存在第二个命令单词
     */
    public boolean hasSecondWord() {
        return (secondWord != null);
    }
}
