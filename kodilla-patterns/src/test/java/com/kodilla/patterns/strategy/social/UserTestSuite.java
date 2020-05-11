package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials("Janusz the Millenial");
        User ygeneration = new YGeneration("Adam the YGeneration");
        User zgeneration = new ZGeneration("Andrzej the ZGeneration");

        //When
        String millenialSocialMedia = millenial.show();
        System.out.println(millenial.getUserName() + " - " + millenialSocialMedia);
        String ygenerationSocialMedia = ygeneration.show();
        System.out.println(ygeneration.getUserName() + " - " + ygenerationSocialMedia);
        String zgenerationSocialMedia = zgeneration.show();
        System.out.println(zgeneration.getUserName() + " - " + zgenerationSocialMedia);

        //Then
        Assert.assertEquals("Facebook", millenialSocialMedia);
        Assert.assertEquals("Twitter", ygenerationSocialMedia);
        Assert.assertEquals("Snapchat", zgenerationSocialMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenial = new Millenials("Janusz the Millenial");

        //When
        String millenialSocialMedia = millenial.show();
        System.out.println(millenial.getUserName() + " - " + millenialSocialMedia);
        millenial.setSocialMedia(new SnapchatPublisher());
        millenialSocialMedia = millenial.show();
        System.out.println(millenial.getUserName() + " - " + millenialSocialMedia);

        //Then
        Assert.assertEquals("Snapchat", millenialSocialMedia);
    }
}
