package com.example.main.funfactsapp;

import java.util.Random;

public class FactBook {
    String[] facts = { "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "If you have 3 quarters, 4 dimes, and 4 pennies, you have $1.19. You also have the largest amount of money in coins without being able to make change for a dollar.",
            "The numbers '172' can be found on the back of the U.S. $5 dollar bill in the bushes at the base of the Lincoln Memorial.",
            "In the average lifetime, a person will walk the equivalent of 5 times around the equator.",
            "Cats sleep 16 to 18 hours per day.",
            "The most common name in the world is Mohammed.",
            "Karoke means \"empty orchestra\" in Japanese.",
            "The first known contraceptive was crocodile dung, used by Egyptians in 2000 B.C.",
            "When you die your hair still grows for a couple of months.",
            "There are two credit cards for every person in the United States.",
            "Isaac Asimov is the only author to have a book in every Dewey-decimal category.",
            "The most money ever paid for a cow in an auction was $1.3 million.",
            "The sound of E.T. walking was made by someone squishing her hands in jelly.",
            "1 in 5,000 north Atlantic lobsters are born bright blue.",
            "A skunk's smell can be detected by a human a mile away.",
            "The three best-known western names in China: Jesus Christ, Richard Nixon, and Elvis Presley.",
            "Every year about 98% of the atoms in your body are replaced.",
            "Women are 37% more likely to go to a psychiatrist than men are.",
            "Diet Coke was only invented in 1982.",
            "Charlie Brown's father was a barber.",
            "A lion's roar can be heard from five miles away.",
            "Canadian researchers have found that Einstein's brain was 15% wider than normal.",
            "The average person spends about 2 years on the phone in a lifetime.",
            "In ancient Rome, it was considered a sign of leadership to be born with a crooked nose.",
            "Cats can hear ultrasound.",
            "Dueling is legal in Paraguay as long as both parties are registered blood donors.",
            "Minus 40 degrees Celsius is exactly the same as minus 40 degrees Fahrenheit.",
            "7.5 million toothpicks can be created from a cord of wood.",
            "The plastic things on the end of shoelaces are called aglets.",
            "The elephant is the only animal with 4 knees.",
            "Kansas state law requires pedestrians crossing the highways at night to wear tail lights.",
            "Children grow faster in the springtime.",
            "A car that shifts manually gets 2 miles more per gallon of gas than a car with automatic shift.",
            "Revolvers cannot be silenced because of all the noisy gasses which escape the cylinder gap at the rear of the barrel.",
            "The word \"nerd\" was first coined by Dr. Seuss in \"If I Ran the Zoo.\"",
            "The human heart creates enough pressure to squirt blood 30 feet (9 m).",
            "Every year about 98% of the atoms in your body are replaced.",
            "Banging your head against a wall for one hour burns 150 calories.",
            "The oldest your mom joke was discovered on a 3,500 year old Babylonian tablet.",
            "7% of American adults believe that chocolate milk comes from brown cows.",
    };

    //Fields or Member Variables - Properties about the object
    public String getFact() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
            return facts[randomNumber];
    }
}