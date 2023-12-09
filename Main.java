public class Main {
    public static void main(String[] args) {

        TeamsTreeByFacultyId tree = new TeamsTreeByFacultyId();
        // Create some sample Faculty objects to insert into the tree
        Faculty f1 = new Faculty(1, "Computer Science");
        Faculty f2 = new Faculty(2, "Business");
        Faculty f3 = new Faculty(3, "Engineering");
        Faculty f4 = new Faculty(4, "Arts");
        Faculty f5 = new Faculty(5, "Education");

        // Insert the Faculty objects into the tree
        tree.Insert(new facultyTeamNode(f1));
        tree.Insert(new facultyTeamNode(f2));
        tree.Insert(new facultyTeamNode(f3));
        tree.Insert(new facultyTeamNode(f4));
        tree.Insert(new facultyTeamNode(f5));

        TeamsTreeByPoints tree2 = new TeamsTreeByPoints();

        // create some team nodes to insert into the tree
        teamPointsNode team1 = new teamPointsNode(1, f1, null);
        teamPointsNode team2 = new teamPointsNode(2, f2, null);
        teamPointsNode team3 = new teamPointsNode(2, f3, null);
        teamPointsNode team4 = new teamPointsNode(4, f4, null);

        // insert the teams into the tree
        tree2.Insert(team1);
        tree2.Insert(team2);
        tree2.Insert(team3);
        tree2.Insert(team4);


        PlayersTreeByGoals tree3 = new PlayersTreeByGoals();

        // create some team nodes to insert into the tree
        playerGoalNode teamA = new playerGoalNode(1, new Player(5, "constanta"), null);
        playerGoalNode teamB = new playerGoalNode(2, new Player(5, "omri_nznzim"), null);
        playerGoalNode teamC = new playerGoalNode(2, new Player(5, "baaaaaaaaaa"), null);
        playerGoalNode teamD = new playerGoalNode(4, new Player(5, "za_kal_mboa_lmdmah"), null);

        // insert the teams into the tree
        tree3.Insert(teamA);
        tree3.Insert(teamB);
        tree3.Insert(teamC);
        tree3.Insert(teamD);
    }
}
