package JavaTeamProject;

public class Movie {
    private String title; //영화 제목

    private String release; //영화 개봉일

    private int runningTime; // 영화 러닝타임

    private int attendance; //영화 관객수

    private double rating; //영화 평점

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie [" +
                "영화제목 = <" + title + ">" +
                ", 개봉일 = " + release +
                ", 러닝타임 = " + runningTime + "분" +
                ", 관객수 = " + attendance + "만 명" +
                ", 평점 = ★" + rating + "]";
    }
}
