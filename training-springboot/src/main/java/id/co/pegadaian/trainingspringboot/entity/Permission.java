/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author anggi
 */

@Table(name = "s_permission")
@Entity
public class Permission extends BaseEntity{
    
    private String permissionLabel;
    private String permissionValue;

    public String getPermissionLabel() {
        return permissionLabel;
    }

    public void setPermissionLabel(String permissionLabel) {
        this.permissionLabel = permissionLabel;
    }

    public String getPermissionValue() {
        return permissionValue;
    }

    public void setPermissionValue(String permissionValue) {
        this.permissionValue = permissionValue;
    }
    
}
