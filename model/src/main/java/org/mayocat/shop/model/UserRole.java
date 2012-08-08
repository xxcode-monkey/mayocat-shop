package org.mayocat.shop.model;

import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnore;

public class UserRole extends Entity
{
    @JsonIgnore
    Long id;
    
    @NotNull
    User user;
    
    @NotNull
    Role role;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Role getRole()
    {
        return role;
    }

    public void setRole(Role role)
    {
        this.role = role;
    }

}
