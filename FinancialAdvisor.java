package com.example.project.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "financialAdvisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    // Constructor
    public FinancialAdvisor(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
