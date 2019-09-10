package www.studentcourse.tk.model;

import java.util.Date;

public class UserLabel {
    private String id;

    private String userId;

    private String userLabelId;

    private Integer flag;

    private Date createTime;

    private String craetUser;

    private Date opTime;

    private String opUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserLabelId() {
        return userLabelId;
    }

    public void setUserLabelId(String userLabelId) {
        this.userLabelId = userLabelId == null ? null : userLabelId.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCraetUser() {
        return craetUser;
    }

    public void setCraetUser(String craetUser) {
        this.craetUser = craetUser == null ? null : craetUser.trim();
    }

    public Date getOpTime() {
        return opTime;
    }

    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser == null ? null : opUser.trim();
    }
}