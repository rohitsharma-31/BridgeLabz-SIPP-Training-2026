import java.util.ArrayList;
import java.util.List;

public class EmployeeSkillAssignment {
    public static List<List<Integer>> findTeams(int[] skills, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findTeams(skills, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findTeams(int[] skills, int remaining, int index, List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (index >= skills.length || remaining < 0) {
            return;
        }

        // Include the current skill score
        current.add(skills[index]);
        findTeams(skills, remaining - skills[index], index + 1, current, result);
        current.remove(current.size() - 1);

        // Exclude the current skill score
        findTeams(skills, remaining, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;
        List<List<Integer>> teams = findTeams(skills, target);

        for (List<Integer> team : teams) {
            System.out.println(team);
        }
    }
}
