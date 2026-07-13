interface StreamingService {
    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription active.");
    }
}

interface GamingService {
    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription active.");
    }
}

class SmartTV implements StreamingService, GamingService {
    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing game: " + game);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServiceSmartTV {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        String[] movies = {"Inception", "Interstellar"};
        String[] games = {"Chess", "Tetris"};

        tv.showSubscriptionDetails();
        for (String movie : movies) {
            tv.streamMovie(movie);
        }
        for (String game : games) {
            tv.playGame(game);
        }
    }
}
