package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User michal = new Millenials("Michal");
        User jan = new YGeneration("Jan");
        User andrzej = new ZGeneration("Andrzej");

        //When
        String michalPublisher = michal.sharePost();
        System.out.println("Publisher Michal: " + michalPublisher);
        String janPublisher = jan.sharePost();
        System.out.println("Publisher Jan: " + janPublisher);
        String andrzejPublisher = andrzej.sharePost();
        System.out.println("Publisher Andrzej: " + andrzejPublisher);

        //Then
        assertEquals("Facebook", michalPublisher);
        assertEquals("Twitter", janPublisher);
        assertEquals("Snapchat", andrzejPublisher);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User michal = new Millenials("Michal");

        //When
        String michalPublisher = michal.sharePost();
        System.out.println("Publisher Michal: " + michalPublisher);
        michal.setCommunicateStrategy(new TwitterPublisher());
        michalPublisher = michal.sharePost();
        System.out.println("Publisher Michal: " + michalPublisher);

        //Then
        assertEquals("Twitter", michalPublisher);
    }
}
