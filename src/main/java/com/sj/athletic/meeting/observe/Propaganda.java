package com.sj.athletic.meeting.observe;

import com.sj.athletic.meeting.entity.Match;
import com.sj.athletic.meeting.entity.User;

/**
 * 宣传部
 * 主办方的广播行为
 *
 * @author sunjian.
 */
public interface Propaganda {
    /**
     * 选手报名
     *
     * @param u 选手
     * @return true:报名成功;false 报名失败
     */
    boolean enter(User u);

    /**
     * 选手退赛
     * @param u 选手
     * @return true:退赛成功;false 退赛失败
     */
    boolean quit(User u);

    /**
     * 通知选手
     * @param match 赛事
     */
    void notifyAthletes(Match match);
}
