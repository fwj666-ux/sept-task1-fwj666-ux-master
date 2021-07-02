package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

/**
 *
 */
public class Room {
    /**
     * 定义房间所对应的描述.
     */
    private String description;
    /**
     * 定义房间和在这个房间可以去哪几个方向.
     */
    private HashMap<String, Room> exits;

    /**
     * @deprecated 储存room的description
     * @param description1 room的description
     */
    public Room(final String description1) {
        this.description = description1;
        exits = new HashMap<>();
    }

    /**
     *
     * @param direction 输入要去的方向
     * @param neighbor 该方向对应的房间
     */
    public void setExit(final String direction, final Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**
     *
     * @return 获取对象的description
     */
    public String getShortDescription() {
        return description;
    }

    /**
     *
     * @return 返回You are加上对应位置的description并换行输出还可以去的方向
     */
    public String getLongDescription() {
        return "You are " + description + ".\n" + getExitString();
    }

    private String getExitString() {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     *
     * @param direction 记录输入的方向
     * @return 返回去这个方向的地点
     */
    public Room getExit(final String direction) {
        return exits.get(direction);
    }
}


