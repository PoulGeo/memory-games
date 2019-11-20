package com.example.memorygames.Sounds;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.example.memorygames.R;

public class SoundPlayer {

    public static SoundPool soundPool;
    public static int hitSound;
    public static int overSound;
    public static int apple, banana, blue_car, carrot, cat, cherries, dog, eggplant, goat, grapes, green_apple, green_lemon, kiwi, laxano, lemon, orange, pig, rodi, strawberry, tomato, turtle, watermelon;
    public static int no_animal, no_fruit, no_veggie, no_fruit_veggie, no_vehicle, no_clothes, no_cooking_utensils, no_household_machine, no_some_vehicle;
    public static int fruits, veggies, objects, vehicles, what_activity, wright_box;
    public static int hanging_clothes, eating, cooking, taking_bath, washing_clothes, washing_hands, washing_dishes, watching_tv;

    public static int what_sound, cat_sound, baby_babble, phone_ring, bike_bell, birds_sings, birds, boat, bubbles, bus_horn, cashier, chicken, cow, crickets, applause, crowd_laughs, cuckoo_clock, frogs, horse, korna, lake, train, man_laughs, ocean, rain, seagulls, dog_bark, pig_sound, water;
    public static int what_category, sum_money;

    public SoundPlayer(Context context) {

        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);

        hitSound = soundPool.load(context, R.raw.hit, 1);
        overSound = soundPool.load(context, R.raw.over, 1);

        apple = soundPool.load(context, R.raw.apple, 1);
        banana = soundPool.load(context, R.raw.banana, 1);
        blue_car = soundPool.load(context, R.raw.blue_car, 1);
        carrot = soundPool.load(context, R.raw.carrot, 1);
        cat = soundPool.load(context, R.raw.cat, 1);
        cherries = soundPool.load(context, R.raw.cherries, 1);
        dog = soundPool.load(context, R.raw.dog, 1);
        eggplant = soundPool.load(context, R.raw.eggplant, 1);
        goat = soundPool.load(context, R.raw.goat, 1);
        grapes = soundPool.load(context, R.raw.grapes, 1);
        green_apple = soundPool.load(context, R.raw.green_apple, 1);
        green_lemon = soundPool.load(context, R.raw.green_lemon, 1);
        kiwi = soundPool.load(context, R.raw.kiwi, 1);
        laxano = soundPool.load(context, R.raw.laxano, 1);
        lemon = soundPool.load(context, R.raw.lemon, 1);
        orange = soundPool.load(context, R.raw.orange, 1);
        pig = soundPool.load(context, R.raw.pig, 1);
        rodi = soundPool.load(context, R.raw.rodi, 1);
        strawberry = soundPool.load(context, R.raw.strawberry, 1);
        tomato = soundPool.load(context, R.raw.tomato, 1);
        turtle = soundPool.load(context, R.raw.turtle, 1);
        watermelon = soundPool.load(context, R.raw.watermelon, 1);

        no_animal = soundPool.load(context, R.raw.no_animal, 1);
        no_fruit_veggie = soundPool.load(context, R.raw.no_fruit_no_veggie, 1);
        no_some_vehicle = soundPool.load(context, R.raw.no_some_vehicle, 1);

        no_veggie = soundPool.load(context, R.raw.no_veggie, 1);
        no_fruit = soundPool.load(context, R.raw.no_fruit, 1);
        no_clothes = soundPool.load(context, R.raw.no_clothes, 1);

        no_cooking_utensils = soundPool.load(context, R.raw.no_cooking_utensils, 1);
        no_household_machine = soundPool.load(context, R.raw.no_household_machine, 1);
        no_vehicle = soundPool.load(context, R.raw.no_vehicle, 1);

        fruits = soundPool.load(context, R.raw.fruits, 1);
        veggies = soundPool.load(context, R.raw.veggies, 1);
        objects = soundPool.load(context, R.raw.objects, 1);
        vehicles = soundPool.load(context, R.raw.vehicles, 1);

        what_activity = soundPool.load(context, R.raw.what_activity, 1);
        wright_box = soundPool.load(context, R.raw.wright_box, 1);

        hanging_clothes = soundPool.load(context, R.raw.hanging_clothes, 1);
        cooking = soundPool.load(context, R.raw.cooking, 1);
        taking_bath = soundPool.load(context, R.raw.taking_bath, 1);
        washing_clothes = soundPool.load(context, R.raw.washing_clothes, 1);
        washing_hands = soundPool.load(context, R.raw.washing_hands, 1);
        washing_dishes = soundPool.load(context, R.raw.washing_dishes, 1);
        watching_tv = soundPool.load(context, R.raw.watching_tv, 1);
        eating = soundPool.load(context, R.raw.eating, 1);

        baby_babble = soundPool.load(context, R.raw.baby_babbles, 1);
        phone_ring = soundPool.load(context, R.raw.bell_phone_ring, 1);
        bike_bell = soundPool.load(context, R.raw.bike_bell, 1);
        birds_sings = soundPool.load(context, R.raw.birds_singing, 1);
        birds = soundPool.load(context, R.raw.birds, 1);
        boat = soundPool.load(context, R.raw.boat, 1);
        bubbles = soundPool.load(context, R.raw.bubble, 1);
        bus_horn = soundPool.load(context, R.raw.bus_hotn, 1);
        cashier = soundPool.load(context, R.raw.cashier, 1);
        chicken = soundPool.load(context, R.raw.chicken, 1);
        cow = soundPool.load(context, R.raw.cow, 1);
        crickets = soundPool.load(context, R.raw.cricket, 1);
        applause = soundPool.load(context, R.raw.applause, 1);
        crowd_laughs = soundPool.load(context, R.raw.croed_laughs, 1);
        cuckoo_clock = soundPool.load(context, R.raw.cuckoo_clock, 1);
        frogs = soundPool.load(context, R.raw.frogs, 1);
        horse = soundPool.load(context, R.raw.horse, 1);
        korna = soundPool.load(context, R.raw.korna, 1);
        train = soundPool.load(context, R.raw.train, 1);
        man_laughs = soundPool.load(context, R.raw.man_laughs, 1);
        ocean = soundPool.load(context, R.raw.ocean, 1);
        rain = soundPool.load(context, R.raw.raining, 1);
        seagulls = soundPool.load(context, R.raw.seagull, 1);
        dog_bark = soundPool.load(context, R.raw.dog_bark, 1);
        pig_sound = soundPool.load(context, R.raw.pig_sound, 1);
        water = soundPool.load(context, R.raw.water, 1);
        cat_sound = soundPool.load(context, R.raw.cat_sound, 1);

        what_sound = soundPool.load(context, R.raw.what_sound, 1);

        what_category = soundPool.load(context, R.raw.what_category, 1);
        sum_money = soundPool.load(context, R.raw.sum_the_money, 1);
    }

    public void playSum_Money() {
        soundPool.play(sum_money, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWhat_Category() {
        soundPool.play(what_category, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playHitSound() {

        soundPool.play(hitSound, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void playOverSound() {

        soundPool.play(overSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playApple() {
        soundPool.play(apple, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBanana() {
        soundPool.play(banana, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBlue_Car() {
        soundPool.play(blue_car, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCarrot() {
        soundPool.play(carrot, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCat() {
        soundPool.play(cat, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCherries() {
        soundPool.play(cherries, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playDog() {
        soundPool.play(dog, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playEggplant() {
        soundPool.play(eggplant, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playGoat() {
        soundPool.play(goat, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playGrapes() {
        soundPool.play(grapes, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playGreen_Apple() {
        soundPool.play(green_apple, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playGreen_Lemon() {
        soundPool.play(green_lemon, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playKiwi() {
        soundPool.play(kiwi, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playLaxano() {
        soundPool.play(laxano, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playLemon() {
        soundPool.play(lemon, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playOrange() {
        soundPool.play(orange, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playPig() {
        soundPool.play(pig, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playRodi() {
        soundPool.play(rodi, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playStrawberry() {
        soundPool.play(strawberry, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playTomato() {
        soundPool.play(tomato, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playTurtle() {
        soundPool.play(turtle, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWatermelon() {
        soundPool.play(watermelon, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Animal() {
        soundPool.play(no_animal, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Fruit_Veggie() {
        soundPool.play(no_fruit_veggie, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Some_Vehicle() {
        soundPool.play(no_some_vehicle, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Fruit() {
        soundPool.play(no_fruit, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Veggie() {
        soundPool.play(no_veggie, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Vehicle() {
        soundPool.play(no_vehicle, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Clothes() {
        soundPool.play(no_clothes, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Cooking_Utensils() {
        soundPool.play(no_cooking_utensils, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playNo_Household_Machine() {
        soundPool.play(no_household_machine, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playFruits() {
        soundPool.play(fruits, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playVeggies() {
        soundPool.play(veggies, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playVehicles() {
        soundPool.play(vehicles, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playObjects() {
        soundPool.play(objects, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWhat_Activity() {
        soundPool.play(what_activity, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWright_Box() {
        soundPool.play(wright_box, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playHanging_Clothes() {
        soundPool.play(hanging_clothes, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCooking() {
        soundPool.play(cooking, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWashing_Clothes() {
        soundPool.play(washing_clothes, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWashing_Dishes() {
        soundPool.play(washing_dishes, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWashing_Hands() {
        soundPool.play(washing_hands, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playTaking_Bath() {
        soundPool.play(taking_bath, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWatching_TV() {
        soundPool.play(watching_tv, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playEating() {
        soundPool.play(eating, 1.0f, 1.0f, 1, 0, 1.0f);
    }


    public void playBaby_Babble() {
        soundPool.play(baby_babble, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playPhone_Ring() {
        soundPool.play(phone_ring, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBike_Bell() {
        soundPool.play(bike_bell, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBirds_sings() {
        soundPool.play(birds_sings, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBirds() {
        soundPool.play(birds, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBoat() {
        soundPool.play(boat, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBubbles() {
        soundPool.play(bubbles, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playBus_Horn() {
        soundPool.play(bus_horn, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCashier() {
        soundPool.play(cashier, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playChicken() {
        soundPool.play(chicken, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCow() {
        soundPool.play(cow, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCrickets() {
        soundPool.play(crickets, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playApplause() {
        soundPool.play(applause, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCrowd_Laughs() {
        soundPool.play(crowd_laughs, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCuckoo_Clock() {
        soundPool.play(cuckoo_clock, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playFrogs() {
        soundPool.play(frogs, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playHorse() {
        soundPool.play(horse, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playKorna() {
        soundPool.play(korna, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playLake() {
        soundPool.play(lake, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playTrain() {
        soundPool.play(train, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playMan_Laughs() {
        soundPool.play(man_laughs, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playOcean() {
        soundPool.play(ocean, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playRain() {
        soundPool.play(rain, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playSeagulls() {
        soundPool.play(seagulls, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playDog_bark() {
        soundPool.play(dog_bark, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playPig_sound() {
        soundPool.play(pig_sound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWater() {
        soundPool.play(water, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playCat_Sound() {
        soundPool.play(cat_sound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playWhat_Sound() {
        soundPool.play(what_sound, 1.0f, 1.0f, 1, 0, 1.0f);
    }


}
