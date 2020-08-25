package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "user1", 'M', LocalDate.of(2000, 1, 10), 5));
        forumUsers.add(new ForumUser(2, "user2", 'F', LocalDate.of(1991, 2, 15), 0));
        forumUsers.add(new ForumUser(3, "user3", 'M', LocalDate.of(2002, 3, 20), 25));
        forumUsers.add(new ForumUser(4, "user4", 'M', LocalDate.of(1993, 4, 25), 10));
        forumUsers.add(new ForumUser(5, "user5", 'M', LocalDate.of(2004, 5, 30), 45));
        forumUsers.add(new ForumUser(6, "user6", 'M', LocalDate.of(1995, 6, 5), 55));
        forumUsers.add(new ForumUser(7, "user7", 'M', LocalDate.of(2006, 7, 10), 0));
        forumUsers.add(new ForumUser(8, "user8", 'F', LocalDate.of(1997, 8, 15), 75));
        forumUsers.add(new ForumUser(9, "user9", 'M', LocalDate.of(2009, 9, 20), 85));
        forumUsers.add(new ForumUser(10, "user10", 'F', LocalDate.of(1999, 10, 25), 95));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
