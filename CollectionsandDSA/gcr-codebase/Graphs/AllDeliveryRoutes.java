package CollectionsandDSA.gcr_codebase.Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllDeliveryRoutes {
    public List<List<Integer>> allRoutes(Map<Integer, List<Integer>> roads, int current, int target) {
        List<List<Integer>> allRoutes = new ArrayList<>();
        allRoutesDfs(roads, current, target, new ArrayList<>(), new HashSet<>(), allRoutes);
        return allRoutes;
    }

    private void allRoutesDfs(Map<Integer, List<Integer>> roads, int current, int target,
                              List<Integer> path, Set<Integer> visited, List<List<Integer>> allRoutes) {
        path.add(current);
        visited.add(current);

        if (current == target) {
            allRoutes.add(new ArrayList<>(path));
        } else {
            for (int next : roads.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(next)) {
                    allRoutesDfs(roads, next, target, path, visited, allRoutes);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }
}