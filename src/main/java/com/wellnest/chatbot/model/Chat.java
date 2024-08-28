package com.wellnest.chatbot.model;
import com.wellnest.user.model.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "chat")
@Data
@Builder
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private int chatId;

    @Column(name = "status")
    private String status;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}