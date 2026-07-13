interface TextModeration {
    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Text moderation policy: avoid offensive content.");
    }
}

interface SpamDetection {
    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam detection policy: avoid suspicious content.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    public static boolean containsRestrictedWords(String post) {
        String lower = post.toLowerCase();
        return lower.contains("spam") || lower.contains("hate") || lower.contains("abuse");
    }

    @Override
    public boolean isOffensive(String post) {
        String lower = post.toLowerCase();
        return lower.contains("hate") || lower.contains("abuse");
    }

    @Override
    public boolean isSpam(String post) {
        String lower = post.toLowerCase();
        return lower.contains("buy now") || lower.contains("click here");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationPlatform {
    public static void main(String[] args) {
        ContentModerator moderator = new ContentModerator();
        String[] posts = {
                "Hello there, nice day!",
                "Buy now and get rich!",
                "This is hate speech",
                "This post contains abuse"
        };

        moderator.displayModerationPolicy();

        for (String post : posts) {
            if (moderator.isSpam(post)) {
                System.out.println(post + " -> spam");
            } else if (moderator.isOffensive(post)) {
                System.out.println(post + " -> offensive");
            } else {
                System.out.println(post + " -> valid");
            }
        }
    }
}
