package com.fragile.facebookclone_springboot.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

//import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "likes")
public class Like {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "id",
            nullable = false,
            foreignKey = @ForeignKey(
                    name = "like_user_id_fk"
            )
    )
    private User users;

    @ManyToOne
    @JoinColumn(
            name = "post_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "like_post_id_fk"
            )
    )
    private Post posts;

    @ManyToOne
    @JoinColumn(
            name = "comment_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "like_comment_id_fk"
            )
    )
    private Comment comments;

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", users=" + users.getId() +
                ", posts=" + ((posts.getId() != null) ? posts.getId() : null) +
                ", comments=" + ((comments.getId() != null) ? comments.getId() : null) +
                '}';
    }
}

