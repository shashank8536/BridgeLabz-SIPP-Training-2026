import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSkillAssignment {
    
    public static void findTeams(int[] skills, int target, int index, List<Integer> currentTeam) {
        if (target == 0) {
            System.out.println(currentTeam);
            return;
        }
        if (target < 0 || index == skills.length) {
            return;
        }

        currentTeam.add(skills[index]);
        findTeams(skills, target - skills[index], index + 1, currentTeam);
        
        currentTeam.remove(currentTeam.size() - 1);
        findTeams(skills, target, index + 1, currentTeam);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        
        int[] skills = new int[n];
        System.out.println("Enter skill scores:");
        for (int i = 0; i < n; i++) {
            skills[i] = sc.nextInt();
        }
        
        System.out.print("Enter target score: ");
        int target = sc.nextInt();
        
        System.out.println("Output:");
        findTeams(skills, target, 0, new ArrayList<>());
        
        sc.close();
    }
}
