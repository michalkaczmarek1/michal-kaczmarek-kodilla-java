package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void setTestDataForMock() {
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        List<String> usernames = new ArrayList<>();
        usernames = generateListOfNUserNames(1000);
        when(statisticsMock.usersNames()).thenReturn(usernames);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(200);

    }

    private List<String> generateListOfNUserNames(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++){
            String userNames = "user " + n;
            resultList.add(userNames);
        }
        return resultList;
    }

    @Test
    void countPostsZero() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();

        //Then
        assertEquals(0, averageCountPostsUser);
        assertEquals(0, averageCountCommentsPerPost);
        assertEquals(0.20, averageCountCommentsUser);

    }

    @Test
    void countPostsThousand() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();

        //Then
        assertEquals(1, averageCountPostsUser);
        assertEquals(0.2, averageCountCommentsPerPost);
        assertEquals(0.2, averageCountCommentsUser);
    }

    @Test
    void countCommentsZero() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();

        //Then
        assertEquals(0, averageCountCommentsUser);
        assertEquals(0, averageCountCommentsPerPost);
        assertEquals(0.50, averageCountPostsUser);
    }

    @Test
    void countCommentsIsSmallerThanCountPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();

        //Then
        assertEquals(0.20, averageCountPostsUser);
        assertEquals(0.10, averageCountCommentsUser);
        assertEquals(0.50, averageCountCommentsPerPost);
    }

    @Test
    void countCommentsIsGreaterThanCountPosts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(200);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();

        //Then
        assertEquals(0.10, averageCountPostsUser);
        assertEquals(0.2, averageCountCommentsUser);
        assertEquals(2, averageCountCommentsPerPost);
    }

    @Test
    void countUsersZero() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUserNames(0));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();

        //Then
        assertEquals(0, averageCountPostsUser);
        assertEquals(0, averageCountCommentsUser);
        assertEquals(0.40, averageCountCommentsPerPost);
    }

    @Test
    void countUsersOneHundred() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUserNames(100));


        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averageCountPostsUser = calculateStatistics.getAverageCountPostsUser();
        double averageCountCommentsUser = calculateStatistics.getAverageCountCommentsUser();
        double averageCountCommentsPerPost = calculateStatistics.getAverageCountCommentsPerPost();

        //Then
        assertEquals(5, averageCountPostsUser);
        assertEquals(2, averageCountCommentsUser);
        assertEquals(0.4, averageCountCommentsPerPost);
    }

    @Test
    void testShowStatistics() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        String statistics = "Średnia liczba postów na uzytkownika: 0.5, Średnia liczba komentarzy na uzytkownika: 0.2 Średnia liczba komentarzy na post: 0.4";

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        String result = calculateStatistics.showStatistics();

        //Then
        assertEquals(statistics, result);

    }

}
