/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.sql.Timestamp;

/**
 *
 * @author batista
 */
public class UserModel {

    private int idUser;
    private String userName;
    private String userEmail;
    private Timestamp cretedAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the cretedAt
     */
    
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Timestamp getCretedAt() {
        return cretedAt;
    }

    /**
     * @param cretedAt the cretedAt to set
     */
    public void setCretedAt(Timestamp cretedAt) {
        this.cretedAt = cretedAt;
    }

    /**
     * @return the updatedAt
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the deletedAt
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt the deletedAt to set
     */
    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

}
