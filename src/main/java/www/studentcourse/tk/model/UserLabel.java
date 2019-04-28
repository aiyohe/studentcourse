package www.studentcourse.tk.model;

import java.util.Date;

public class UserLabel {
    private String id;

    private String userId;

    private String labelId;

    private Integer flag;

    private Date createTime;

    private Date updateTime;

    private Integer userLabelId;

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

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId == null ? null : labelId.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserLabelId() {
        return userLabelId;
    }

    public void setUserLabelId(Integer userLabelId) {
        this.userLabelId = userLabelId;
    }
}