package CollectionsandDSA.gcr_codebase.Hashing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSessionTokenDetector {
    public boolean hasDuplicateToken(String[] tokens) {
        if (tokens == null || tokens.length < 2) {
            return false;
        }

        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }
}