package org.acme.qute;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@ApplicationScoped
public class Users extends PanacheEntity {
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "created_date")
    public LocalDateTime createdDate;
}