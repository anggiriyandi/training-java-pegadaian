/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.pegadaian.trainingspringboot.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author anggi
 */

@Table(name = "s_group")
@Entity
public class Group extends BaseEntity {
    
    private String name;
    private String Description;
    
    @ManyToMany
    @JoinTable(
            name = "s_group_permission",
            joinColumns = @JoinColumn(name = "id_group", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_permission", referencedColumnName = "id",nullable = false)
    )
    private Set<Permission> permissions = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
    
}
