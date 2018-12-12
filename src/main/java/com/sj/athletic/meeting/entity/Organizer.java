package com.sj.athletic.meeting.entity;

import com.sj.athletic.meeting.observe.Propaganda;
import io.ebean.annotation.DbJsonB;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 比赛主办方
 *
 * @author sunjian.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "organizer")
public class Organizer extends BaseModel implements Propaganda {
    /**
     * 主办的比赛
     */
    @DbJsonB
    private Match match;
    /**
     * 参赛的运动员
     */
    @DbJsonB
    private Set<User> athletes = new LinkedHashSet<>();

    public Organizer(Match match) {
        Objects.requireNonNull(match);
        this.match = match;
    }

    /**
     * 取消比赛
     */
    public void cancel() {
        this.match.setClosed(true);
    }

    /**
     * 发布比赛
     */
    public void announce() {
        //todo 生成一个链接 包含比赛信息和报名链接
    }


    /**
     * 选手报名
     * 成功报名条件:允许报名,还有名额,没有报过名
     *
     * @param u 选手
     * @return true:报名成功;false 报名失败
     */
    @Override
    public boolean enter(User u) {
        return this.match.isAllowEnter() && this.athletes.size() < this.match.getMaxPlayer() && this.athletes.add(u);
    }

    /**
     * 选手退赛
     *
     * @param u 选手
     * @return true:退赛成功;false 退赛失败
     */
    @Override
    public boolean quit(User u) {
        return !this.match.isClosed() && this.athletes.remove(u);
    }

    /**
     * 通知选手
     *
     * @param match 赛事
     */
    @Override
    public void notifyAthletes(Match match) {
        //todo 通知选手比赛情况
    }

    /**
     * 选手变化的情况
     *
     * @param message 信息
     */
    private void athletesChanged(String message) {
        //todo 比赛选手变化时发出通知
    }
}
