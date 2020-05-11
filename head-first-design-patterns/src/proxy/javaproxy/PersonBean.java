package proxy.javaproxy;

/**
 * @Author hustffx
 * @Date 2020/5/11 16:23
 */
public interface PersonBean {
    /**
     * 获取姓名
     *
     * @return
     */
    String getName();

    /**
     * 获取性别
     *
     * @return
     */
    String getGender();

    /**
     * 获取兴趣爱好
     *
     * @return
     */
    String getInterests();

    /**
     * 获取HotOrNot评分
     *
     * @return
     */
    int getHotOrNotRating();

    /**
     * 设置姓名
     *
     * @param name
     */
    void setName(String name);

    /**
     * 设置性别
     *
     * @param gender
     */
    void setGender(String gender);

    /**
     * 设置兴趣爱好
     *
     * @param interests
     */
    void setInterests(String interests);

    /**
     * 设置HotOrNot评分
     *
     * @param rating
     */
    void setHotOrNotRating(int rating);
}
