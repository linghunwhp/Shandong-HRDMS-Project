package org.huangfugui.ibatis.po;

import java.util.Date;

/**
 * Created by Cooper on 2017/5/19 0019.
 */
public class Notice {
    private int noticeId;
    private String noticeTitle;
    private String noticeContent;
    private int userId;
    private Date releaseTime;

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNocticeContent() {
        return noticeContent;
    }

    public void setNocticeContent(String nocticeContent) {
        this.noticeContent = nocticeContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId=" + noticeId +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", userId=" + userId +
                ", releaseTime=" + releaseTime +
                '}';
    }
}
