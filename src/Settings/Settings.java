package Settings;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    public static final Map <String, Integer> WOLF_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",10),
            Map.entry("Deer",15),
            Map.entry("Rabbit",60),
            Map.entry("Mouse",80),
            Map.entry("Goat",60),
            Map.entry("Sheep",70),
            Map.entry("Boar",15),
            Map.entry("Buffalo",10),
            Map.entry("Duck",40),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",0)

    );

    public static final Map <String, Integer> BOA_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",15),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",20),
            Map.entry("Mouse",40),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",10),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",0)

    );

    public static final Map <String, Integer> FOX_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",70),
            Map.entry("Mouse",90),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",60),
            Map.entry("Caterpillar",40),
            Map.entry("Plants",0)

    );

    public static final Map <String, Integer> BEAR_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",80),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",40),
            Map.entry("Deer",80),
            Map.entry("Rabbit",80),
            Map.entry("Mouse",90),
            Map.entry("Goat",70),
            Map.entry("Sheep",70),
            Map.entry("Boar",50),
            Map.entry("Buffalo",20),
            Map.entry("Duck",50),
            Map.entry("Caterpillar",20),
            Map.entry("Plants",10)

    );
    public static final Map <String, Integer> EAGLE_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",10),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",90),
            Map.entry("Mouse",90),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",80),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",0)

    );

    public static final Map <String, Integer> HORSE_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );

    public static final Map <String, Integer> DEER_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> RABBIT_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> MOUSE_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",90),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> GOAT_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> SHEEP_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> BOAR_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",50),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",90),
            Map.entry("Plants",100)

    );

    public static final Map <String, Integer> BUFFALO_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",50),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> DUCK_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",50),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",90),
            Map.entry("Plants",100)

    );
    public static final Map <String, Integer> CATERPILLAR_CAN_EAT = Map.ofEntries(
            Map.entry("Wolf",0),
            Map.entry("Boa",0),
            Map.entry("Fox",0),
            Map.entry("Bear",0),
            Map.entry("Eagle",0),
            Map.entry("Horse",0),
            Map.entry("Deer",0),
            Map.entry("Rabbit",0),
            Map.entry("Mouse",0),
            Map.entry("Goat",0),
            Map.entry("Sheep",0),
            Map.entry("Boar",0),
            Map.entry("Buffalo",0),
            Map.entry("Duck",0),
            Map.entry("Caterpillar",0),
            Map.entry("Plants",100)

    );

    public static final double WOLF_WEIGHT = 50;
    public static final int WOLF_MAX_NUM = 30;
    public static final int WOLF_SPEED = 3;
    public static final double WOLF_MAX_SATIETY = 8;

    public static final double BOA_WEIGHT = 15;
    public static final int BOA_MAX_NUM = 30;
    public static final int BOA_SPEED = 1;
    public static final double BOA_MAX_SATIETY = 3;

    public static final double FOX_WEIGHT = 8;
    public static final int FOX_MAX_NUM = 30;
    public static final int FOX_SPEED = 2;
    public static final double FOX_MAX_SATIETY = 2;

    public static final double BEAR_WEIGHT = 500;
    public static final int BEAR_MAX_NUM = 5;
    public static final int BEAR_SPEED = 2;
    public static final double BEAR_MAX_SATIETY = 80;

    public static final double EAGLE_WEIGHT = 6;
    public static final int EAGLE_MAX_NUM = 20;
    public static final int EAGLE_SPEED = 3;
    public static final double EAGLE_MAX_SATIETY = 1;

    public static final double HORSE_WEIGHT = 400;
    public static final int HORSE_MAX_NUM = 20;
    public static final int HORSE_SPEED = 4;
    public static final double HORSE_MAX_SATIETY = 6;

    public static final double DEER_WEIGHT = 300;
    public static final int DEER_MAX_NUM = 20;
    public static final int DEER_SPEED = 4;
    public static final double DEER_MAX_SATIETY = 50;

    public static final double RABBIT_WEIGHT = 2;
    public static final int RABBIT_MAX_NUM = 150;
    public static final int RABBIT_SPEED = 2;
    public static final double RABBIT_MAX_SATIETY = 0.45;

    public static final double MOUSE_WEIGHT = 0.05;
    public static final int MOUSE_MAX_NUM = 500;
    public static final int MOUSE_SPEED = 1;
    public static final double MOUSE_MAX_SATIETY = 0.01;


    public static final double GOAT_WEIGHT = 60;
    public static final int GOAT_MAX_NUM = 140;
    public static final int GOAT_SPEED = 3;
    public static final double GOAT_MAX_SATIETY = 10;

    public static final double SHEEP_WEIGHT = 70;
    public static final int SHEEP_MAX_NUM = 140;
    public static final int SHEEP_SPEED = 3;
    public static final double SHEEP_MAX_SATIETY = 15;

    public static final double BOAR_WEIGHT = 400;
    public static final int BOAR_MAX_NUM = 50;
    public static final int BOAR_SPEED = 2;
    public static final double BOAR_MAX_SATIETY = 50;


    public static final double BUFFALO_WEIGHT = 700;
    public static final int BUFFALO_MAX_NUM = 10;
    public static final int BUFFALO_SPEED = 3;
    public static final double BUFFALO_MAX_SATIETY = 100;


    public static final double DUCK_WEIGHT = 1;
    public static final int DUCK_MAX_NUM = 200;
    public static final int DUCK_SPEED = 4;
    public static final double DUCK_MAX_SATIETY = 0.15;

    public static final double CATERPILLAR_WEIGHT = 0.01;
    public static final int CATERPILLAR_MAX_NUM = 1000;
    public static final int CATERPILLAR_SPEED = 0;
    public static final double CATERPILLAR_MAX_SATIETY = 0;


//    public static final double PLANT_WEIGHT = 1;
//    public static final int PLANT_MAX_NUM = 200;









}
