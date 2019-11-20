package Constructor;

import android.view.View;

public class User {

    private String name1, pass1, city2, birth1, edu1, gen1, lvl1;
    private String levelChoice;


    public User(String name1, String pass1, String city2, String birth1, String edu1, String gen1, String lvl1) {
        this.name1 = name1;
        this.pass1 = pass1;
        this.city2 = city2;
        this.birth1 = birth1;
        this.edu1 = edu1;
        this.gen1 = gen1;
        this.lvl1 = lvl1;
    }

    public User(String levelChoice) {
        this.levelChoice = levelChoice;
    }

    public User(View view) {

    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getPass1() {
        return pass1;
    }

    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getBirth1() {
        return birth1;
    }

    public void setBirth1(String birth1) {
        this.birth1 = birth1;
    }

    public String getEdu1() {
        return edu1;
    }

    public void setEdu1(String edu1) {
        this.edu1 = edu1;
    }

    public String getGen1() {
        return gen1;
    }

    public void setGen1(String gen1) {
        this.gen1 = gen1;
    }

    public String getLvl1() {
        return lvl1;
    }

    public void setLvl1(String lvl1) {
        this.lvl1 = lvl1;
    }
}


