package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();

        String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        //Task 7.3
        Forum forum = new Forum();
        LocalDate today = LocalDate.now();

        Map<Integer, ForumUser> resultMapofForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (today.getYear() - forumUser.getDayOfBirthday().getYear()) >= 20)
                .filter(forumUser -> forumUser.getAmountPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser -> forumUser));

        System.out.println("Elements: " + resultMapofForumUsers.size());
        resultMapofForumUsers.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ": " + integerForumUserEntry.getValue())
                .forEach(System.out::println);

    }
}