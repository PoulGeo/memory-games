package com.example.memorygames;

public class Score_Calculator {

    public long start, end, diff , new_est;
    public int est_time;
    double easy_points=10, medium_points=20, hard_ponts=40;
    public double pososto, score;
    Double easy_score, medium_score, hard_score;


    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public Double getEasy_Score(long start, long end, int est_time){
        this.start=start;
        this.end=end;
        this.est_time=est_time;

        diff =end-start;
        pososto = diff/(est_time*1000);
        easy_score = easy_points*(1-pososto);

        return easy_score;
    }

    public Double getMedium_score(long start, long end, int est_time){
        this.start=start;
        this.end=end;
        this.est_time=est_time;

        diff =end-start;
        pososto = diff/(est_time*1000);
        medium_score = medium_points*(1-pososto);

        return  medium_score;
    }

    public Double getHard_score(long start, long end, int est_time){
        this.start=start;
        this.end=end;
        this.est_time=est_time;

        diff =end-start;
        pososto = diff/(est_time*1000);
        hard_score = hard_ponts*(1-pososto);

        return  hard_score;
    }

}
