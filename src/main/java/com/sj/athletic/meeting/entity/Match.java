package com.sj.athletic.meeting.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author sunjian.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Match extends BaseModel {
    /**
     * 比赛名称
     */
    private String name;

    /**
     * 比赛开始时间
     */
    private LocalDateTime startTime;

    /**
     * 报名开始时间
     */
    private LocalDateTime enterBeginTime;

    /**
     * 报名结束时间
     */
    private LocalDateTime enterEndTime;

    /**
     * 最大玩家数
     */
    private Integer maxPlayer = 0;

    /**
     * 是否可以报名
     * 设置为false则比赛不能报名
     */
    private boolean allowEnter = true;

    /**
     * 是否平均分组
     * 设置为false不平均分组,并且需要设置不平均分组的方式(比例)
     */
    private boolean equallyDistribution = true;

    /**
     * 总分组数
     */
    private int groupAmount;

    /**
     * 不平均分组办法
     * 平均分组时不需要,如果选择不平均分组则必须要设置
     */
    private Integer[] inequalityDistribution;

    /**
     * 比赛是否关闭
     * 默认false比赛正常,true使比赛结束并关闭
     */
    private boolean closed = false;

}
