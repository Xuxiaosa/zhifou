package com.bean;

import java.util.Date;

public class Comment {
    private int id;
    private String content;
    private int userId;
    private int entityId;
    private int entity_type;
    private Date createTime;
    private int status;


    public Comment() {
    }

    public Comment(int id, String content, int userId, int entityId, int entity_type, Date createTime, int status) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.entityId = entityId;
        this.entity_type = entity_type;
        this.createTime = createTime;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", entityId=" + entityId +
                ", entity_type='" + entity_type + '\'' +
                ", createTime=" + createTime +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public int getEntity_type() {
        return entity_type;
    }

    public void setEntity_type(int entity_type) {
        this.entity_type = entity_type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
