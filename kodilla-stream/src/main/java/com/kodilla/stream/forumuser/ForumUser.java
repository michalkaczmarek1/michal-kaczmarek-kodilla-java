package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idUser;
    private final String username;
    private final char sex;
    private final LocalDate dayOfBirthday;
    private final int amountPosts;

    public ForumUser(final int idUser, final String username, final char sex, final LocalDate dayOfBirthday, final int amountPosts) {
        this.idUser = idUser;
        this.username = username;
        this.sex = sex;
        this.dayOfBirthday = dayOfBirthday;
        this.amountPosts = amountPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDayOfBirthday() {
        return dayOfBirthday;
    }

    public int getAmountPosts() {
        return amountPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dayOfBirthday=" + dayOfBirthday +
                ", amountPosts=" + amountPosts +
                '}';
    }
}
